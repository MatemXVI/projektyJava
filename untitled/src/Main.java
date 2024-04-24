import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Czworobok> figury = new ArrayList<>();
        int i = 0;
        int j = 0;

       Czworobok prostokat1 = new Prostokat(10, 5);
        figury.add(prostokat1);

        Czworobok kwadrat1 = new Kwadrat(8);
        figury.add(kwadrat1);

        Czworobok prostokat2 = new Prostokat(4, 7);
        figury.add(prostokat2);

        Czworobok kwadrat2 = new Kwadrat(3);
        figury.add(kwadrat2);

        for (Czworobok figura:
             figury) {
            if(figura instanceof Prostokat) {
                System.out.println("Prostokąt nr " + ++i);
            }else if(figura instanceof Kwadrat){
                System.out.println("Kwadrat nr " + ++j);
            }
            figura.informacje();
        }
        Czworobok romb = new Romb(6, 76, 142);
        romb.informacje();

    }
}