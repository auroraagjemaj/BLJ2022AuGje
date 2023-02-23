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
        super.printInfo();
        String vgInfo = "\nSeason:" + season +
                "\nAge restriction:" + ageRestriction;
    }
}
