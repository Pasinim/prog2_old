/**
 * OVERVIEW: le istanze di questa classe rappresentano polinomi sparsi. 
 * Gli oggetti di questa classe sono immutabili
 */

public class PolySparse {
    
    //CAMPI
    //Variabile d'istanza che rappresenta i gradi del polinomio 
    private final int degree[];
    //Variabile d'istanza che rappresenta i coefficenti del polinomio sparso
    private final int coeff[];


    //COSTRUTTORI
    //EFFECTS: inizializza un polinomio 0
    public PolySparse(){
        coeff = new int[1];
        degree = new int[1]; 
    }

    //EFFECTS: inziializza un polinomio cx^n. Se n<0 solleva un'eccezione di tipo IllegalArgumentException
    public PolySparse(int c, int n){
        if (n<0) throw new IllegalArgumentException("n must be >0. Found " + n);
        coeff = new int[1];
        degree = new int[1];
        coeff[0]=c; degree[0]=n;
    }

    //EFFECTS: inizializza un polinomio di lunghezza n 
    public PolySparse (int n){
        coeff = new int[n];
        degree = new int[n];
    }

    //METODI
    //EFFECTS: restituisce il grado dell'monomio in posizione i
    public int deg(int i){
        return this.degree[i];
    }
    //EFFECTS: restituisce il coefficente del termine d
    public int coeff(int d){
        return this.coeff[d];
    }

    //EFFECTS: restituisce il numero di termini con esponente diverso
    public int different_degree(PolySparse q){
        int c = 0, maxLength;
        if (this.degree.length >= q.degree.length)
            maxLength = this.degree.length;
        else 
            maxLength = q.degree.length;
        for (int i = 0; i<maxLength; i++){
            if ()
        }

    }

        //EFFECTS: restituisce il polinomio ottenuto dalla somma di this e  q
    public PolySparse add (PolySparse q){
        PolySparse new_poly;
        if (this.coeff(coeff.length - 1) >= q.coeff(coeff.length - 1)){
             new_poly = new PolySparse(this.coeff.length);
        }else{
             new_poly = new PolySparse(q.coeff.length);
        }
        System.out.println("Lunghezza nuovo: " + new_poly.coeff.length);
        //ciclo tutti i termini nel polinomio 
        for (int i=0; i < new_poly.coeff.length; i++){
            //se due esponenti sono uguali devo sommare i coefficienti
            new_poly.degree[i] = this.deg(i);
            if (this.deg(i) == q.deg(i)){
                new_poly.coeff[i] = this.coeff(i) + q.coeff(i);
            }else if (this.coeff(i)!=0){
                new_poly.coeff[i] = this.coeff(i);
            }else{
                new_poly.coeff[i] = q.coeff(i);
            }
        }
        return new_poly;
    }

    @Override
    public String toString(){
        String str = "";
        for (int i=0; i<coeff.length; i++)
           str += this.coeff(i) + "x^" + this.deg(i) + " + ";
        return str; 
    } 
}
