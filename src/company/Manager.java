package company;

public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, double salary, String department, int teamSize) {
        super(name, salary, department);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager "+super.toString() +
                "Team Size = " + teamSize;
    }
}
