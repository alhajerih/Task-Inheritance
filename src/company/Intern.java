package company;

public class Intern extends Employee{
    private String university;

    public Intern(String name, double salary, String department, String university) {
        super(name, salary, department);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Intern "+super.toString() +
                "University= " + university
                ;
    }
}
