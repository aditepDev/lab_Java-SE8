package lab3oop.test;

import lab3oop.model.Course;
import lab3oop.model.Student;

public class TestCourse {
    public static void main(String[] args) {

        Course java = new Course("123","Java SE8 Programming",5,40000);
        Student std1 = new Student(123,"jack","kuku","jack@gmail.com","0800000000","A");
        std1.setCourse(java);
        System.out.println("Student ID : "+ std1.getName());
        System.out.println("Register Course : "+ std1.getCourse().getTitle());
        System.out.println("Learning  days : "+ std1.getCourse().getDuration());
        System.out.println("Please Contact : "+ std1.getEmail());

    }
}
