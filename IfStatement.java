public class IfStatement {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18) {
            System.out.println("mitoni ray bedi");
        } else {
            System.out.println("nemitoni ray bedi");
        }


        weekDays(6, null);

        weekDaysSwitch(3);
    }

    public static void weekDays(int day, String s) {
        if (day == 0) {
            s = "shanbeh";
        } else if (day == 1) {
            s = "1 shanbeh";
        } else if (day == 2) {
            s = "2 shanbeh";
        } else if (day == 3) {
            s = "3 shanbeh";
        } else if (day == 4) {
            s = "4 shanbeh";
        } else if (day == 5) {
            s = "5 shanbeh";
        } else if (day == 6) {
            s = "jomee";
        }
        System.out.println(s);
    }


    public static void weekDaysSwitch(int days) {
        switch (days) {
            case 0:
                System.out.println("shanbeh");
                break;
            case 1:
                System.out.println("1 shanbeh");
                break;
            case 2:
                System.out.println("2 shanbeh");
                break;
            case 3:
                System.out.println("3 shanbeh");
                break;
            case 4:
                System.out.println("4 shanbeh");
                break;
            case 5:
                System.out.println("5 shanbeh");
                break;
            case 6:
                System.out.println("jomee");
                break;
        }
    }
}

//فاکتوریل بدون فور حساب کنیم
//3!  = 3 * 2 * 1