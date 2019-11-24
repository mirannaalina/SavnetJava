package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Project.Utilizator.listaUtilizatori;
import static Project.Optiune.optiuneList;

public class Comanda {

    static List<String> comenzi =  new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


    static boolean flag=false;

   // Utilizator getNume;
   // Optiune getOptiune(...);

    public static void adaugareComanda(){

        System.out.println("Introdu o comanda: ");
        String numeComanda  = sc.nextLine();

        comenzi.add(numeComanda);

    }
    public static void stergeComanda(){

        System.out.println("Sterge comenzi din lista :  \n");

        for(String com : comenzi){
            System.out.println(com);
        }

        String optiuneRemove = sc.nextLine();

        if(comenzi.contains(optiuneRemove)){
            comenzi.remove(optiuneRemove);
            for(String com : comenzi){
                System.out.println(com);
            }

        }else{
            System.out.println("n-am gasit aceasta comanda ");
        }
    }

    public static void setareFlagPlatit() {

        System.out.println("Ai platit? ");

        boolean plata = sc.nextBoolean();

        if(plata) {
            flag = true;
            System.out.println("Poti lua comanda! ");
        }else{
            System.out.println("Trebuie sa platesti intai!");
        }

    }

    public static void vizualizareSumePerUser(){
        for(String listPerUser : listaUtilizatori){
            System.out.println(listPerUser);
        }

        //int suma =  optiuneList.getPret()


    }
}


