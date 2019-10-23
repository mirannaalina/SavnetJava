package Tema1.Exercitiu2;

import java.util.HashSet;
import java.util.Set;

import static Tema1.Exercitiu2.Carte.pret;

public class Main {

    public static Set<Carte> carti = new HashSet<>();

    public static void main(String[] args) {

        carti.add(new Carte("Tess Dúbervile","Tomas Hardy",10.0, Gen.LITERATURA_CLASICA));
        carti.add(new Carte("De la idee la bani","Hill",102.0, Gen.DEZVOLTARE_PERSONALA));
        carti.add(new Carte("Faima si bogatie","OSHO",30.0, Gen.PSIHOLOGIE));
        carti.add(new Carte("Dama cu camelii","Alexandre Dumas-fiul",40.0, Gen.LITERATURA_CLASICA));
        carti.add(new Carte("Crima si pedeaosa","Freidof Dovstoiesky",120.0, Gen.LITERATURA_CLASICA));
        carti.add(new Carte("Regina Margot","Alexandre Dumas",102.0, Gen.LITERATURA_CLASICA));
        carti.add(new Carte("O coarda prea intinsa","ss",101.0, Gen.THRILLER));
        carti.add(new Carte("Lb rom","ss",101.0, Gen.MANUAL));
        carti.add(new Carte("Chimie","ss",101.0, Gen.MANUAL));

        afiseazaToateCartile();
        getLiteraturaClasica();
        stergeThriller();
        reducere();

    }

    public static void afiseazaToateCartile(){
        for(Carte c : carti){
            System.out.println(c);
        }

    }

    public static void getLiteraturaClasica() {

        for (Carte c : carti) {
            if (carti.contains(Gen.LITERATURA_CLASICA)) {
                System.out.println(c);
            }
        }
    }

    public static void stergeThriller(){

        for(Carte c : carti){
            if(carti.contains(Gen.THRILLER)){
                carti.remove(Gen.THRILLER);
            }else{
                System.out.println("no thrillers");
            }
        }
    }
    public static void reducere(){
        for(Carte c: carti){
            if(carti.contains(Gen.MANUAL)){
                pret = pret -10;
                System.out.println(c);
            }
        }
    }
}
