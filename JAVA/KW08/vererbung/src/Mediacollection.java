import java.util.ArrayList;

public class Mediacollection {
private String producer;
private String title;
private int publicationDate;
private String genre;

    public Mediacollection(String producer, String title, int publicationDate, String genre) {
        this.producer = producer;
        this.title = title;
        this.publicationDate = publicationDate;
        this.genre = genre;
    }

    public void printInfo(){
    String info = "Producer:" + producer +
            "\nTitle:" + title +
            "\nPublication date:" + publicationDate +
            "\nGenre:" + genre;
    System.out.println(info);
 }

    }

