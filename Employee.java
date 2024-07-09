public class Employee {
    private String name;
    private String jobTitle;
    private double salary;
    private int zaribMali = 10;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public double annualSalary(){
        return salary * 12;
    }
    public double khalesDaryafti(){
        return annualSalary() - (annualSalary() / zaribMali);
    }
    public void hoghogheBishtar(Employee othEmp){
        if (this.salary > othEmp.salary){
            System.out.println(this.name);
        } else if (othEmp.salary > this.salary) {
            System.out.println(othEmp.name);
        }else {
            System.out.println("equal");
        }
    }
    public static void hoghogheBishtar1(Employee Emp1, Employee Emp2){
        if (Emp1.salary > Emp2.salary){
            System.out.println(Emp1.name);
        } else if (Emp2.salary > Emp1.salary) {
            System.out.println(Emp2.name);
        }else {
            System.out.println("equal");
        }
    }
}
