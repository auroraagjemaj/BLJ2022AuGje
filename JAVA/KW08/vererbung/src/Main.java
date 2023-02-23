import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mediacollection> arrayList = new ArrayList<>();

DVD dvd = new DVD("James Cameron", "AVATAR", 2020, "Fantasy", 489, "Sam Worthington", 12345);
CD cd = new CD("Ultimo", "Alba", 2023, "Pop", 48, "Music");
Newspaper np = new Newspaper("20 minutes", "20 minutes", 1999, "News", 30, "Migros");
Book b = new Book("Sarah Stankewitz", "Rise and fall", 2022, "novel", 432, 17);
Videogame vg = new Videogame("Epic Games", "Fortnite", 2017, "Battle Royale", 4, 12);

  arrayList.add(dvd);
  arrayList.add(cd);
  arrayList.add(np);
  arrayList.add(b);
  arrayList.add(vg);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("  __  __ ___ ___ ___   _   ___ ___  _    _    ___ ___ _____ ___ ___  _  _ \n" +
                " |  \\/  | __|   \\_ _| /_\\ / __/ _ \\| |  | |  | __/ __|_   _|_ _/ _ \\| \\| |\n" +
                " | |\\/| | _|| |) | | / _ \\ (_| (_) | |__| |__| _| (__  | |  | | (_) | .` |\n" +
                " |_|  |_|___|___/___/_/ \\_\\___\\___/|____|____|___\\___| |_| |___\\___/|_|\\_|\n" );
        System.out.println("------------------------------------------------------------------------------");
  for (Mediacollection m : arrayList){
      m.printInfo();
      System.out.println("\n");
  }
    }
}