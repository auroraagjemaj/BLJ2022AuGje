import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to my program");
        System.out.println("Länge?");
        double lenght = Double.parseDouble(sc.next());
        System.out.println("Durchmesser?");
        double durchmesser = Double.parseDouble(sc.next());

        System.out.println("Volumen: " + (Math.PI / 4 * durchmesser * durchmesser * lenght  / 10000));
    }
}