public class Newspaper extends PrintedMedia{
    private String advertising;

    public Newspaper(String producer, String title, int publicationDate, String genre, int pages, String advertising) {
        super(producer, title, publicationDate, genre, pages);
        this.advertising = advertising;
    }

    @Override
    public void printInfo(){
        System.out.println("\t\t\t\t\t\t\t\tNEWSPAPER:\n");
        super.printInfo();
        String npInfo = "Advertising:" + advertising;
        System.out.println(npInfo);
        System.out.println("------------------------------------------------------------------------------");

    }
}
