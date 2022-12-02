package ch.noseryoung.blj;

public class Main {
    public static void main(String[] args) {
        Person[] persArr = new Person[40];
        Person.initPersonArray(persArr);
        Person.bubbleSortDay(persArr);
        Person.bubbleSortMonth(persArr);
        Person.printGeburtstag(persArr);

    }
}