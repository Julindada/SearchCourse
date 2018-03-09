package cn.edu.tust.pojo;

public class CourseGeneral {
    private int id;
    private String campus;
    private String course_id;
    private String course_num;
    private String course_times;
    private String course_class;
    private String week;
    private String lesson;
    private String classroom;
    private String property;
    private String course_name;
    private String course_teacher;
    private String start_stop_week;
    private String credit;
    private String course_period;
    private String course_limit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampus() {
        return campus;
    }

    public String getCourse_id() {
        return course_id;
    }

    public String getCourse_num() {
        return course_num;
    }

    public String getCourse_times() {
        return course_times;
    }

    public String getCourse_class() {
        return course_class;
    }

    public String getWeek() {
        return week;
    }

    public String getLesson() {
        return lesson;
    }

    public String getClassroom() {
        return classroom;
    }

    public String getProperty() {
        return property;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getCourse_teacher() {
        return course_teacher;
    }

    public String getStart_stop_week() {
        return start_stop_week;
    }

    public String getCredit() {
        return credit;
    }

    public String getCourse_period() {
        return course_period;
    }

    public String getCourse_limit() {
        return course_limit;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public void setCourse_num(String course_num) {
        this.course_num = course_num;
    }

    public void setCourse_times(String course_times) {
        this.course_times = course_times;
    }

    public void setCourse_class(String course_class) {
        this.course_class = course_class;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCourse_teacher(String course_teacher) {
        this.course_teacher = course_teacher;
    }

    public void setStart_stop_week(String start_stop_week) {
        this.start_stop_week = start_stop_week;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public void setCourse_period(String course_period) {
        this.course_period = course_period;
    }

    public void setCourse_limit(String course_limit) {
        this.course_limit = course_limit;
    }

    @Override
    public String toString() {
        return "CourseGeneral{" +
                "id=" + id +
                ", campus='" + campus + '\'' +
                ", course_id='" + course_id + '\'' +
                ", course_num='" + course_num + '\'' +
                ", course_times='" + course_times + '\'' +
                ", course_class='" + course_class + '\'' +
                ", week='" + week + '\'' +
                ", lesson='" + lesson + '\'' +
                ", classroom='" + classroom + '\'' +
                ", property='" + property + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_teacher='" + course_teacher + '\'' +
                ", start_stop_week='" + start_stop_week + '\'' +
                ", credit='" + credit + '\'' +
                ", course_period='" + course_period + '\'' +
                ", course_limit='" + course_limit + '\'' +
                '}';
    }
}
