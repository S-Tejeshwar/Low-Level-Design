public class Director {

    StudentBuilder studentBuilder;
    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
          return createEngineeringStudent();
        } else {
           return createMbaStudent();
        }
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setFatherName("Shiva").setMotherName("Radha").setName("Tejeshwar")
                .setRollNo(25).setSubjects().build();
    }

    private Student createMbaStudent() {
        return studentBuilder.setFatherName("Shiva").setMotherName("Radha").setName("Tejeshwar")
                .setRollNo(24).setSubjects().build();
    }
}
