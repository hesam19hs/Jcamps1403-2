public class ComparOperator {
    public static void main(String[] args) {
        /*int a = 2;
        int b = 5;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a++);
        a--;
        System.out.println(a);*/
        System.out.println(delta(2, 3, 4));

    }

    public static Integer delta(int a, int b, int c){
        return (b * b) - (4 * a * c);
    }
}
