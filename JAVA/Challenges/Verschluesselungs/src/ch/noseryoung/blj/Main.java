package ch.noseryoung.blj;

import java.util.Scanner;

import static ch.noseryoung.blj.SecretKey.code;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your message: ");
        String message = scanner.nextLine();
        System.out.println("enter a key: ");
        int key = scanner.nextInt();
        String secrettext = code(message, key);
        System.out.println("this is your decryptet message:\t" + secrettext);
        System.out.println("do you want to decrypt it? 1 = yes or 0 = no?");
        Integer doing = scanner.nextInt();
        if (doing == 1) {
            System.out.println("enter your message:");
            int guessedkey = scanner.nextInt();
            if (guessedkey == key){
                System.out.println("yes! you guessed the key!^-^\nthe message was:\t" + message);
            }else if (guessedkey != key){
                System.out.println("no that's not the right key, i'm sorry. Try again the next time.");

            }
        }
         else if   (doing == '0'){
                System.out.println("okay! bye.");

            }
        }

    }



