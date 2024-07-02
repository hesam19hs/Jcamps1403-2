package Learning;
import java.util.Date;
public class Book {
    private String title;
    private String author;
    private String press;
    private String releaseDate;
public void dispalyInfo(){
    System.out.println("k");
}
    public Book(String title, String author, String press, String releaseDate) {
        this.title = title;
        this.author = author;
        this.press = press;
        this.releaseDate = releaseDate;
    }

    public Book() {
    }

}
