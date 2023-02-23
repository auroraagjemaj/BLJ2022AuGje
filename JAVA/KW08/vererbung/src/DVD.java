public class DVD extends HearingMedia{
    private String actors;
    private int resolution;

    public DVD(String producer, String title, int publicationDate, String genre, int duration, String actors, int resolution) {
        super(producer, title, publicationDate, genre, duration);
        this.actors = actors;
        this.resolution = resolution;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        String dvdInfo = "\nActors:" + actors +
                "\nResolution:" + resolution;
    }
}
