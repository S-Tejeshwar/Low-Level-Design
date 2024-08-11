public class Student implements Prototype {

    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo=rollNo;
        this.name=name;
    }

    public Prototype clone() {
        return new Student(rollNo, name);
    }

    public String toString() {
        return "rollNo : " + rollNo + " name: " + name;
    }
}
