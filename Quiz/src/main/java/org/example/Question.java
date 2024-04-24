package org.example;

public class Question {
    private String pytanie;
    private String a;
    private String b;
    private String c;
    private String d;
    private String prawidlowaOdpowiedz;

    public Question(String pytanie, String a, String b, String c, String d, String prawidlowaOdpowiedz) {
        this.pytanie = pytanie;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.prawidlowaOdpowiedz = prawidlowaOdpowiedz;
    }

    public String getPytanie() {
        return pytanie;
    }

    public void setPytanie(String pytanie) {
        this.pytanie = pytanie;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getPrawidlowaOdpowiedz() {
        return prawidlowaOdpowiedz;
    }

    public void setPrawidlowaOdpowiedz(String prawidlowaOdpowiedz) {
        this.prawidlowaOdpowiedz = prawidlowaOdpowiedz;
    }
}
