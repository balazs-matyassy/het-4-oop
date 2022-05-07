package hu.progmatic.school;

public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("Józsi", 4.5), new Student("Pista", 4.6)};
        // School school = new School("Progmatic", new Student("Józsi", 4.5), new Student("Pista", 4.6));
        School school = new School("Progmatic", students);
        System.out.println(school);
    }
}
