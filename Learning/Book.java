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

}
