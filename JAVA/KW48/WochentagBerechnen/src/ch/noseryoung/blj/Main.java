package ch.noseryoung.blj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          int  jahrrrr = 1;
            Scanner sc = new Scanner(System.in);
            int[] months;
            months = new int[13];
            months[0] = 1;
            months[1] = 4;
            months[2] = 4;
            months[3] = 0;
            months[4] = 2;
            months[5] = 5;
            months[6] = 0;
            months[7] = 3;
            months[8] = 6;
            months[9] = 1;
            months[10] = 4;
            months[11] = 6;



            System.out.println("enter the date! ^-^");
            System.out.println("day:\t");
            int day = sc.nextInt();
            System.out.println("month:\t");
            int monthh = sc.nextInt();

            System.out.println("year:\t");
            int year = sc.nextInt();

            int viertel = year % 100;
            if (year < 1900 & year > 1799){
                   jahrrrr = 2;
    } else if (year<2000 & year>1899){
                    jahrrrr = 0;
            } else if (year < 2100 & year > 1999){
                    jahrrrr = 6;
            }else if (year < 2200 & year > 2099){
                    jahrrrr = 4;
            }

        int berechnung = 0;

        if (year % 4 == 0) {
            berechnung = ((viertel + (viertel / 4)) + months[monthh] + day + jahrrrr)- 1 % 7;
        } else if (year % 4 == 1){
            berechnung = ((viertel + (viertel/4))+ months[monthh] + day + jahrrrr) % 7;

        }
        sc.nextLine()
        ;
        if (berechnung == 1){System.out.println("weekday: Monday");}
        else if (berechnung == 2){System.out.println("weekday: Tuesday");}
        else if (berechnung == 3){System.out.println("weekday: Wednesday");}
        else if (berechnung == 4){System.out.println("weekday: Thursday");}
        else if (berechnung == 5){System.out.println("weekday: Friday");}
        else if (berechnung == 6){System.out.println("weekday: Saturday");}
        else if (berechnung == 7){System.out.println("weekday: Sunday");}

       if(((viertel + (viertel/4))+ months[monthh] + day + jahrrrr) % 7 == 5 ){
    System.out.println("weekday: Monday");
      }else if(((viertel + (viertel/4))+ months[monthh] + day + jahrrrr) % 7 == 6 ){
            System.out.println("weekday: Tuesday");
        }else if(((viertel + (viertel/4))+ months[monthh] + day + jahrrrr) % 7 == 7 ){
            System.out.println("weekday: Wednesday");
        }else if(((viertel + (viertel/4))+ months[monthh] + day + jahrrrr) % 7 == 1 ){
            System.out.println("weekday: Thursday");

        }else if(((viertel + (viertel/4))+ months[monthh] + day + jahrrrr) % 7 == 2 ){
            System.out.println("weekday: Friday");

        }else if(((viertel + (viertel/4))+ months[monthh] + day + jahrrrr) % 7 == 3 ){
            System.out.println("weekday: Saturday");

        }else if(((viertel + (viertel/4))+ months[monthh] + day + jahrrrr) % 7 == 4 ){
            System.out.println("weekday: Sunday");

        }
}
}





































