package Project;

public class Optiune {

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


    }

    public static void stergereOptiuni(){

    }


}
