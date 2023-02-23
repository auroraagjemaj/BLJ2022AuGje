public class CD extends HearingMedia{
    private String type;

    public CD(String producer, String title, int publicationDate, String genre, int duration, String type) {
        super(producer, title, publicationDate, genre, duration);
        this.type = type;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        String cdInfo = "\nType:" + type;
    }
}
