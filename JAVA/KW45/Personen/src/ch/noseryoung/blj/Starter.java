package ch.noseryoung.blj;

import ch.noseryoung.blj.Person;

import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {
       Person ruben = new Person("ruben");
Person aurora = new Person("aurora");
Person sairam = new Person("sairam");

       ruben.setName("ruben");
       ruben.setAge(15);
       ruben.setBestFriend(aurora);
       ruben.setFavouriteColor("lila");
       ruben.presentyourself();

       aurora.setName("aurora");
       aurora.setAge(15);
       aurora.setBestFriend(sairam);
       aurora.setFavouriteColor("lila");
       //aurora.presentyourself();

       sairam.setName("sairam");
       sairam.setAge(20);
       sairam.setBestFriend(ruben);
       sairam.setFavouriteColor("blau");
       //sairam.presentyourself();

        System.out.println("----------------------------------------------------------");
        System.out.println("do you want to know my bestfriend? yes or no");
        Scanner sc1 = new Scanner(System.in);
        String bestFriend = sc1.next();
        System.out.println("----------------------------------------------------------");

        if (bestFriend.equals("yes")){
            System.out.println("bestfriend of ruben:");
            System.out.println("----------------------------------------------------------");
            aurora.presentyourself();
            System.out.println("----------------------------------------------------------");
        } else {
            System.out.println("Have a nice day!");
        }

        System.out.println("do you want to know my bestfriend? yes or no");
        Scanner sc2 = new Scanner(System.in);
        String bestFriend2 = sc2.next();
        System.out.println("----------------------------------------------------------");

        if (bestFriend2.equals("yes")){
            System.out.println("bestfriend of aurora:");
            System.out.println("----------------------------------------------------------");
            sairam.presentyourself();
            System.out.println("----------------------------------------------------------");
        } else {
            System.out.println("Have a nice day!");
        }
    }

 }