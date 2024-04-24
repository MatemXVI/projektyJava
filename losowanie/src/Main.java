import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int wylosowanaLiczba = random.nextInt(0, 100);
        boolean taSamaLiczba = true;
        while(taSamaLiczba){
            System.out.println("Podaj liczbę");
            int podanaLiczba = scanner.nextInt();
            if(podanaLiczba == wylosowanaLiczba){
                System.out.println("Brawo, odgadłeś liczbę!");
                taSamaLiczba = false;
            }else if(podanaLiczba > wylosowanaLiczba){
                System.out.println("Liczba jest za duża");
            }else if(podanaLiczba < wylosowanaLiczba){
                System.out.println("Liczba jest za mała");
            }
        }
    }
}
