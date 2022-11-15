public class Company {
    private String name;
    private String address;
    private Course[] courses;
    private String languageOfInstruction;

    public Company(String name, String address, Course[] courses, String languageOfInstruction) {
        this.name = name;
        this.address = address;
        this.courses = courses;
        this.languageOfInstruction = languageOfInstruction;
    }

    public static double income(Student[] students){
        double counter = 0;
        for (Student student:students) {
            counter= student.getContract()+counter;
        }

        return counter;
    }

    public static double salary(Mentor[] mentors){
        double counter = 0;
        for (Mentor mentor: mentors) {
            counter = counter + mentor.getSalary();
        }
        return counter;
    }

    public static double salary1(Instructor[] instructor) {
        double counter = 0;
        for (Instructor instructors:instructor) {
            counter = counter + instructors.getSalary();
        }
        return counter;
    }
}
