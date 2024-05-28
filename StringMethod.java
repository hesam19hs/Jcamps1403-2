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
    }
}
