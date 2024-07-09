public class Employee {
    private String name;
    private String job;
    private double salary;

    public Employee(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public double annualSalary(){
        return salary * 12;
    }
}
