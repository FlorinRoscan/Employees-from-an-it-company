
public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 5000, "Software Developer", 2, 3);
        Employee employee2 = new Employee("Jane", "Smith", 6000, "Project Manager", 3, 4);
        Employee employee3 = new Employee("Bob", "Johnson", 4500, "Network Administrator", 1, 1);
        Employee employee4 = new Employee("Alice", "Lee", 5500, "Database Administrator", 4, 5);
        Employee employee5 = new Employee("Tom", "Wang", 7000, "Senior Software Developer", 6, 7);

        // update an employee's experience age
        employee2.updateExperienceAge(5);
        employee2.updateExperienceAge(5);

        // print the updated employee information
        System.out.println(employee2);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(employee3);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(employee1);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(employee5);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(employee4);
    }
}