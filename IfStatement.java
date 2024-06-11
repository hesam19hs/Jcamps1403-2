public class IfStatement {
    public static void main(String[] args) {
        int age = 15;
        if(age >= 18){
            System.out.println("mitoni ray bedi");
        }else{
            System.out.println("nemitoni ray bedi");
        }


        weekDays(4, null);
    }
    public static void weekDays(int day, String s){
        if(day == 4){
            s = "4shanbeh";
        }
        System.out.println(s);
    }
}
