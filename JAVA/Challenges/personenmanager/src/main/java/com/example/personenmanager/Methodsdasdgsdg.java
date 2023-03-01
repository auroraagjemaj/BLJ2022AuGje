package com.example.personenmanager;

import java.util.ArrayList;

public class Methodsdasdgsdg {
    ArrayList<Personen> people = new ArrayList<>();


    public void createPerson(String Vorname, String Nachname, int Alter, String Wohnort, int Groesse){
        people.add(new Personen(Vorname, Nachname, Alter, Wohnort, Groesse));
    }


}
