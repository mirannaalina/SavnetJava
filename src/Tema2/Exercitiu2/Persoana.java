package Tema2.Exercitiu2;

public class Persoana {

     private static String cnp, nume, prenume, localitate, domiciliu, nrtel;

    public Persoana(String cnp, String nume, String prenume, String localitate, String domiciliu, String nrtel) {
        this.cnp = cnp;
        this.nume = nume;
        this.prenume = prenume;
        this.localitate = localitate;
        this.domiciliu = domiciliu;
        this.nrtel = nrtel;
    }

    public String getCnp() {
        return cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getLocalitate() {
        return localitate;
    }

    public String getDomiciliu() {
        return domiciliu;
    }

    public String getNrtel(){
        return nrtel;
    }

    @Override
    public String toString() {
        return "CNP : "+ cnp+" , " + "Nume : "+nume +" , " +"Prenume : "
                +prenume+" , " + "Localitate : "+ localitate+" , "+ "Domiciliu : "+
                domiciliu+" , "+ "Telefon : "+nrtel;
    }
}
