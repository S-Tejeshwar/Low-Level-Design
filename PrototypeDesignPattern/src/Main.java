public class Main {
    public static void main(String[] args) {

        Prototype student1 = new Student(21,"tejeshwar");
        System.out.println(student1);
        Prototype student2 = student1.clone();
        System.out.println(student2);

    }
}