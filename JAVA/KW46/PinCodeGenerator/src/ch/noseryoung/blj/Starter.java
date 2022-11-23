package ch.noseryoung.blj;

public class Starter {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10000; i++) {

            int lengthOfInt = String.valueOf(sum).length();
            if (lengthOfInt < 2) {
                System.out.println("000" + sum);

            } else if (lengthOfInt < 3) {
                System.out.println("00" + sum);

            } else if (lengthOfInt < 4) {
                System.out.println("0" + sum);

            } else {
                System.out.println(sum);

            }
            sum = sum + 1;
        }
    }
}