public class Main {
    public static void main(String[] args) {
        Director director = new Director(new EngineeringStudentBuilder());
        Student engineeringStudent = director.createStudent();
        System.out.println(engineeringStudent);

        Director director2 = new Director(new MbaStudentBuilder());
        Student mbaStudent = director2.createStudent();
        System.out.println(mbaStudent);

    }
}