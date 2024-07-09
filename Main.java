public class Main {
    public static void main(String[] args) {
        /*Person a1 = new Person("hesam", 33);
        Person a2 = new Person("nima", 33);
        a1.print();
        a2.print();
        Person.showCount();

        Rectangle r1 = new Rectangle(2, 5);
        System.out.println(r1.mohit());
        System.out.println(r1.masahat());*/

        Employee e1 = new Employee("ali", "karshenas", 1000);
        Employee e2 = new Employee("reza", "karshenas", 1100);
        System.out.println(e1.annualSalary());
        System.out.println(e1.khalesDaryafti());
        e2.hoghogheBishtar(e1);
        Employee.hoghogheBishtar1(e1, e2);
    }
}
