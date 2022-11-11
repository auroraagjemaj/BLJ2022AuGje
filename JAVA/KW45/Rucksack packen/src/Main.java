import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> rucksack = new ArrayList<String>();
        System.out.println("Welcome to the backpack game!");
        while (true) {
            System.out.println("**************************************");
            System.out.println("what do you want to do?\n1= add element\n2= show backpack\n3= end the program");
            Scanner ja = new Scanner(System.in);
            String antwort = ja.next();
            System.out.println("**************************************");

            if (antwort.equals("1")) {
                System.out.println("enter your item:");
                Scanner sc1 = new Scanner(System.in);
                String element = sc1.next();
                rucksack.add(element);


            } else if (antwort.equals("2")) {
                for (int i = 0; i < rucksack.size(); i++) {
                    System.out.println("-" + rucksack.get(i));

                }
            } else if (antwort.equals(("3"))){
                System.exit(0);
            } else if (!(antwort.equals(1) || antwort.equals(2) || antwort.equals(3))) {
                System.out.println("enter a valid number!!!!!!!!");


            }
        }
    }
}
