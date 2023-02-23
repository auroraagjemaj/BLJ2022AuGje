public class Newspaper extends PrintedMedia{
    private String advertising;

    public Newspaper(String producer, String title, int publicationDate, String genre, int pages, String advertising) {
        super(producer, title, publicationDate, genre, pages);
        this.advertising = advertising;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        String npInfo = "\nAdvertising:" + advertising;
    }
}
