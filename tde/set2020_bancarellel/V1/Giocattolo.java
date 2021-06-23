package set2020_bancarellel;
/*
 * Le istanze di questa classe rappresentano un giocattolo. 
 * La classe è immutabile 
 * ABS FUN: this.nome + " di " + materiale
 * REP INV: nome, materiale != null
 */

public class Giocattolo {
    //variabili che rappresentano il nome e il materiale 
    private final String nome;
    private final String materiale;

    /**
     * EFFECTS: inizializza un nuovo giocattolo
     * @param nome nome del giocattolo
     * @param materiale materiale del giocattolo
     */
    public Giocattolo(String nome, String materiale){
        this.nome = nome;
        this.materiale = materiale;
    }

    private boolean repOK(){
        return (this.nome != null 
                && this.materiale != null);
    }
    
    @Override
    public boolean equals (Object o){
        if (!(o instanceof Giocattolo)) return false;
        Giocattolo other = (Giocattolo) o;
        if (!(this.nome.equals(other.nome))) return false;
        if (!(this.materiale.equals(other.materiale))) return false;
        return true;
    }

    @Override
    public String toString(){
        return this.nome + " di " + materiale;
    }

    @Override
    public int hashCode(){
        int result = this.nome.hashCode();
        result = result * 37 + this.materiale.hashCode();
        return result;
    }

}
