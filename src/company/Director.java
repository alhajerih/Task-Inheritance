package company;

public class Director extends Employee{
    private double budget;

    public Director(String name, double salary, String department, double budget) {
        super(name, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Director "+ super.toString() +
                "Budget = " + budget ;
    }
}
