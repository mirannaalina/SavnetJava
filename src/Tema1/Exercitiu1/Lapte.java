package Tema1.Exercitiu1;

import Tema1.Exercitiu1.Ingredient;

public class Lapte extends Ingredient {

   private float procentajGrasime;

    public Lapte(float procentajGrasime) {
        this.procentajGrasime = procentajGrasime;
    }

    public float getProcentajGrasime() {
        return procentajGrasime;
    }
}
