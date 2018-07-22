package lab6singleton.manager;

import lab6singleton.dao.Course;
import lab6singleton.dao.Student;

public class TrainingManager {
    private static TrainingManager instance;
    private static int totalStudents = 0;
    private static int totalCourse = 0;
    public static TrainingManager getInstance(){
        if(instance == null)
            instance = new TrainingManager();
            return instance;
    }
    private TrainingManager(){

    }


    public Student createNewStudent(Student student) {
        totalStudents++;
        return new Student(student);
    }

    public Course createNewCourse(Course course) {
        totalCourse++;
        return new Course(course);
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static int getTotalCourse() {
        return totalCourse;
    }
}
