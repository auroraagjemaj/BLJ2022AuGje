package ch.noseryoung.blj;

import java.io.*;

import java.util.Scanner;
public class Exercise1 {
    private static int count = 0;
    private static int numOfColumns = 0;
    public static int mark = 0;

    public static void rows() {

        try {
            File exc1 = new File("C:\\Users\\Aurora\\BLJ2022AuGje\\JAVA\\KW06\\Bewerter\\src\\exc1_f1.txt");

            Scanner scanner = new Scanner(exc1);

            while (scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }
            if (count == 76) {
                mark++;
                System.out.println("* Line count:                 achieved ✅ *");
            } else {
                System.out.println("* Line count:             not achieved ❌ *");
            }
            scanner.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void column() {
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\Aurora\\BLJ2022AuGje\\JAVA\\KW06\\Bewerter\\src\\exc1_f1.txt"));
            String text = brTest.readLine();

            Scanner txtScanner = new Scanner(text);
            while (txtScanner.hasNextLine()) {
                String data = txtScanner.nextLine().trim();
                for (int i = 0; i < data.length(); i++) {
                    if (data.charAt(i) == '|') {
                        numOfColumns++;
                    }
                }
            }
            if (numOfColumns + 1 == 3){
                mark++;
                System.out.println("* Row Count:                  achieved ✅ *");
            }else {
                System.out.println("* Row Count:              not achieved ❌ *");
            }
            txtScanner.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static void order() throws IOException {
        BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\Aurora\\BLJ2022AuGje\\JAVA\\KW06\\Bewerter\\src\\exc1_f1.txt"));
        String text = brTest.readLine();
        if(text.equals(" MITARBEITER |   Chef    | CHEF SALARY")){
            mark++;

            System.out.println("* Order:                      achieved ✅ *");
        }else{
            System.out.println("* Order:                  not achieved ❌ *");
        }


    }

    public static void start1() throws IOException {

        System.out.println("*******************************************");
        System.out.println("*              Exercise 1                 *");
        System.out.println("-------------------------------------------");
        System.out.println("* Criteria ------------------- End result *");
        System.out.println("-------------------------------------------");
        rows();
        column();
        order();
        System.out.println("*******************************************");
        System.out.println("* score:                            " + mark + "     *");
        System.out.println("*******************************************");

    }
}
