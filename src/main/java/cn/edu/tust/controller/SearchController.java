package cn.edu.tust.controller;

import cn.edu.tust.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@CrossOrigin(maxAge = 3600)
public class SearchController {

    @Autowired
    @Qualifier("searchService")
    private SearchService searchService;

    @ResponseBody
    @RequestMapping(value = "/searchclass/{class_id}", produces = "text/html;charset=UTF-8")
    public String searchclass(@PathVariable("class_id") String class_id) throws Exception {
        return searchService.searchClass(class_id);
    }

    @ResponseBody
    @RequestMapping(value = "/searchpe", produces = "text/html;charset=UTF-8")
    public String searchpe() throws Exception {
        return searchService.searchPE();
    }

    @ResponseBody
    @RequestMapping(value = "/searchgeneral", produces = "text/html;charset=UTF-8")
    public String searchgeneral() throws Exception {
        return searchService.searchGeneral();
    }

    @ResponseBody
    @RequestMapping(value = "/searchlevel/{student_id}", produces = "text/html;charset=UTF-8")
    public String searchlevel(@PathVariable("student_id") String student_id) throws Exception {
        return searchService.searchLevel(student_id);
    }

    @ResponseBody
    @RequestMapping(value = "/searchenglish", produces = "text/html;charset=UTF-8")
    public String searchenglish() throws Exception {
        return searchService.searchEnglish();
    }

    @ResponseBody
    @RequestMapping(value = "/searchcomputer", produces = "text/html;charset=UTF-8")
    public String searchcomputer() throws Exception {
        return searchService.searchComputer();
    }

    @ResponseBody
    @RequestMapping(value = "/searchteacher", produces = "text/html;charset=UTF-8")
    public String searchteacher() throws Exception {
        return searchService.searchTeacher();
    }

}
