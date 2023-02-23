public class HearingMedia extends Mediacollection{
    private int duration;

    public HearingMedia(String producer, String title, int publicationDate, String genre, int duration) {
        super(producer, title, publicationDate, genre);
        this.duration = duration;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        String hmInfo = "Duration:" + duration;
        System.out.println(hmInfo);
    }
}
