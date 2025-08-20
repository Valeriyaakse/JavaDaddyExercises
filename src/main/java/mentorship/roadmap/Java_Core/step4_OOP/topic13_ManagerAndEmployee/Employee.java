package mentorship.roadmap.Java_Core.step4_OOP.topic13_ManagerAndEmployee;

public class Employee {
    public String name;
    public int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }
    public static int employeeCount;
   public static int getCount() {
       return employeeCount;
    }
    public int getAnnualSalary() {
        return 12*salary;
    }

}
