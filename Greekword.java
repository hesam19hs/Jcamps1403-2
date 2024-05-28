public class Greekword {
    public static void main(String[] args) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        int SUM = 0;
        String GreekWord = "IXD";
        System.out.println("please inter your Greak words:" + GreekWord);
        if(GreekWord.contains("I")){
            SUM = SUM + 1;
        }
        if(GreekWord.contains("V")){
            SUM = SUM + 5;
        }
        if(GreekWord.contains("X")){
            SUM = SUM + 10;
        }
        if(GreekWord.contains("L")){
            SUM = SUM + 50;
        }
        if(GreekWord.contains("C")){
            SUM = SUM + 100;
        }
        if(GreekWord.contains("D")){
            SUM = SUM + 500;
        }
        if(GreekWord.contains("M")){
            SUM = SUM + 1000;
        }
        System.out.println(SUM);
    }
}
