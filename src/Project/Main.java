package Project;

import java.util.Scanner;

import static Project.MetodeOptiuni.afiseazaOptiuniCase1;
import static Project.MetodeOptiuni.afiseazaOptiuniCase2;
import static Project.MetodeOptiuni.afiseazaOptiuniCase3;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===Alege din meniu===");
        System.out.println("1. Management utilizatori");
        System.out.println("2. Management optiuni");
        System.out.println("3. Management comenzi");


        int alegere = sc.nextInt();

        switch(alegere){
            case 1 :
                afiseazaOptiuniCase1();
                break;
            case 2 :
                afiseazaOptiuniCase2();
                break;
            case 3 :
                afiseazaOptiuniCase3();
                break;
            default:
                System.out.println("Nu exista optiunea asta");
        }
    }


}
