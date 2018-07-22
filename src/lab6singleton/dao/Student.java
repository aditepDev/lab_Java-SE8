package lab6singleton.dao;

public class Student {
    private String idStd;
    private String nameStd;
    private String emailStd;

    public Student() {

    }

    public Student(String idStd, String nameStd, String emailStd, String telStd) {
        this.idStd = idStd;
        this.nameStd = nameStd;
        this.emailStd = emailStd;
        this.telStd = telStd;
    }

    public Student(Student student) {
        this.setIdStd(student.idStd);
        this.setNameStd(student.nameStd);
        this.setEmailStd(student.emailStd);
        this.setTelStd(student.telStd);
    }


    public String getIdStd() {
        return idStd;
    }

    public void setIdStd(String idStd) {
        this.idStd = idStd;
    }

    public String getNameStd() {
        return nameStd;
    }

    public void setNameStd(String nameStd) {
        this.nameStd = nameStd;
    }

    public String getEmailStd() {
        return emailStd;
    }

    public void setEmailStd(String emailStd) {
        this.emailStd = emailStd;
    }

    public String getTelStd() {
        return telStd;
    }

    public void setTelStd(String telStd) {
        this.telStd = telStd;
    }

    private String telStd;

}
