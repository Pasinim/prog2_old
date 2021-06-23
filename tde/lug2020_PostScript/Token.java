package lug2020_PostScript;
import java.util.*;

public class Token<T>{

    public final T valore;
/**
 * Perché per come è ora il costruttore è privato
 * quindi per istanziare la classe sei obbligato a usare createTokenDouble o String,
 * se lo metti pubblico invece non so se ci sono modi per limitare il generico, 
 * quindi uno potrebbe fare tipo Token(Integer v) volendo
 * @param valore
 */
    private Token(T valore){
        this.valore = valore;
    }
/**
 * Dato che non hai il costruttore ti servono per forza dei metodi statici per creare un'istanza della classe
 */
    public static Token<String> tokenString(String v){
        Token<String> t = new Token<String> (v);
        return t;
    }

    public Token<Double> tokenDouble(Double v){
        Token<Double> t = new Token<Double>(v);
        return t;
    }

    /**
     * restituisce true se il token è un simbolo, false altrimenti; 
     */
    public boolean isSimbolo() {
        return (this.valore instanceof String);
    }

    /**
     * restituisce true se il token è un numero, false altrimenti;
     * @return
     */
    public boolean isNumero() {
        return (this.valore instanceof Double);
    }

    /**
     * restituisce il simbolo corrispondente al token 
     * (se esso è un simbolo, altrimenti solleva l'eccezione IllegalStateException);
     * @return
     */
    public String simbolo() {
        if (!isSimbolo()) throw new IllegalStateException();
        return "" + this.valore;
    }

    /**
     * Restituisce il valore numerico corrispondente al token
     *  (se esso è un numero, altrimenti solleva l'eccezione IllegalStateException).
     */
    public double numero(){
        if (!isNumero()) throw new IllegalStateException();
        return (Double)this.valore;
    }

    @Override
    public String toString(){
        String str = "";
        if (this.isNumero()) 
            str += String.format("<Numero: %d >", this.valore);
        else 
            str += String.format("<Simbolo: %s >", this.valore);
        return str + "\n";
    }
}