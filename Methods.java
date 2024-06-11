import static java.lang.Math.sqrt;

public class Methods {
    public static void main(String[] args) {
        /*int i = calculate(2, 5);
        System.out.println();
        process();
        int i = age(1370, 1403);
        System.out.println(i);*/

        System.out.println(Moraba(12));
        System.out.println(Jazr());
        System.out.println(Miangin(10.3f, 15.6f));
    }
    /*public static Integer age(int a, int b) {
        return b - a;
    }*/

    public static Integer Moraba(int a){
        int a2 = a * a;
        return a2;
    }
    public static double Jazr(){
        double b = sqrt(Moraba(12));
        return b;
    }

    public static float Miangin(float c, float d){
        return (c + d) / 2;
    }
    /*public static Integer calculate(int a, int b) {
        return a + b;
    }
    public static void process() {
        System.out.println(calculate(4, 7));
    }*/
}
