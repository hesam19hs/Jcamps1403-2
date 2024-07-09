public class Person {//sakhte class bedon main va faghat ba karbord moshakhasat shakhs va print
    private int Age;
    private String Name;
    public static int count = 0;//sakht counter static
    public Person(String Name, int  Age){//count to constructor bashe chon harbar object ro misaze in ro yek bar ejra mikone
        this.Name = Name;
        this.Age = Age;
        count++;
    }
    public static void showCount(){//agar static nabashe to main ba shey mikhonim agar static bashe ba nam clas
        System.out.println("count is: " + count);
    }
    public void print(){
        System.out.println("Name is " + Name + " Age is " + Age);
    }
}
