package org.example;

public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getNumberPhone() {
        return phoneNumber;
    }

    public void setNumberPhone(int numberPhone) {
        this.phoneNumber = numberPhone;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void displayGuestInfomration(){
        System.out.println("Imię:" + name);
        System.out.println("Preferowany posiłek:" + meal);
        System.out.println("Numer telefonu:" + phoneNumber);
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println("Weganin:" + isVeganString);
        System.out.println();

    }
}
