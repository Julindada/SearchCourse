package cn.edu.tust.service.impl;

import cn.edu.tust.mapper.UserMapper;
import cn.edu.tust.pojo.*;
import cn.edu.tust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.save(user);
    }

    @Override
    public User login(String username, String password) {
        return userMapper.findWithUsernameAndPassword(username, password);
    }

    @Override
    public User isExist(String username) {
        return userMapper.findWithUsername(username);
    }

    @Override
    public void uploadClassService(CourseClass courseClass) {
        userMapper.uploadClass(courseClass);
    }

    @Override
    public void uploadPEService(CoursePE coursePE) {
        userMapper.uploadPE(coursePE);
    }

    @Override
    public void uploadGeneralService(CourseGeneral courseGeneral) {
        userMapper.uploadGeneral(courseGeneral);
    }

    @Override
    public void uploadLevelService(CourseLevel courseLevel) {
        userMapper.uploadLevel(courseLevel);
    }

    @Override
    public void uploadEnglishService(CourseEnglish courseEnglish) {
        userMapper.uploadEnglish(courseEnglish);
    }

    @Override
    public void uploadComputerService(CourseComputer courseComputer) {
        userMapper.uploadComputer(courseComputer);
    }

    @Override
    public void uploadTeacherService(DataTeacher dataTeacher) {
        userMapper.uploadTeacher(dataTeacher);
    }

    @Override
    public void clearClass() {
        userMapper.deleteClass();

    }

    @Override
    public void clearPE() {
        userMapper.deletePE();

    }

    @Override
    public void clearGeneral() {
        userMapper.deleteGeneral();

    }

    @Override
    public void clearLevel() {
        userMapper.deleteLevel();

    }

    @Override
    public void clearEnglish() {
        userMapper.deleteEnglish();

    }

    @Override
    public void clearComputer() {
        userMapper.deleteComputer();

    }

    @Override
    public void clearTeacher() {
        userMapper.deleteTeacher();

    }
}
