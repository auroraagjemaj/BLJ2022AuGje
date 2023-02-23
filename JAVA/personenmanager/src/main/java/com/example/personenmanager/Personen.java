package com.example.personenmanager;
import java.util.ArrayList;
public class Personen {
    private String Vorname;
    private String Nachname;
    private int Alter;
    private String Wohnort;
    private int Groesse;

    public Personen(String vorname, String nachname, int alter, String wohnort, int groesse) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Alter = Alter;
        this.Wohnort = Wohnort;
        this.Groesse = Groesse;
    }

    public String getVorname() {
        return Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public int getAlter() {
        return Alter;
    }

    public String getWohnort() {
        return Wohnort;
    }

    public int getGroesse() {
        return Groesse;
    }
}

