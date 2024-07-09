public class Main {
    public static void main(String[] args) {
        Person a1 = new Person("hesam", 33);
        Person a2 = new Person("nima", 33);
        a1.print();
        a2.print();
        Person.showCount();

        Rectangle r1 = new Rectangle(2, 5);
        System.out.println(r1.masahat());
        System.out.println(r1.mohit());
    }
}
