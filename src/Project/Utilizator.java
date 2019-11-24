package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utilizator {

    static List<String> listaUtilizatori =  new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    String nume;

    public Utilizator(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public static void adaugareUtilizatori(){

        System.out.println("Introdu un utilizator: ");
        String numeTast  = sc.nextLine();

        listaUtilizatori.add(numeTast);


    }

    public static void stergereUtilizatori(){

        System.out.println("Cauta un utilizator de sters: ");

        String numeRemove = sc.nextLine();

        if(listaUtilizatori.contains(numeRemove)){
            listaUtilizatori.remove(numeRemove);
        }else{
            System.out.println("n-am gasit acest nume");
        }

    }
}
