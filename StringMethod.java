import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String Name1 = "Nima";
        String Name2 = new String("Mehdi is here");


        System.out.println(Name1);
        System.out.println(Name2);
        System.out.println(Name1.length());
        System.out.println(Name2.charAt(2));
        System.out.println(Name1.charAt(Name1.length() - 1));
        System.out.println(Name2.substring(6, 9));
        System.out.println(Name1 + Name2);
        System.out.println(Name1.concat(Name2));
        System.out.println(Name1.equals(Name2));//is case-sensitive
        System.out.println(Name1.equalsIgnoreCase(Name2));//is not case-sensitive
        System.out.println(Name1.indexOf("a"));
        System.out.println(Name2.indexOf("i"));
        System.out.println(Name2.indexOf('i' ,5));
        System.out.println(Name2.replace(" ", "+"));

        String str = String.format("My name is %s i'm from %s", "Ali", "Iran");
        System.out.println(str);
        String[] sp1 = Name2.split("is");
        System.out.println(Arrays.toString(sp1));
        //System.out.println(sp1.[1]);
////////////////////////////////////////////////////////HandOn
        String myName = "Hesam";
        int myAge = 33;
        String Dotin = "DOTIN";
        String HandOn1 = String.format("My name is %s i have %s year old", myName, myAge);
        System.out.println(HandOn1);
        String HandOn2 = HandOn1.toUpperCase();
        System.out.println(HandOn2);
        String HandOn3 = HandOn2.replace("HESAM", Dotin);
        System.out.println(HandOn3);
        int HandOn4 = HandOn3.indexOf(Dotin);
        System.out.println(HandOn4);
        String HandOn5 = HandOn3.substring(0, HandOn4 + Dotin.length());
        System.out.println(HandOn5);
        System.out.println(HandOn5.toLowerCase());
        /////////////////////////////////////////////////////////////////////
        StringBuffer sb = new StringBuffer();
        sb
                .append("hellllllo")
                .append("to")
                .append(1)
                .append(true)
                .append("end")
                .append(2)
        ;

        System.out.println(sb);


    }
}
