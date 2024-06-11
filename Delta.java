public class Delta {
    public static void main(String[] args) {
        System.out.println(delta(2, 3, 4));

    }

    public static Integer delta(int a, int b, int c){
        return (b * b) - (4 * a * c);
    }
}
