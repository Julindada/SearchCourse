package cn.edu.tust.service.impl;

import cn.edu.tust.mapper.ExcelMapper;
import cn.edu.tust.service.SearchService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.tust.pojo.*;

import java.util.List;

@Service("searchService")
public class SearchServiceImpl implements SearchService {

    private Gson gson = new Gson();
    @Autowired
    private ExcelMapper excelMapper;

    @Override
    public String searchClass(String class_id) {
        List<CourseClass> courseClass = excelMapper.selectClass(class_id);
        return gson.toJson(courseClass);
    }

    @Override
    public String searchPE() {
        List<CoursePE> coursePE = excelMapper.selectPE();
        return gson.toJson(coursePE);
    }

    @Override
    public String searchGeneral() {
        List<CoursePE> courseGeneral = excelMapper.selectGeneral();
        return gson.toJson(courseGeneral);
    }

    @Override
    public String searchLevel(String student_id) {
        List<CourseLevel> courseLevel = excelMapper.selectLevel(student_id);
        return gson.toJson(courseLevel);
    }

    @Override
    public String searchEnglish() {
        List<CourseEnglish> courseEnglish = excelMapper.selectEnglish();
        return gson.toJson(courseEnglish);
    }

    @Override
    public String searchComputer() {
        List<CourseComputer> courseComputer = excelMapper.selectComputer();
        return gson.toJson(courseComputer);
    }

    @Override
    public String searchTeacher() {
        List<DataTeacher> dataTeacher = excelMapper.selectTeacher();
        return gson.toJson(dataTeacher);
    }
}
