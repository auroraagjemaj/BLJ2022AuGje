package ch.noseryoung.blj;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int year = 2024;
        System.out.println("enter a year ^-^: ");
        Scanner sc = new Scanner(System.in);

        year = sc.nextInt();
        boolean leap = false;

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                leap = year % 400 == 0;
            }

            else
                leap = true;
        }

        if (leap)
            System.out.println(year + " is a leap year!");
        else
            System.out.println(year + " isn't a leap year!");
}
}
