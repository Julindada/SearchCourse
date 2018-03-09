package cn.edu.tust.mapper;

import cn.edu.tust.pojo.*;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    void save(User user);
    User findWithUsernameAndPassword(@Param("username") String username, @Param("password") String password);
    User findWithUsername(@Param("username") String username);
    void uploadClass(CourseClass courseClass);
    void uploadPE(CoursePE coursePE);
    void uploadGeneral(CourseGeneral courseGeneral);
    void uploadLevel(CourseLevel courseLevel);
    void uploadEnglish(CourseEnglish courseEnglish);
    void uploadComputer(CourseComputer courseComputer);
    void uploadTeacher(DataTeacher dataTeacher);
    void deleteClass();
    void deletePE();
    void deleteGeneral();
    void deleteLevel();
    void deleteEnglish();
    void deleteComputer();
    void deleteTeacher();
}
