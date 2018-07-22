package lab4polymorphism.model;

public class Course {

    private String id;
    private String title;
    private int duration;
    private int price;

    public Course() {

    }

    public Course(String id, String title, int duration, int price) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
