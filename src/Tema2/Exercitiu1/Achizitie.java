package Tema2.Exercitiu1;



public class Achizitie {

    private int pret;
    private int cantitate;


    public Achizitie(int pret,  int cantitate) {
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public Achizitie(){

    }

    public int getCantitate() {
        return cantitate;
    }

    public int getPret() {
        return pret;
    }

    public int  CalculateTotalPrice(){
        int total =  cantitate * pret;
        return total;
    }


    @Override
    public String toString() {
        return "pret "+ pret + " cantitate " + cantitate ;
    }
}
