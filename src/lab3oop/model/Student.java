package lab3oop.model;

public class Student extends Course {
    private int idstu;
    private String name;
    private String lastname;
    private String email;
    private String tel;
    private String grade;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    private Course course;
    public Student() {
    }

    public Student(int idstu, String name, String lastname, String email, String tel, String grade) {
        this.idstu = idstu;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.tel = tel;
        this.grade = grade;
    }

    public Student(String id, String title, int duration, int price, int idstu,
                   String name, String lastname, String email, String tel, String grade) {
        super(id, title, duration, price);
        this.idstu = idstu;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.tel = tel;
        this.grade = grade;
    }


    public int getIdstu() {
        return idstu;
    }

    public void setIdstu(int idstu) {
        this.idstu = idstu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
