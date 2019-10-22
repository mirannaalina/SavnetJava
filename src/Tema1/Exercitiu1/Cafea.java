package Tema1.Exercitiu1;

public class Cafea extends Ingredient {

    float zaharAlb, zaharBrun, lapte, grasime;


    Cafea(float zaharAlb, float zaharBrun, float lapte, float grasime){

        this.zaharAlb = zaharAlb;
        this.zaharBrun =zaharBrun;
        this.lapte = lapte;
        this.grasime = grasime;

    }

    @Override
    public String toString() {
        return "Cafea{" +
                "zaharAlb=" + zaharAlb +
                ", zaharBrun=" + zaharBrun +
                ", lapte=" + lapte +
                ", grasime=" + grasime +
                '}';
    }
}
