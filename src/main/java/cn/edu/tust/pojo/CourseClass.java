package cn.edu.tust.pojo;

import java.io.Serializable;

public class CourseClass implements Serializable{
    private int id;
    private String class_id;
    private String course_id;
    private String course_num;
    private String course_name;
    private String course_prop;

    public int getId() {
        return id;
    }

    public String getClass_id() {
        return class_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public String getCourse_num() {
        return course_num;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getCourse_prop() {
        return course_prop;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public void setCourse_num(String course_num) {
        this.course_num = course_num;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCourse_prop(String course_prop) {
        this.course_prop = course_prop;
    }

    @Override
    public String toString() {
        return "CourseClass{" +
                "id=" + id +
                ", class_id='" + class_id + '\'' +
                ", course_id='" + course_id + '\'' +
                ", course_num='" + course_num + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_prop='" + course_prop + '\'' +
                '}';
    }
}
