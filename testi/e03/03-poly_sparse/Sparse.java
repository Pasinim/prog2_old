/**
 * OVERVIEW: le istanze di questa clase rappresentano polinomi sparsi. 
 * Gli oggetti di questa classe non sono mutabili.
 */
public class Sparse {
    //CAMPI
    private final int degree[];
    private final int terms[];

    //COSTRUTTORI
    /**
     * EFFECTS: Inizializza un nuovo polinomio zero 
     *  */ 
    public Sparse (){
        terms = new int[1];
        degree = new int[1];
    }

    /**
     * EFFECTS: Inizializza  un nuovo polinomio cx^n.
     *          Se n<0 viene sollevata una eccezione NegativeExponentException
     */
    public Sparse (int c, int n){
        if (n<0) throw new NegativeExponentException("n must be positive. Found: " + n);
        

    }
}
