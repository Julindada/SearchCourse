package cn.edu.tust.mapper;

import cn.edu.tust.pojo.*;

import java.util.List;

public interface ExcelMapper {
    List<CourseClass> selectClass(String class_id);
    List<CoursePE> selectPE();
    List<CoursePE> selectGeneral();
    List<CourseLevel> selectLevel(String student_id);
    List<CourseEnglish> selectEnglish();
    List<CourseComputer> selectComputer();
    List<DataTeacher> selectTeacher();
}
