public class Dummy {
    public static void main(String[] args) {
        byte DummyAge = 13;
        short DummyHeight = 188;
        int DummyWallet = 100000;
        long DummyWeight = 100000000;
        float DummyFootSize = 28.5f;
        double DummyFootSizeMM = 28.56548d;
        char FirstWordDummyName = 'D';
        boolean DummyIsDead = false;

        System.out.println("Dummy have " + DummyAge + " years old");
        System.out.println("Dummy's Height is: " + DummyHeight + " cm");
        System.out.println("Dummy have " + DummyWallet + " Dollars");
        System.out.println("Dummy have " + DummyWeight + " milligrams weight");
        System.out.println("Dummy's Foot is: " + DummyFootSize + " cm");
        System.out.println("Dummy's Foot is: " + DummyFootSizeMM + " mm");
        System.out.println("First word Dummy Name is: " + FirstWordDummyName);
        if(DummyIsDead == true){
            System.out.println("Dummy is Dead");
        }else{
            System.out.println("Dummy is Alive");
        }
    }
}