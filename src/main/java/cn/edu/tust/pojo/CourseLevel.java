package cn.edu.tust.pojo;

public class CourseLevel {
    private int id;
    private String faculty;
    private String class_id;
    private String student_id;
    private String student_name;
    private String course_level;
    private String remark;

    public int getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getClass_id() {
        return class_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getCourse_level() {
        return course_level;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setCourse_level(String course_level) {
        this.course_level = course_level;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "CourseLevel{" +
                "id=" + id +
                ", faculty='" + faculty + '\'' +
                ", class_id='" + class_id + '\'' +
                ", student_id='" + student_id + '\'' +
                ", student_name='" + student_name + '\'' +
                ", course_level='" + course_level + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
