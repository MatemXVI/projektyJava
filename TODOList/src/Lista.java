import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    List<String> todo = new LinkedList();
    boolean isExecutive = true;
    int i = 0;
    int option;
    public static void select(){
        i++;
        for (String dosomething : todo){
            System.out.println(i + ". " + dosomething);
        }
    }
        System.out.println("TODO List");
        System.out.println("Wybierz opcję:");
        System.out.println("1 - Wyświetl wszystkie pozycje z listy");
        System.out.println("2 - Dodaj nową pozycję do listy");
        System.out.println("3 - Usuń nową pozycję do listy");
        System.out.println("0 - Wyjdź");
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
        switch (option) {
            case 1:
                select();
                break;
            case 2:
                add();
                break;
            case 3:
                delete();
                break;
            case 0:
                isExecutive = false;
            default:
                System.out.println("Wybrałeś złą pozycję");
        }
}
