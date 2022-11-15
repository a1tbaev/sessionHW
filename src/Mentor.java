public class Mentor extends Instructor{

    public Mentor(long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender, salary);
    }


    @Override
    public double period(Group group) {
        return 0;
    }
}
