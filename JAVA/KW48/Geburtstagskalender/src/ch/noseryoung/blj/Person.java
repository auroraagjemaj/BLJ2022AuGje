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

        persArr[i++] = new Person(2007, 5, 1, "Marko");
        persArr[i++] = new Person(2006, 11, 23, "Dylan");
        persArr[i++] = new Person(2006, 7, 23, "Samuel");
        persArr[i++] = new Person(2006, 5, 21, "Luis");
        persArr[i++] = new Person(2001, 12, 19, "Sairam");
        persArr[i++] = new Person(2002, 11, 13, "Tsering");
        persArr[i++] = new Person(2004, 9, 27, "Nikola");
        persArr[i++] = new Person(2007, 1, 18, "Noah");
        persArr[i++] = new Person(2007, 1, 25, "Aurora");
        persArr[i++] = new Person(1999, 12, 12, "Jasmin");
        persArr[i++] = new Person(2006, 11, 8, "Fatima");
        persArr[i++] = new Person(2002, 6, 18, "Masa");
        persArr[i++] = new Person(2006, 1, 23, "Timofey");
        persArr[i++] = new Person(2007, 3, 7, "Ruben");
        persArr[i++] = new Person(2006, 12, 26, "Aabish");
        persArr[i++] = new Person(2005, 7, 23, "Ömer");
        persArr[i++] = new Person(2006, 5, 23, "Emma");
        persArr[i++] = new Person(2007, 7, 12, "Oscar");
        persArr[i++] = new Person(2004, 10, 15, "Jessica");
        persArr[i++] = new Person(2006, 11, 13, "Nikhil");
        persArr[i++] = new Person(2006, 5, 7, "Elmar");
        persArr[i++] = new Person(2006, 5, 22, "Henri");
        persArr[i++] = new Person(2005, 5, 21, "Virginia");
        persArr[i++] = new Person(2005, 8, 16, "Yan");
        persArr[i++] = new Person(2007, 4, 25, "Ilija");
        persArr[i++] = new Person(2007, 4, 8, "Valentin");
        persArr[i++] = new Person(2006, 7, 25, "Loris");
        persArr[i++] = new Person(2007, 6, 1, "Dominic");
        persArr[i++] = new Person(2006, 10, 20, "Lorena");
        persArr[i++] = new Person(2005, 3, 10, "Edgar");
        persArr[i++] = new Person(2006, 12, 16, "Richard");
        persArr[i++] = new Person(2003, 1, 1, "Saad");
        persArr[i++] = new Person(2004, 2, 26, "Filip");
        persArr[i++] = new Person(2004, 5, 4, "Duy Minh");
        persArr[i++] = new Person(2006, 3, 7, "Timothy");
        persArr[i++] = new Person(2006, 4, 7, "Jamie");
        persArr[i++] = new Person(2006, 3, 18, "Jasmin");
        persArr[i++] = new Person(2002, 4, 25, "Sharujah");
        persArr[i++] = new Person(2005, 3, 4, "Darko");
        persArr[i++] = new Person(2006, 4, 7, "Dina");
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

    public static void printGeburtstag(Person[] persArr) {
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