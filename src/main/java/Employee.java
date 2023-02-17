public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String position;
    private int seniority;
    private int experienceAge;

    public Employee(String name, String surname, int salary, String position, int seniority, int experienceAge) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
        this.seniority = seniority;
        this.experienceAge = experienceAge;
    }

    public void increaseSalary() {
        if (this.seniority < 5) {
            this.salary += 300;
        } else {
            this.salary += 500;
        }
    }

    public void updateSeniority(int newSeniority) {
        this.seniority = newSeniority;
    }

    public void updateExperienceAge(int newExperienceAge) {
        this.experienceAge = newExperienceAge;
        if (this.experienceAge < 5) {
            this.salary += 300;
        } else {
            this.salary += 500;
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " (" + this.position + ") - Seniority: " + this.seniority + ", Experience Age: " + this.experienceAge + ", Salary: " + this.salary;
    }
}
