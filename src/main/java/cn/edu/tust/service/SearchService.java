package cn.edu.tust.service;


public interface SearchService {
    String searchClass(String class_id);
    String searchPE();
    String searchGeneral();
    String searchLevel(String student_id);
    String searchEnglish();
    String searchComputer();
    String searchTeacher();
}
