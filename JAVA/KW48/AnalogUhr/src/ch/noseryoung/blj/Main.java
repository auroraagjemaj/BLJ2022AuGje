package ch.noseryoung.blj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what time is it? ^-^");
        System.out.println("hour?");
        int hour = sc.nextInt();
        System.out.println("minutes?");
        int minutes = sc.nextInt();


public void computeHourHandAngle(){
            System.out.println("hourankle:\t" + 0.5 * (60 * hour + minutes) + "°");

        }
        public void computeMinuteHandAngle(Scanner sc, int minutes, int hour){
            System.out.println("Minutesankle:\t" + 6 * minutes + "°");

        }

    }
}