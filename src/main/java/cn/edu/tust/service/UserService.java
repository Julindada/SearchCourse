package cn.edu.tust.service;

import cn.edu.tust.pojo.*;

public interface UserService {
    void addUser(User user);
    User login(String username, String password);
    User isExist(String username);
    void uploadClassService(CourseClass courseClass);
    void uploadPEService(CoursePE coursePE);
    void uploadGeneralService(CourseGeneral courseGeneral);
    void uploadLevelService(CourseLevel courseLevel);
    void uploadEnglishService(CourseEnglish courseEnglish);
    void uploadComputerService(CourseComputer courseComputer);
    void uploadTeacherService(DataTeacher dataTeacher);
    void clearClass();
    void clearPE();
    void clearGeneral();
    void clearLevel();
    void clearEnglish();
    void clearComputer();
    void clearTeacher();
}
