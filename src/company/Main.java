package company;

public class Main {
    public static void main(String[] args) {
        String[]skills={};
        Employee hamad = new Employee("Hamad",2600,"Digital department");
        Manager ali = new Manager("Ali",3000,"Digital department",4);
        Intern mohammed = new Intern("Mohammed",500,"Digital department","Purdue University");
        Engineer salem = new Engineer("Salem",2000,"Engineering Solution",skills);
        Director sam = new Director("Sam",3000,"Engineering",200000);
        SalesPerson fajri = new SalesPerson("Fajri",2000,"Marketing",5000);
        salem.addSkills("React");
        System.out.println(hamad);
        System.out.println(ali);
        System.out.println(mohammed);
        System.out.println(salem);
        salem.addSkills("Java");
        System.out.println(salem);
        System.out.println(sam);
        System.out.println(fajri);
    }
}