package lab4polymorphism.test;

import lab4polymorphism.model.*;

public class test {
    public static void main(String[] args) {
        Course[] courses = new Course[3];
        Student std1 = new Student(123,"jack","kuku","jack@gmail.com","0800000000","A");
        courses[0] = new ProgrammingCourse("111","Java SE8 Programming",5,40000);
        courses[1] = new DatabaseCourse("222","Oracle database",4,50000);
        courses[2] = new WebCourse("333","HTML5&CSS",5,20000);

        std1.addCourse(courses);

        for (Course allCourse :std1.getAllCourses()){
            System.out.println("Student ID : "+ std1.getName());
            System.out.println("Register Course : " + allCourse.getTitle());
            System.out.println("Learning  days : " + allCourse.getDuration());
            System.out.println("Please Contact : " + std1.getEmail());
            System.out.println("-------------------------------------");
        }
    }
}
