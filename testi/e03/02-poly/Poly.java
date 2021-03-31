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
        // int maxDegree, minDegree;
        // if (this.degree <= q.degree) {
        //     maxDegree=q.degree;
        //     minDegree=this.degree;
        // }else{
        //     maxDegree=this.degree;
        //     minDegree=q.degree;
        // }
        for (int i=this.degree+1; i>0; i--){
            Poly p = new Poly(this.terms[i], i);
        }
            



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

    public static void main(String[] args) {
        int p, q;
        Scanner scan = new Scanner(System.in);
        p=scan.nextInt();
        
        for (int i=0; i<p; i++){
            int c = scan.nextInt();
            int n = scan.nextInt();
            Poly (c, n)     
        }
        scan.close();
    }
    
}
