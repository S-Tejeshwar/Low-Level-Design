import java.util.List;

public class Student {

    String name;
    int rollNo;
    String fatherName;
    String motherName;
    List<String> subjects;


    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.rollNo = studentBuilder.rollNo;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }


    public String toString(){
        return "" + " roll number: " + this.rollNo +
                " name: " + this.name +
                " father name: " + this.fatherName +
                " mother name: " + this.motherName +
                " subjects: " + subjects;
    }


}
