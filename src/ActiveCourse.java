public class ActiveCourse {

    String courseName;
    String courseType;
    public ActiveCourse() {

    }

    public ActiveCourse(String courseName, String courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public void Add() {
        System.out.println("Kurs Eklendi");
    }

    public void Delete() {
        System.out.println("Kurs Silindi");
    }



}
