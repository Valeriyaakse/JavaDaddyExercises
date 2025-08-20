package mentorship.roadmap.Java_Core.step4_OOP.topic13_ManagerAndEmployee;

public class Manager extends Employee{
    public int bonus;
    public Manager(String name, int salary, int bonus) {
        super(name,salary);
        this.bonus = bonus;
    }

    @Override
    public int getAnnualSalary() {
        return super.getAnnualSalary() + bonus;
    }
public static void main(String[] args) {
        Manager manager1 = new Manager("Tom", 100000,100000);
        Manager manager2 = new Manager("Bob", 150000, 150000);
    System.out.println(Employee.employeeCount);
}

}
