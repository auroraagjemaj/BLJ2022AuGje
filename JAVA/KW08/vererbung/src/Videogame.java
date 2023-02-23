public class Videogame extends Mediacollection{
    private int season;
    private int ageRestriction;

    public Videogame(String producer, String title, int publicationDate, String genre, int season, int ageRestriction) {
        super(producer, title, publicationDate, genre);
        this.season = season;
        this.ageRestriction = ageRestriction;
    }

    @Override
    public void printInfo(){
        System.out.println("\t\t\t\t\t\t\t\tVIDEOGAME:\n");
        super.printInfo();
        String vgInfo = "Season:" + season +
                "\nAge restriction:" + ageRestriction;
        System.out.println(vgInfo);
        System.out.println("------------------------------------------------------------------------------");

    }
}
