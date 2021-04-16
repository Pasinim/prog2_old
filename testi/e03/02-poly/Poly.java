import java.util.Scanner;
//OVERVIEW: Le istanze di questa classe forniscono una rappresentazione di un polinomio denso
//gli oggetti di questa classe NON sono mutabili e i metodi sono creazionali

/**
 * Non uso i set dato che per loro natura non sono ordinati 
 */
public class Poly {
    //ATTRIBUTI
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
        terms[degree]=c;
    }

    private Poly (int n){
        terms = new int[n+1];
        degree = n;
    }


    //METODI
    /**
     * Post: restituisce il grado del polinomio, cioè l'esponente più grande con un coefficiente non nullo
     */
    public int degree(){
        return this.degree;
    }
    //Post: restituisce il coefficiente del termine di grado d
    public int coeff(int d){
        return terms[d+1];
    }

    /**
     * Precondizioni:   q non nullo
     * Postcondizioni: esegue l'addizione tra il polinomio this e il polinomio q: this + q
     */
    public Poly add(Poly q) {
        Poly larger, smaller;
        if (degree > q.degree) {larger=this; smaller=q;} else {larger=q; smaller=this;}
        int newDeg = larger.degree;
        if (degree == q.degree) //controllo che il coefficiente massimo non sia zero
            for (int i=degree; i>0; i--)
                if (terms[i]+q.terms[i]==0) newDeg--; else break;
        Poly r = new Poly(newDeg);
        int i;
        for(i=0; i<=smaller.degree && i<=newDeg; i++)
            r.terms[i]=larger.terms[i] + smaller.terms[i];
        //quando ci sono solamente i coefficienti del poly più grande li copio semplicemente
        for (int j=i; j<=larger.degree; j++) 
            r.terms[j] = larger.terms[j];
        System.out.println("\tDeg: " + r.degree());
        System.out.println("\tPoly: " + r.toString());

        return r;
    }
    /**
     * Postcondizioni: esegue la differenza tra il polinomio this e il polinomio q:
     * return this - {q}
     */
    public Poly diff(Poly p) {
        Poly q = new Poly();
        for (int i = 1; i <= p.degree(); i++)
            q = q.add(new Poly(p.coeff(i)*i, i-1));
        return q;
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
    
    //postcondizioni: restituisce una rappresentazione testuale di Poly
    @Override 
    public String toString(){
        String str = "";
        for (int i=this.degree(); i>0; i--)
            str += terms[i]+ "x^" + i + " + ";
        return str + terms[0] + "\n";
    }

    public static void main(String[] args) {
        int p;
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il grado: ");
        p=scan.nextInt();
        Poly r = new Poly();
        for (int i=0; i<p; i++){
            int c = scan.nextInt();
            Poly q = new Poly(c, i);
            r.add(q);
        }
        System.out.println("DEg: " + r.degree());
        System.out.println("Poly: " + r.toString());
        scan.close();
    }
    
}
