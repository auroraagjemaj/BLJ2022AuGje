package ch.noseryoung.blj;

import java.io.IOException;
import java.util.Scanner;

public class SelectExercise {
    public void chooseExercise() throws IOException {

        Scanner select = new Scanner(System.in);
        System.out.println("Which exercise do you want to correct?");
        String selecttt = select.nextLine();
        switch (selecttt) {
            case "1":
                Exercise1.start1();
                break;
            case "2":
                Exercise2.start2();
                break;
            case "3":
                Exercise3.start3();
                break;
            default:
                System.out.println("Write a number between 1-3!");
        }

    }
}

