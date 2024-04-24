package org.example;

public class Czlowiek {

    private char plec;
    private String imie;
    private String nazwisko;

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public Czlowiek(char plec, String imie, String nazwisko) {
        this.plec = plec;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return nazwisko + " " + imie+" (" + plec +")" ;
    }


}
