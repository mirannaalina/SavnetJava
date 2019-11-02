package Project;

import java.util.Scanner;

import static Project.Comanda.*;
import static Project.Optiune.adaugareOptiuni;
import static Project.Optiune.stergereOptiuni;
import static Project.Utilizator.adaugareUtilizatori;
import static Project.Utilizator.stergereUtilizatori;


public class MetodeOptiuni {

    public static void afiseazaOptiuniCase1(){
        //management utilizatori

        System.out.println("a. Adaugare Utilizatori");
        System.out.println("b. Stergere Utilizatori");

        Scanner sc = new Scanner(System.in);
        String optiune = sc.next();

        switch (optiune) {
            case "a":
                adaugareUtilizatori();
                break;
            case "b":
                stergereUtilizatori();
                break;
            default:
                System.out.println("Nu avem aceasta optiune");
        }

    }
    public static void afiseazaOptiuniCase2(){
        //management optiuni

        System.out.println("a. Adaugare Optiuni");
        System.out.println("b. Stergere Optiuni");

        Scanner sc2 = new Scanner(System.in);
        String optiune = sc2.next();

        String adaugareOptiuniString = sc2.nextLine();
        int adaugareOptiuniInt = sc2.nextInt();

        switch (optiune) {
            case "a":
                //int id, int pret, String descriere, String ziua
                adaugareOptiuni(adaugareOptiuniInt,adaugareOptiuniInt,adaugareOptiuniString,adaugareOptiuniString);
                break;
            case "b":
                stergereOptiuni();
                break;
            default:
                System.out.println("Nu avem aceasta optiune");
        }

    }
    public static void afiseazaOptiuniCase3(){
        //management comenzi

        System.out.println("a. Adaugare Comanda");
        System.out.println("b. Stergere Comanda");
        System.out.println("c. Setare flag platit");
        System.out.println("d. Vizualizare sume de bani ramase de platit per user");

        Scanner sc = new Scanner(System.in);
        String optiune = sc.next();

        switch (optiune) {
            case "a":
                adaugareComanda();
                break;
            case "b":
                stergeComanda();
                break;
            case "c":
                setareFlagPlatit();
                break;
            case "d":
                vizualizareSumePerUser();
                break;
            default:
                System.out.println("Nu avem aceasta optiune");
        }


    }


}
