package ch.noseryoung.blj;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, reverse = 0;

        System.out.println("enter your number ^-^: ");
       int num = sc.nextInt();
        temp = num;

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