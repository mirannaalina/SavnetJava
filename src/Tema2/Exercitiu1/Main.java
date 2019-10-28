package Tema2.Exercitiu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Achizitie> listaCumparaturi = new ArrayList<>();

        listaCumparaturi.add(new Achizitie(10,2));
        listaCumparaturi.add(new Achizitie(13,4));
        listaCumparaturi.add(new AparatElectrocasnic(300,4,2));
        listaCumparaturi.add(new Aliment(12,4,30));
        listaCumparaturi.add(new Achizitie(12,30));
        listaCumparaturi.add(new Achizitie(23,4));
        listaCumparaturi.add(new Achizitie(24,99));
        listaCumparaturi.add(new Achizitie(233,9));
        listaCumparaturi.add(new Achizitie(500,8));
        listaCumparaturi.add(new Achizitie(23,90));

        for(Achizitie a : listaCumparaturi){
            System.out.println(a.toString());
            System.out.println(a.CalculateTotalPrice());
        }

        //Collections.sort(listaCumparaturi, (a,b ) -> a.CalculateTotalPrice() - b.CalculateTotalPrice());

        Collections.sort(listaCumparaturi, new CompareClass());

        System.out.println("=============================================SORTED BY PRICE==============================");
        for(Achizitie a : listaCumparaturi){
            System.out.println(a.toString());
            System.out.println(a.CalculateTotalPrice());
        }



    }

}
