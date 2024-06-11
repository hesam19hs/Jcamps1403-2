public class TypeCovert {
    public static void main(String[] args) {
        byte byt = 12;
        short st = 200;
        Long lg = 40000L;
        int i = 5;
        double d = 2.1d;
        float f = 5.99f;
        char ch = 'D';
        boolean bl = true;

        String st0 = String.valueOf(byt);
        String st1 = String.valueOf(st);
        String st2 = String.valueOf(lg);
        String st3 = String.valueOf(i);
        String st4 = String.valueOf(d);
        String st5 = String.valueOf(f);
        String st6 = String.valueOf(ch);
        String st7 = String.valueOf(bl);

        System.out.println(st0);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);
        System.out.println(st5);
        System.out.println(st6);
        System.out.println(st7);

        String stAdd = "77";

        Integer stToI = Integer.valueOf(stAdd);
        System.out.println(stToI);


        /*String age = "25";
        Integer ageInteger = Integer.valueOf(age) + 10;
        long l = Long.valueOf(age);
        String aBool = "false";
        Boolean aBoolInBoolean = Boolean.parseBoolean(aBool);
        System.out.println(ageInteger);
        System.out.println(aBoolInBoolean);*/

    }
}

