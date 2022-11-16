import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class starter {
    public static void main(String[] args) {
        System.out.println("*******************************************");
        System.out.println("Welcome to my morse translator program!");
        System.out.println("*******************************************");
        while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("do you want to translate in morse or in letters? \nm= morse l= letters");
        String signs = sc.nextLine();

            if (signs.equals("m")) {
                System.out.println("enter your word:");
                String word = sc.nextLine();

                HashMap<String, String> morseTable = new HashMap<>();

                morseTable.put("a", ".- ");
                morseTable.put("b", "-... ");
                morseTable.put("c", "-.-. ");
                morseTable.put("d", "-.. ");
                morseTable.put("e", ". ");
                morseTable.put("f", "..-. ");
                morseTable.put("g", "--. ");
                morseTable.put("h", ".... ");
                morseTable.put("i", ".. ");
                morseTable.put("j", ".--- ");
                morseTable.put("k", "-.- ");
                morseTable.put("l", ".-.. ");
                morseTable.put("m", "-- ");
                morseTable.put("n", "-. ");
                morseTable.put("o", "--- ");
                morseTable.put("p", ".--. ");
                morseTable.put("q", "--.- ");
                morseTable.put("r", ".-. ");
                morseTable.put("s", "... ");
                morseTable.put("t", ".. ");
                morseTable.put("u", "...- ");
                morseTable.put("v", ".-- ");
                morseTable.put("w", "-..- ");
                morseTable.put("x", "-..- ");
                morseTable.put("y", "-.-- ");
                morseTable.put("z", "--.. ");
                morseTable.put("1", ".---- ");
                morseTable.put("2", "..--- ");
                morseTable.put("3", "...-- ");
                morseTable.put("4", "....- ");
                morseTable.put("5", "..... ");
                morseTable.put("6", "-.... ");
                morseTable.put("7", "--... ");
                morseTable.put("8", "---.. ");
                morseTable.put("9", "----. ");
                morseTable.put("0", "----- ");
                morseTable.put(" ", "/ ");


                for (int i = 0; i < word.length(); i++) {
                    System.out.print(morseTable.get(Character.toString(word.charAt(i))));
                }
                System.out.println("\n");

            } else if (signs.equals("l")) {
                System.out.println("enter your signs:");
                String sign = sc.nextLine();
                HashMap<String, String> letterTable = new HashMap<>();

                letterTable.put(".-", "a ");
                letterTable.put("-...", "b ");
                letterTable.put("-.-.", "c ");
                letterTable.put("-..", "d ");
                letterTable.put(".", "e ");
                letterTable.put("..-.", "f ");
                letterTable.put("--.", "h ");
                letterTable.put("....", "i ");
                letterTable.put(".---", "j ");
                letterTable.put("-.-", "k ");
                letterTable.put(".-..", "l ");
                letterTable.put("--", "m ");
                letterTable.put("-.", "n ");
                letterTable.put("---", "o ");
                letterTable.put(".--.", "p ");
                letterTable.put("--.-", "q ");
                letterTable.put(".-.", "r ");
                letterTable.put("...", "s ");
                letterTable.put("-", "t ");
                letterTable.put("..-", "u ");
                letterTable.put("...-", "v ");
                letterTable.put(".--", "w ");
                letterTable.put("-..-", "x ");
                letterTable.put("-.--", "y ");
                letterTable.put("--..", "z ");
                letterTable.put(".----", "1 ");
                letterTable.put("..---", "2 ");
                letterTable.put("...--", "3 ");
                letterTable.put("....-", "4 ");
                letterTable.put(".....", "5 ");
                letterTable.put("-....", "6 ");
                letterTable.put("--...", "7 ");
                letterTable.put("---..", "8 ");
                letterTable.put("----.", "9 ");
                letterTable.put("-----", "0 ");
                letterTable.put("/", "  ");

                String[] splitSigns = sign.split("/");

                for (String Sign: splitSigns) {
                    System.out.print(letterTable.get(Sign));

                }
                System.out.println("\n");
            }
        }
    }
}
