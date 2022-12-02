package ch.noseryoung.blj;
import java.time.LocalDate;

public class Person {
    private int year;
    private int month;
    private int day;
    private String name;
    private int age;

    public Person(int year, int month, int day, String name) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        age = LocalDate.now().minusYears(year).minusMonths(month - 1).minusDays(day).getYear();
    }

    public static void initPersonArray(Person[] persArr) {
        int i = 0;

        persArr[i++] = new Person(2007, 5, 1, "Marko");              //Noser
        persArr[i++] = new Person(2006, 11, 23, "Dylan");              //Noser
        persArr[i++] = new Person(2006, 7, 23, "Samuel");             //Noser
        persArr[i++] = new Person(2006, 5, 21, "Luis");               //Noser
        persArr[i++] = new Person(2001, 12, 19, "Sairam");             //Noser
        persArr[i++] = new Person(2002, 11, 13, "Tsering");            //Accenture
        persArr[i++] = new Person(2004, 9, 27, "Nikola");             //Accenture
        persArr[i++] = new Person(2007, 1, 18, "Noah");               //Accenture
        persArr[i++] = new Person(2007, 1, 25, "Aurora");             //Accenture
        persArr[i++] = new Person(1999, 12, 12, "Jasmin");             //Accenture
        persArr[i++] = new Person(2006, 11, 8, "Fatima");             //Accenture
        persArr[i++] = new Person(2002, 6, 18, "Masa");               //Accenture
        persArr[i++] = new Person(2006, 1, 23, "Timofey");            //Accenture
        persArr[i++] = new Person(2007, 3, 7, "Ruben");              //Accenture
        persArr[i++] = new Person(2006, 12, 26, "Aabish");             //Accenture
        persArr[i++] = new Person(2005, 7, 23, "Ömer");               //Google
        persArr[i++] = new Person(2006, 5, 23, "Emma");               //Google
        persArr[i++] = new Person(2007, 7, 12, "Oscar");              //Google
        persArr[i++] = new Person(2004, 10, 15, "Jessica");            //Google
        persArr[i++] = new Person(2006, 11, 13, "Nikhil");             //Google
        persArr[i++] = new Person(2006, 5, 7, "Elmar");              //Google
        persArr[i++] = new Person(2006, 5, 22, "Henri");              //Google
        persArr[i++] = new Person(2005, 5, 21, "Virginia");           //Google
        persArr[i++] = new Person(2005, 8, 16, "Yan");                //Google
        persArr[i++] = new Person(2007, 4, 25, "Ilija");              //Google
        persArr[i++] = new Person(2007, 4, 8, "Valentin");           //Google
        persArr[i++] = new Person(2006, 7, 25, "Loris");              //SIX
        persArr[i++] = new Person(2007, 6, 1, "Dominic");            //SIX
        persArr[i++] = new Person(2006, 10, 20, "Lorena");             //SIX
        persArr[i++] = new Person(2005, 3, 10, "Edgar");              //SIX
        persArr[i++] = new Person(2006, 12, 16, "Richard");            //ka wo
        persArr[i++] = new Person(2003, 1, 1, "Saad");               //ka wo
        persArr[i++] = new Person(2004, 2, 26, "Filip");              //Cognizant
        persArr[i++] = new Person(2004, 5, 4, "Duy Minh");           //Cognizant
        persArr[i++] = new Person(2006, 3, 7, "Timothy");            //OneConsult
        persArr[i++] = new Person(2006, 4, 7, "Jamie");              //Burkhalter
        persArr[i++] = new Person(2006, 3, 18, "Jasmin");             //Microsoft
        persArr[i++] = new Person(2002, 4, 25, "Sharujah");           //kawo
        persArr[i++] = new Person(2005, 3, 4, "Darko");              //ka wo
        persArr[i++] = new Person(2006, 4, 7, "Dina");               //Sersa
    }


    public static void bubbleSortDay(Person[] persArr) {
        int n = persArr.length;
        Person temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (persArr[j - 1].getDay() > persArr[j].getDay()) {

                    temp = persArr[j - 1];
                    persArr[j - 1] = persArr[j];
                    persArr[j] = temp;
                }
            }
        }

    }

    public static void bubbleSortMonth(Person[] persArr) {
        int n = persArr.length;
        Person temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (persArr[j - 1].getMonth() > persArr[j].getMonth()) {

                    temp = persArr[j - 1];
                    persArr[j - 1] = persArr[j];
                    persArr[j] = temp;
                }
            }
        }

    }

    public static void printGeb(Person[] persArr) {
        String[] month = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli",
                "August", "September", "Oktober", "November", "Dezember"};

        System.out.println("2022 haben Geburtstag im");
        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);
            for (int j = 0; j < persArr.length; j++) {
                if (persArr[j].getMonth() == i + 1) {
                    System.out.println("\t" + persArr[j].getDay() + ". " + persArr[j].getName() + " (" + persArr[j].getAge() + ")");
                }
            }
        }
    }

    public int getAge() {
        return age;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getName() {
        return name;
    }
}