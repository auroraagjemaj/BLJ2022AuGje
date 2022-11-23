package ch.noseryoung.blj;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, temp, reverse = 0;
        num = 12321;
        temp = num;
        System.out.println("enter your number ^-^: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (temp != 0) {
            int d = temp % 10;
            reverse = reverse * 10 + d;
            temp /= 10;
        }
        //
        if (reverse == num) {
            System.out.println("is a palindrome number");
        } else {
            System.out.println("isn't a palindrome number");
        }
    }
}