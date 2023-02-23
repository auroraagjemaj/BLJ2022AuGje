public class Book extends PrintedMedia{
    private int chapters;

    public Book(String producer, String title, int publicationDate, String genre, int pages, int chapters) {
        super(producer, title, publicationDate, genre, pages);
        this.chapters = chapters;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        String bInfo = "\nChapters:" + chapters;
    }
}
