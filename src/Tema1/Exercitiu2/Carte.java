package Tema1.Exercitiu2;

import java.util.HashSet;
import java.util.Set;

public class Carte {

    static String nume;
    static String autor;
    static double pret;
    Gen gen;

    public Carte(String nume, String autor, double pret, Gen gen) {
        this.nume = nume;
        this.autor = autor;
        this.pret = pret;
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "nume='" + nume + '\'' +
                ", autor='" + autor + '\'' +
                ", pret=" + pret +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(nume.equals(nume) && autor.equals(autor)) {
            return true;
        }else
            return false;
    }
}
