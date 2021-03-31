//OVERVIEW: Le istanze di questa classe forniscono una rappresentazione di un polinomio
//gli oggetti di questa classe NON sono mutabili e i metodi sono creazionali

/**
 * Non uso i set dato che per loro natura non sono ordinati 
 */
public class Poly {
    private final int[] terms;
    private final int degree;
    
    //costruttori
    /**
     * Postcondizioni: inizializza this affinchè rappresenti il 
     * polinomio zero
     */
    public Poly(){
        terms = new int[1];
        degree=0;
    }

    /**
     * Postcondizioni: inizializza this affinchè rappresenti un polinomio
     * cx^n. Solleva un'eccezione se il grado inserito è negativo 
     */
    public Poly(int c, int n) {
        if (n<0) throw new NegativeExponentException("Il grado di un polinomio non può essere negativo.");
        if (c==0) degree=0; //se il coefficiente è 0 allora il polinomio è 0
        else degree=n;
        terms = new int[degree+1]; //il polinomio di grado 0 è composto da 1 elemento
        terms[n]=c;
    }

    /**
     * Postcondizioni: esegue l'addizione tra il polinomio this e il polinomio q: this + q
     */
    public Poly add(Poly q) {
        int minDegree;
        

        return null;
    }
    /**
     * Postcondizioni: esegue la differenza tra il polinomio this e il polinomio q
     */

    public Poly sub(Poly q) {
        return null;
    }
       
    /**
     * Postcondizioni: esegue la moltiplicazione tra il polinomio this e il polinomio q
     */
    public Poly mul(Poly q) {
        return null;
    }

    /**
     * Postcondizioni: restituisce il polinomio opposto
     */
    public Poly minus() {
        return null;
    }

    Poly
    
    
}
