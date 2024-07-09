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
        double meghdarMaliat = annualSalary() / zaribMali ;
        return annualSalary() - meghdarMaliat;
    }

}
