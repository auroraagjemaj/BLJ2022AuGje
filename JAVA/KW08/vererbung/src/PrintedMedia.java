public class PrintedMedia extends Mediacollection{
    private int pages;

    public PrintedMedia(String producer, String title, int publicationDate, String genre, int pages) {
        super(producer, title, publicationDate, genre);
        this.pages = pages;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        String pmInfo = "Pages:" + pages;
        System.out.println(pmInfo);
    }
}
