package org.example;

import java.io.Serializable;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Country> alliance = new ArrayList<>();
        Country polska = new Country("Polska", "Warszawa");
        Country niemcy = new Country("Niemcy", "Berlin");
        Country rosja = new Country("Rosja", "Moskwa");
        alliance.add(polska);
        alliance.add(niemcy);
        alliance.add(rosja);

Math.PI

//        Random random = new Random();
//        List<Integer> al1 = new ArrayList<>();
//        List<Integer> al2 = new ArrayList<>();
//        List<Integer> al3 = new ArrayList<>();
//        int liczba1;
//        int liczba2;
//        for (int i = 0; i < 50; i++) {
//            liczba1 = random.nextInt(-10, 20);
//            al1.add(liczba1);
//            liczba2 = random.nextInt(10, 50);
//            al2.add(liczba2);
//        }
//        System.out.println(al1);
//        System.out.println(al2);
//        for (int i = 0; i < 50; i++){
//            if(al1.get(i) != al2.get(i)){
//                al3.add(al1.get(i));
//                al3.add(al2.get(i));
//            }
//        }
//        int i = 0;
//        for(int liczba : al3){
//            if (liczba == 7){
//                i++;
//            }
//        }
//        System.out.println("Liczba 7 wystąpiła " + i + " razy.");

    }

}