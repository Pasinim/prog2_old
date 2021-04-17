import java.util.Scanner;
import java.util.Objects;
//OVERVIEW: Le istanze di questa classe forniscono una rappresentazione di un polinomio denso
//gli oggetti di questa classe NON sono mutabili e i metodi sono creazionali

/**
 * Non uso i set dato che per loro natura non sono ordinati 
 */
public class Poly {
   //ATTRIBUTI
   //Variabile d'istanza che rappresenta i coefficienti del polinomio
   private int terms[];
   //Variabile d'istanza che rappresenta il grado del polinomio
   private int deg;

   //COSTRUTTORI
   //POST: istanzia un polinomio zero
   public Poly(){
        terms = new int[1];
        deg = 0;
   }
    
   //POST: Istanzia un polinomio cx^n
//          Se n<0 solleva una eccezione di tipo NegativeExponentException
   public Poly (int c, int n){
        if (n<0) throw new NegativeExponentException ("Poly must have a positive exponent. Found: " + n);
        if (n==0){
            deg = 0;
            terms = new int[1];
        }
        else{
            terms = new int[n+1];
            //for (int i=0; i<n; i++) 
              //  terms[i] = 0; //serve davvero o lo fa da solo??
            deg = n;
            terms[n] = c; 
        }
   }
   
   //EFFECTS: restituisce un nuovo polinomio di grado d
            // se n<0 restituisce una eccezione di tipo NegativeExponentException
   public Poly (int n){
        if (n<0) throw new NegativeExponentException ("Poly must have a positive exponent. Found: " + n);
        if (n==0){
            terms = new int[1];
            deg = 0;
        }else{
            terms = new int[n+1];
            deg=n;
        }
   }

   //METODI
   //EFFECTS: restituisce il grado di this
   public int degree(){
       return deg;
   }

   //EFFECTS: restituisce il coefficente del termine di grado d
   public int coeff(int d){
       return terms[d];
   }

   //PRE: q not null
   //EFFETCS: restituisce un nuovo polinomio ottenuto da this + q
   public Poly add(Poly q){
        Objects.requireNonNull(q);
        Poly add_poly;
        if (this.deg >= q.deg){
            add_poly = new Poly(this.deg);
            for (int i=0; i<=q.deg; i++)
                add_poly.terms[i] = this.terms[i] + q.coeff(i);
            for (int i=q.deg+1; i<=add_poly.deg; i++)
                add_poly.terms[i] = this.terms[i];
        }else{
            add_poly = new Poly (q.deg);
        }
        return add_poly;
    }

   @Override
   public String toString(){
       String str = "";
       for (int i=deg; i>0; i--)
            str += terms[i] + "x^" + i + " + ";
       return str + terms[0] + "";
    }

    public static void main(String[] args) {
        Poly p = new Poly(3, 3);
        Poly q = new Poly (2, 2);
        p =  p.add(q);
        System.out.println(p.toString());
    }
}


