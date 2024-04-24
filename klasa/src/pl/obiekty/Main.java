package pl.obiekty;

public class Main {
    public static void main(String[] args) {
        Uzytkownik mariusz = new Uzytkownik(20, "Mariusz");
        if(mariusz.czyMozeLegalnieKupicAlkohol()){
            System.out.println("Może kupić");
        } else {
            System.out.println("Nie może kupić");
        }
    }
}
