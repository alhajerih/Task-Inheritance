package company;

public class SalesPerson extends Employee{

    private int salesTarget;

    public SalesPerson(String name, double salary, String department, int salesTarget) {
        super(name, salary, department);
        this.salesTarget = salesTarget;
    }

    public int getSalesTarget() {
        return salesTarget;
    }

    public void setSalesTarget(int salesTarget) {
        this.salesTarget = salesTarget;
    }
    // Update target
    public void updateSalesTarget(int newTarget){
        this.salesTarget=newTarget;
    }

    @Override
    public String toString() {
        return "SalesPerson "+super.toString() +
                "sales Target = " + salesTarget+" $";
    }
}
