import java.util.HashMap;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {

        while (true) {
            System.out.println("what do you want to translate?");
            Scanner sc1 = new Scanner(System.in);
            String word = sc1.next();

            if(word.equals("exit")) {
                break;
            }

                HashMap<String, String> morseTable = new HashMap<>();

                morseTable.put("a", ".-");
                morseTable.put("b", "-...");
                morseTable.put("c", "-.-.");
                morseTable.put("d", "-..");
                morseTable.put("e", ".");
                morseTable.put("f", "..-.");
                morseTable.put("g", "--.");
                morseTable.put("h", "....");
                morseTable.put("i", "..");
                morseTable.put("j", ".---");
                morseTable.put("k", "-.-");
                morseTable.put("l", ".-..");
                morseTable.put("m", "--");
                morseTable.put("n", "-.");
                morseTable.put("o", "---");
                morseTable.put("p", ".--.");
                morseTable.put("q", "--.-");
                morseTable.put("r", ".-.");
                morseTable.put("s", "...");
                morseTable.put("t", "..");
                morseTable.put("u", "...-");
                morseTable.put("v", ".--");
                morseTable.put("w", "-..-");
                morseTable.put("x", "-.--");
                morseTable.put("y", "-.--");
                morseTable.put("z", "--..");
                morseTable.put("1", ".----");
                morseTable.put("2", "..---");
                morseTable.put("3", "...--");
                morseTable.put("4", "....-");
                morseTable.put("5", ".....");
                morseTable.put("6", "-....");
                morseTable.put("7", "--...");
                morseTable.put("8", "---..");
                morseTable.put("9", "----.");
                morseTable.put("0", "-----");
                morseTable.put(" ", "/");


                System.out.println(morseTable.get(word));

        }
    }
}