import java.util.List;

public abstract class StudentBuilder {

    String name;
    int rollNo;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    abstract StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
}
