package cn.edu.tust.controller;

import cn.edu.tust.mapper.ExcelMapper;
import cn.edu.tust.pojo.*;
import cn.edu.tust.service.UserService;
import cn.edu.tust.utils.ExcelUtil;
import cn.edu.tust.utils.JwtUtil;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@CrossOrigin(maxAge = 3600)
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login")
    public String logIn(@RequestParam String username, @RequestParam String password, HttpServletResponse response) throws Exception {
        User isUser = userService.login(username, password);
        if (isUser != null) {
            response.setStatus(200);
            return "{\"tokens\":" + "\"" + new JwtUtil().createJWT(3600000) + "\"" + "}";//3,600,000毫秒=3,600秒=1小时
        } else {
            response.setStatus(401);
            return null;
        }
    }

    @RequestMapping(value = "/upload")
    public void upload(HttpServletRequest request,@RequestParam("file") MultipartFile mFile, HttpServletResponse response) throws IOException {
        parseJWT(request.getHeader("Authorization"));
        //获取文件流
        InputStream inputStream = mFile.getInputStream();
        //检查是否为空
        if (null == inputStream) {
            response.setStatus(400);
        }

        try {
            String s= request.getParameter("key");
            if (s.equals("uploadclass")) {
                System.out.println("uploadclass");
                userService.clearClass();
                List<CourseClass> list = ExcelUtil.getCourseClass(inputStream, mFile.getOriginalFilename());
                for (CourseClass cc : list) {
                    userService.uploadClassService(cc);
                }
            } else if (s.equals("uploadpe")){
                System.out.println("uploadpe");
                userService.clearPE();
                List<CoursePE> list = ExcelUtil.getCoursePE(inputStream, mFile.getOriginalFilename());
                for (CoursePE cp : list) {
                    userService.uploadPEService(cp);
                }
            }else if (s.equals("uploadgeneral")){
                System.out.println("uploadgeneral");
                userService.clearGeneral();
                List<CourseGeneral> list = ExcelUtil.getCourseGeneral(inputStream, mFile.getOriginalFilename());
                for (CourseGeneral cg : list) {
                    userService.uploadGeneralService(cg);
                }
            }else if (s.equals("uploadlevel")){
                System.out.println("uploadlevel");
                userService.clearLevel();
                List<CourseLevel> list = ExcelUtil.getCourseLevel(inputStream, mFile.getOriginalFilename());
                for (CourseLevel cl : list) {
                    userService.uploadLevelService(cl);
                }
            }else if (s.equals("uploadenglish")){
                System.out.println("uploadenglish");
                userService.clearEnglish();
                List<CourseEnglish> list = ExcelUtil.getCourseEnglish(inputStream, mFile.getOriginalFilename());
                for (CourseEnglish ce : list) {
                    userService.uploadEnglishService(ce);
                }
            }else if (s.equals("uploadcomputer")){
                System.out.println("uploadcomputer");
                userService.clearComputer();
                List<CourseComputer> list = ExcelUtil.getCourseComputer(inputStream, mFile.getOriginalFilename());
                for (CourseComputer cc : list) {
                    userService.uploadComputerService(cc);
                }
            }else if (s.equals("uploadteacher")){
                System.out.println("uploadteacher");
                userService.clearTeacher();
                List<DataTeacher> list = ExcelUtil.getDataTeacher(inputStream, mFile.getOriginalFilename());
                for (DataTeacher dt : list) {
                    userService.uploadTeacherService(dt);
                }
            }else {
                response.setStatus(400);
                return;
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/uploadclass")
    public void upclass(HttpServletRequest request, @RequestParam("file") MultipartFile mFile, HttpServletResponse response) throws IOException {
        parseJWT(request.getHeader("Authorization"));
        //获取文件流
        InputStream inputStream = mFile.getInputStream();
        //检查是否为空
        if (null == inputStream) {
            response.setStatus(400);
            return;
        }
        try {
            userService.clearClass();
            List<CourseClass> list = ExcelUtil.getCourseClass(inputStream, mFile.getOriginalFilename());
            for (CourseClass cc : list) {
                userService.uploadClassService(cc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/uploadpe")
    public void uppe(HttpServletRequest request, @RequestParam("file") MultipartFile mFile, HttpServletResponse response) throws IOException {
        parseJWT(request.getHeader("Authorization"));
        //获取文件流
        InputStream inputStream = mFile.getInputStream();
        //检查是否为空
        if (null == inputStream) {
            response.setStatus(400);
            return;
        }
        try {
            userService.clearPE();
            List<CoursePE> list = ExcelUtil.getCoursePE(inputStream, mFile.getOriginalFilename());
            for (CoursePE cp : list) {
                userService.uploadPEService(cp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/uploadgeneral")
    public void upgeneral(HttpServletRequest request, @RequestParam("file") MultipartFile mFile, HttpServletResponse response) throws IOException {
        parseJWT(request.getHeader("Authorization"));
        //获取文件流
        InputStream inputStream = mFile.getInputStream();
        //检查是否为空
        if (null == inputStream) {
            response.setStatus(400);
            return;
        }
        try {
            userService.clearGeneral();
            List<CourseGeneral> list = ExcelUtil.getCourseGeneral(inputStream, mFile.getOriginalFilename());
            for (CourseGeneral cg : list) {
                userService.uploadGeneralService(cg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/uploadlevel")
    public void uplevel(HttpServletRequest request, @RequestParam("file") MultipartFile mFile, HttpServletResponse response) throws IOException {
        parseJWT(request.getHeader("Authorization"));
        //获取文件流
        InputStream inputStream = mFile.getInputStream();
        //检查是否为空
        if (null == inputStream) {
            response.setStatus(400);
            return;
        }
        try {
            userService.clearLevel();
            List<CourseLevel> list = ExcelUtil.getCourseLevel(inputStream, mFile.getOriginalFilename());
            for (CourseLevel cl : list) {
                userService.uploadLevelService(cl);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/uploadenglish")
    public void upenglish(HttpServletRequest request, @RequestParam("file") MultipartFile mFile, HttpServletResponse response) throws IOException {
        parseJWT(request.getHeader("Authorization"));
        //获取文件流
        InputStream inputStream = mFile.getInputStream();
        //检查是否为空
        if (null == inputStream) {
            response.setStatus(400);
            return;
        }
        try {
            userService.clearEnglish();
            List<CourseEnglish> list = ExcelUtil.getCourseEnglish(inputStream, mFile.getOriginalFilename());
            for (CourseEnglish ce : list) {
                userService.uploadEnglishService(ce);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/uploadcomputer")
    public void upcomputer(HttpServletRequest request, @RequestParam("file") MultipartFile mFile, HttpServletResponse response) throws IOException {
        parseJWT(request.getHeader("Authorization"));
        //获取文件流
        InputStream inputStream = mFile.getInputStream();
        //检查是否为空
        if (null == inputStream) {
            response.setStatus(400);
            return;
        }
        try {
            userService.clearComputer();
            List<CourseComputer> list = ExcelUtil.getCourseComputer(inputStream, mFile.getOriginalFilename());
            for (CourseComputer cc : list) {
                userService.uploadComputerService(cc);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/uploadteacher")
    public void upteacher(HttpServletRequest request, @RequestParam("file") MultipartFile mFile, HttpServletResponse response) throws IOException {
        parseJWT(request.getHeader("Authorization"));
        //获取文件流
        InputStream inputStream = mFile.getInputStream();
        //检查是否为空
        if (null == inputStream) {
            response.setStatus(400);
            return;
        }
        try {
            userService.clearTeacher();
            List<DataTeacher> list = ExcelUtil.getDataTeacher(inputStream, mFile.getOriginalFilename());
            for (DataTeacher dt : list) {
                userService.uploadTeacherService(dt);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "Hello World!");
        modelAndView.setViewName("welcome");
        return modelAndView;
    }

    @RequestMapping(value = "/checkjwt")
    public void joinUs(HttpServletRequest request, HttpServletResponse response) throws Exception {
        parseJWT(request.getHeader("Authorization"));
    }

    private void parseJWT(String jwt) {
        try {
            Jwts.parser().setSigningKey(new JwtUtil().generalKey()).parseClaimsJws(jwt);
        } catch (SignatureException e) {
            e.printStackTrace();
        }
    }
}
