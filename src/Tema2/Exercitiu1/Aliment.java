package Tema2.Exercitiu1;

public class Aliment extends Achizitie {

    private int dataDeExpirare;

    public Aliment(int pret, int cantitate, int dataDeExpirare) {
        super(pret, cantitate);
        this.dataDeExpirare = dataDeExpirare;
    }

    public int getDataDeExpirare() {
        return dataDeExpirare;
    }

    @Override
    public String toString() {
        return "pret "+ getPret() + " cantitate " + getCantitate() + " data Expirare " + getDataDeExpirare();
    }

}
