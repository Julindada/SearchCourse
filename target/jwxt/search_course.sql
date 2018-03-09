CREATE DATABASE search_course
  CHARACTER SET utf8;

USE search_course;

CREATE TABLE course_class
(
  id          INT NOT NULL AUTO_INCREMENT,
  class_id    VARCHAR(10) COMMENT '班级',
  course_id   VARCHAR(15) COMMENT '课程号',
  course_num  VARCHAR(5) COMMENT '课序号',
  course_name VARCHAR(50) COMMENT '课程名',
  course_prop VARCHAR(10) COMMENT '课程属性',
  PRIMARY KEY (id)
)
  COMMENT = '班级选课表';
CREATE TABLE course_pe
(
  id              INT NOT NULL AUTO_INCREMENT,
  grade           CHAR(4) COMMENT '年级',
  faculty         VARCHAR(30) COMMENT '学院',
  course_id       VARCHAR(15) COMMENT '课程号',
  course_num      VARCHAR(5) COMMENT '课序号',
  course_name     VARCHAR(15) COMMENT '课程名',
  course_teacher  VARCHAR(10) COMMENT '教师',
  week            VARCHAR(5) COMMENT '星期',
  lesson          VARCHAR(5) COMMENT '节次',
  start_stop_week VARCHAR(10) COMMENT '起止周',
  campus          VARCHAR(5) COMMENT '校区',
  course_capacity VARCHAR(5) COMMENT '课容量',
  PRIMARY KEY (id)
)
  COMMENT = '体育课表';
CREATE TABLE course_general
(
  id              INT NOT NULL AUTO_INCREMENT,
  campus          VARCHAR(20) COMMENT '校区',
  course_id       VARCHAR(15) COMMENT '课程号',
  course_num      VARCHAR(5) COMMENT '课序号',
  course_times    VARCHAR(5) COMMENT '课次',
  course_class    VARCHAR(50) COMMENT '班级',
  week            VARCHAR(5) COMMENT '星期',
  lesson          VARCHAR(5) COMMENT '节次',
  classroom       VARCHAR(50) COMMENT '教室',
  property        VARCHAR(30) COMMENT '课程属性',
  course_name     VARCHAR(50) COMMENT '课程名',
  course_teacher  VARCHAR(10) COMMENT '教师',
  start_stop_week VARCHAR(10) COMMENT '起止周',
  credit          VARCHAR(5) COMMENT '学分',
  course_period   VARCHAR(5) COMMENT '学时',
  course_limit    VARCHAR(200) COMMENT '选课限制（必看）',
  PRIMARY KEY (id)
)
  COMMENT = '通识课表';

CREATE TABLE course_level
(
  id           INT NOT NULL AUTO_INCREMENT,
  faculty      VARCHAR(10) COMMENT '学院',
  class_id     VARCHAR(10) COMMENT '班级',
  student_id   VARCHAR(15) COMMENT '学生学号',
  student_name VARCHAR(10) COMMENT '学生姓名',
  course_level VARCHAR(30) COMMENT '英语、计算机课程级别',
  remark       VARCHAR(200) COMMENT '备注',
  PRIMARY KEY (id)
)
  COMMENT = '英语、计算机分级课表';

CREATE TABLE course_english
(
  id             INT NOT NULL AUTO_INCREMENT,
  faculty        VARCHAR(200) COMMENT '学院',
  course_id      VARCHAR(15) COMMENT '课程号',
  course_num     VARCHAR(5) COMMENT '课序号',
  course_name    VARCHAR(15) COMMENT '课程名',
  course_teacher VARCHAR(10) COMMENT '教师',
  remark         VARCHAR(200) COMMENT '备注',
  PRIMARY KEY (id)
)
  COMMENT = '英语分级课表';

CREATE TABLE course_computer
(
  id             INT NOT NULL AUTO_INCREMENT,
  faculty        VARCHAR(200) COMMENT '学院',
  course_id      VARCHAR(15) COMMENT '课程号',
  course_num     VARCHAR(5) COMMENT '课序号',
  course_name    VARCHAR(15) COMMENT '课程名',
  course_teacher VARCHAR(10) COMMENT '教师',
  remark         VARCHAR(200) COMMENT '备注',
  PRIMARY KEY (id)
)
  COMMENT = '计算机分级课表';

CREATE TABLE data_teacher
(
  id             INT NOT NULL AUTO_INCREMENT,
  teacher_name   VARCHAR(10) COMMENT '教师姓名',
  teacher_title  VARCHAR(10) COMMENT '职称',
  teacher_course VARCHAR(100) COMMENT '主讲课程',
  teacher_resume VARCHAR(300) COMMENT '个人介绍',
  PRIMARY KEY (id)
)
  COMMENT = '教师资料';

CREATE TABLE user
(
  id       INT         NOT NULL AUTO_INCREMENT,
  username VARCHAR(20) NOT NULL
  COMMENT '管理员用户名',
  password VARCHAR(20) NOT NULL
  COMMENT '管理员密码',
  PRIMARY KEY (id)
)
COMMENT = '管理员表';