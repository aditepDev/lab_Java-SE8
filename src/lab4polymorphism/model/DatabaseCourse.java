package lab4polymorphism.model;

public class DatabaseCourse extends Course {
    public DatabaseCourse() {
    }

    public DatabaseCourse(String id, String title, int duration, int price) {
        super(id, title, duration, price);
    }
}
