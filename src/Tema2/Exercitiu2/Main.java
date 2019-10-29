package Tema2.Exercitiu2;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Persoana> listaDePersoane = new ArrayList<>();

        listaDePersoane.add(new Persoana("2109283438167","Alina","Miriana","Timisoara","Closca","0770722781"));
        listaDePersoane.add(new Persoana("2609783478983","Alice","Casiana","Timisoara","Closca","0770722782"));
        listaDePersoane.add(new Persoana("2109283438143","Alin","Popescu","Timisoara","Closca","0770722783"));
        listaDePersoane.add(new Persoana("2309283438198","Marcel","Marius","Timisoara","Closca","0770722784"));
        listaDePersoane.add(new Persoana("2109283438143","Cristi","Radu","Timisoara","Closca","0770722785"));
        listaDePersoane.add(new Persoana("2309283438976","Vlad","Vasile","Timisoara","Closca","0770722786"));
        listaDePersoane.add(new Persoana("2109283438343","Calin","Crisan","Timisoara","Closca","0770722787"));
        listaDePersoane.add(new Persoana("2109283438166","Rares","Popesc","Timisoara","Closca","0770722788"));
        listaDePersoane.add(new Persoana("2309243433149","Ray","More","Timisoara","Closca","0770722789"));
        listaDePersoane.add(new Persoana("2139263438143","Ana","Maria","Timisoara","Closca","0770722710"));


       // for(Persoana p : listaDePersoane){
       //     System.out.println(p.toString());
       // }

        Scanner sc  =  new Scanner(System.in);

        while(true) {

            System.out.println("Cauta o persoana introducand numarul de telefon");
            String numarAles = sc.nextLine();

            for(int i=0; i<listaDePersoane.size();i++) {
                if (listaDePersoane.get(i).getNrtel().equals(numarAles)) {

                    System.out.println("Ai ales un numar care este in lista, iata datele persoanei cu numarul : "+numarAles);
                    System.out.println("============================DATE==============================================");
                    System.out.println(listaDePersoane.get(i).toString());

                    break;
                } else {

                    System.out.println("Number not found in the list");
                    break;
                }
            }
        }



    }
}
