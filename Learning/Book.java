package Learning;
import java.util.Date;

public class Book {
    public static void main(String[] args) {

    }
    private String title;
    private String author;
    private String press;
    private String releaseDate;
    public void dispalyInfo(){
    System.out.println(
            "title: '" + title +
            "', author: '" + author +
            "', press: '" + press +
            "', releaseDate: '" + releaseDate + "\'"
            );
    }
    public Book(String title, String author, String press, String releaseDate) {
        this(title, author);
        this.press = press;
        this.releaseDate = releaseDate;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    private boolean search(String title){
        return this.title.equals(title);
    }

    public void printSearch(String title){
        if (search(title))
            System.out.println("Book");
        else
            System.out.println("no Book");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static int count = 0;//badan az clas book harchanta object ijad beshe count hamishe yek moteghayer sabet hast
    //// be ezaye clas yek static darim
    private String firstName;//badan az clas book harchanta object ijad beshe firstName ye instance hast ke mitone har meghdar jadidi begire
    //yani mishe object ali dasht ba count sefr va object mohamad dasht ba count sefr
    static {//shabih constructor hast
        count = 5;
        //firstName = "taghi";//inke az blovk static be firtName dastrasi nadashte bashim tabieeye vali mishe inja count ro dasht
        //chon count male clas book hast vali firstName ro bayad azash object besazim va onja dastrasi dasht
        //hamchenin to object sakhte shode be count ham mishe dastrasi dasht

    }
}
