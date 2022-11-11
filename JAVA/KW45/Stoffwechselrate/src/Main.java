import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("are you a boy or a girl?");
        Scanner sc1 = new Scanner(System.in);
        String scanner1 = String.valueOf(sc1.next());

if (scanner1.equals("boy")) {
    System.out.println("what is your weight?");
    Scanner sc2 = new Scanner(System.in);
    double weight = Double.parseDouble(sc2.next());

    System.out.println("how tall are you?");
    Scanner sc3 = new Scanner(System.in);
    double height = Double.parseDouble(sc3.next());

    System.out.println("how old are you?");
    Scanner sc4 = new Scanner(System.in);
    double age = Double.parseDouble(sc4.next());

    System.out.println("Stoffwechsel: " + (66.47 + 13.7 * weight + 5 * height - 6.8 * age));
} else {
    System.out.println("what is your weight?");
    Scanner sc2 = new Scanner(System.in);
    double weight = Double.parseDouble(sc2.next());

    System.out.println("how tall are you?");
    Scanner sc3 = new Scanner(System.in);
    double height = Double.parseDouble(sc3.next());

    System.out.println("how old are you?");
    Scanner sc4 = new Scanner(System.in);
    double age = Double.parseDouble(sc4.next());

    System.out.println("Stoffwechsel: " + (655.1 + 9.6 * weight + 1.8 * height - 4.7 * age));
}
}
}


