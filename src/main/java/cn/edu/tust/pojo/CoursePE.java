package cn.edu.tust.pojo;

public class CoursePE {
    private int id;
    private String grade;
    private String faculty;
    private String course_id;
    private String course_num;
    private String course_name;
    private String course_teacher;
    private String week;
    private String lesson;
    private String start_stop_week;
    private String campus;
    private String course_capacity;

    public int getId() {
        return id;
    }

    public String getGrade() {
        return grade;
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

    public String getWeek() {
        return week;
    }

    public String getLesson() {
        return lesson;
    }

    public String getStart_stop_week() {
        return start_stop_week;
    }

    public String getCampus() {
        return campus;
    }

    public String getCourse_capacity() {
        return course_capacity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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

    public void setWeek(String week) {
        this.week = week;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void setStart_stop_week(String start_stop_week) {
        this.start_stop_week = start_stop_week;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setCourse_capacity(String course_capacity) {
        this.course_capacity = course_capacity;
    }

    @Override
    public String toString() {
        return "CoursePE{" +
                "id=" + id +
                ", grade='" + grade + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course_id='" + course_id + '\'' +
                ", course_num='" + course_num + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_teacher='" + course_teacher + '\'' +
                ", week='" + week + '\'' +
                ", lesson='" + lesson + '\'' +
                ", start_stop_week='" + start_stop_week + '\'' +
                ", campus='" + campus + '\'' +
                ", course_capacity='" + course_capacity + '\'' +
                '}';
    }
}
