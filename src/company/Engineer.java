package company;

import java.util.Arrays;

public class Engineer extends Employee{

    private String[]skills;

    public Engineer(String name, double salary, String department, String[] skills) {
        super(name, salary, department);
        this.skills = skills;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
    public void addSkills(String skill){
        int n=skills.length;
        String[] newSkills= Arrays.copyOf(skills,n+1);
        newSkills[n]=skill;

        this.skills=newSkills;
    }

    @Override
    public String toString() {
        return "Engineer "+super.toString() +
                "skills=" + Arrays.toString(skills)
                ;
    }
}
