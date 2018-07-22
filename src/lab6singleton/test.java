package lab6singleton;

import lab6singleton.dao.Course;
import lab6singleton.dao.Student;
import lab6singleton.manager.TrainingManager;

public class test {
    public static void main(String[] args) {
        TrainingManager tMng = TrainingManager.getInstance();
        for (int i = 0; i < 5; i++) {
            tMng.createNewStudent(new Student("123", "jack",
                    "jack@gmail.com", "080000933"));
            tMng.createNewStudent(new Student("124", "tony",
                    "sdf@gmail.com", "090123213"));
            tMng.createNewStudent(new Student("12ถ", "fony",
                    "fodf@gmail.com", "090122133"));
        }
        tMng.createNewCourse(new Course("333", "java SE8 PROGRAMMING",
                5, 40000));
        tMng.createNewCourse(new Course("4444", "HTML5&CSS",
                5, 20000));

        int totalCourses = tMng.getTotalCourse();
        int totalStudents = tMng.getTotalStudents();

        System.out.println("There are Students in these Taring Center = " + totalStudents);
        System.out.println("There are Courses in these Taring Center = " + totalCourses);
    }

    enum Season {

    }
}
