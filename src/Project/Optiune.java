package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Optiune {

    static  List<String> optiuneList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    private int id,pret;
    private String descriere,ziua;

    public Optiune(int id, int pret, String descriere, String ziua) {
        this.id = id;
        this.pret = pret;
        this.descriere = descriere;
        this.ziua = ziua;
    }

    public int getId() {
        return id;
    }

    public int getPret() {
        return pret;
    }

    public String getDescriere() {
        return descriere;
    }

    public String getZiua() {
        return ziua;
    }


    public static void adaugareOptiuni(int id, int pret, String descriere, String ziua){

        System.out.println("Adauga optiuni dupa id,pret,descriere,ziua ");

       id = sc.nextInt();
       pret = sc.nextInt();
       descriere =sc.nextLine();
       ziua = sc.nextLine();

       //Exception in thread "main" java.util.InputMismatchException
        optiuneList.add(Integer.toString(id));
        optiuneList.add(Integer.toString(pret));
        optiuneList.add(descriere);
        optiuneList.add(ziua);



    }

    public static void stergereOptiuni(){

        System.out.println("Sterge optiune din lista :  \n");

        for(String op : optiuneList){
            System.out.println(op);
        }

        String optiuneRemove = sc.nextLine();

        if(optiuneList.contains(optiuneRemove)){
            optiuneList.remove(optiuneRemove);
            for(String op : optiuneList){
                System.out.println(op);
            }

        }else{
            System.out.println("n-am gasit acest nume");
        }

    }


}
