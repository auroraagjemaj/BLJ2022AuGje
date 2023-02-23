public class Book extends PrintedMedia{
    private int chapters;

    public Book(String producer, String title, int publicationDate, String genre, int pages, int chapters) {
        super(producer, title, publicationDate, genre, pages);
        this.chapters = chapters;
    }

    @Override
    public void printInfo(){
        System.out.println("\t\t\t\t\t\t\t\t\tBOOK:\n");
        super.printInfo();
        String bInfo = "Chapters:" + chapters;
        System.out.println(bInfo);
        System.out.println("------------------------------------------------------------------------------");

    }
}
