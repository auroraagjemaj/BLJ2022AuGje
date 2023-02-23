import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mediacollection> arrayList = new ArrayList<Mediacollection>();

DVD dvd = new DVD("James Cameron", "AVATAR", 2020, "Fantasy", 489, "Sam Worthington", 12345);
CD cd = new CD("P!nk", "Trustfall", 2023, "Pop", 43, "Music");
Newspaper np = new Newspaper("20 minutes", "20 minutes", 1999, "News", 30, "Migros");
 Book b = new Book("Sarah Stankewitz", "Rise and fall", 2022, "novel", 432, 17);
  Videogame vg = new Videogame("Notch", "Minecraft", 2011, "Sandbox", 1, 10);

  arrayList.add(dvd);
  arrayList.add(cd);
  arrayList.add(np);
  arrayList.add(b);
  arrayList.add(vg);

  for (Mediacollection m : arrayList){
      m.printInfo();
      System.out.println("\n");
  }
    }
}