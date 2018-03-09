package cn.edu.tust.pojo;

public class DataTeacher {
    private int id;
    private String teacher_name;
    private String teacher_title;
    private String teacher_course;
    private String teacher_resume;

    public int getId() {
        return id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public String getTeacher_title() {
        return teacher_title;
    }

    public String getTeacher_course() {
        return teacher_course;
    }

    public String getTeacher_resume() {
        return teacher_resume;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public void setTeacher_title(String teacher_title) {
        this.teacher_title = teacher_title;
    }

    public void setTeacher_course(String teacher_course) {
        this.teacher_course = teacher_course;
    }

    public void setTeacher_resume(String teacher_resume) {
        this.teacher_resume = teacher_resume;
    }

    @Override
    public String toString() {
        return "DataTeacher{" +
                "id=" + id +
                ", teacher_name='" + teacher_name + '\'' +
                ", teacher_title='" + teacher_title + '\'' +
                ", teacher_course='" + teacher_course + '\'' +
                ", teacher_resume='" + teacher_resume + '\'' +
                '}';
    }
}
