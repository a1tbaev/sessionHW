import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(1,"adil aitbaev",12,'M',12000);
        Mentor mentor = new Mentor(2,"Kani Akjoltoi kyzy", 11, 'F',10000);
        Instructor instructor = new Instructor(3,"Mirhat", 13,'M', 10000);

        Student[] students = {student};
        Mentor[] mentors = {mentor};
        Instructor[] instructors = {instructor};

        LocalDate date = LocalDate.of(2022,10,1);
        LocalDate dateOfFinish = LocalDate.of(2023,7,1);


        Group group = new Group("java", students, date,dateOfFinish);
        Group[] groups = {group};

        Course course = new Course("java", groups, instructor,mentors);
        Course[] courses ={course};

        Company company = new Company("peak", "bishkek", courses, "Java");
        System.out.println("contract "+Company.income(students));
        System.out.println("mentors salary "+Company.salary((mentors)));
        System.out.println("instructors salary "+Company.salary1(instructors));

    }
}