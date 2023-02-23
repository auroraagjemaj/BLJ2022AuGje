public class Mediacollection {
private String producer;
private String title;
private int publicationYear;
private String genre;

    public Mediacollection(String producer, String title, int publicationDate, String genre) {
        this.producer = producer;
        this.title = title;
        this.publicationYear = publicationDate;
        this.genre = genre;
    }

    public void printInfo(){
    String info = "Producer:" + producer +
            "\nTitle:" + title +
            "\nPublication Year:" + publicationYear +
            "\nGenre:" + genre;
    System.out.println(info);
 }

    }

