package cn.edu.tust.pojo;

public class CourseComputer {
    private int id;
    private String faculty;
    private String course_id;
    private String course_num;
    private String course_name;
    private String course_teacher;
    private String remark;

    public int getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
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

    public String getCourse_teacher() {
        return course_teacher;
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

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public void setCourse_num(String course_num) {
        this.course_num = course_num;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCourse_teacher(String course_teacher) {
        this.course_teacher = course_teacher;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "CourseComputer{" +
                "id=" + id +
                ", faculty='" + faculty + '\'' +
                ", course_id='" + course_id + '\'' +
                ", course_num='" + course_num + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_teacher='" + course_teacher + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
