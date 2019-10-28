package Tema2.Exercitiu1;

public class AparatElectrocasnic extends Achizitie {

    private int garantie;

    public AparatElectrocasnic(int pret, int cantitate, int garantie) {
        super(pret, cantitate);
        this.garantie = garantie;
    }

    public int getGarantie() {
        return garantie;
    }

    @Override
    public String toString() {
        return "pret "+ getPret() + " cantitate " + getCantitate() + " garantie" + getGarantie();
    }
}
