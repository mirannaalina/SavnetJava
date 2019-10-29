package Tema2.Exercitiu1;

import java.util.Comparator;

public class CompareClass implements Comparator<Achizitie> {

    // d) Extindeti functionalitatea comparatorului de la punctul c) astfel: daca ambele obiecte pe care le comparam sunt de tip Aliment,
    // le vom compara pe baza dateiDeExpirare, tot crescator. Daca ambele obiecte sunt de tip AparatElectrocasnic, le vom compara crescator pe baza garantiei.
    // Daca nu ne aflam in niciunul din cazurile prezentate la acest punct, vom compara cele 2 obiecte ca la punctul c)

    @Override
    public int compare(Achizitie a, Achizitie b) {
        if((a instanceof Aliment) && (b instanceof Aliment)){
            return a.CalculateTotalPrice() - b.CalculateTotalPrice();
        }else if((a instanceof AparatElectrocasnic) && (b instanceof AparatElectrocasnic)){
             return  a.CalculateTotalPrice() - b.CalculateTotalPrice();
        }else {

            return a.CalculateTotalPrice() - b.CalculateTotalPrice();

        }
    }
}
