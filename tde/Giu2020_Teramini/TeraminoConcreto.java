package Giu2020_Teramini;

import java.util.Set;
import java.util.HashSet;

public class TeraminoConcreto implements Teramino {

    public final char nome;
    //public final char tipo;
    public final Set<Coordinata> coords;
    public final Rettangolo boundingBox;

    /**
     * EFFECTS: Inizializza un nuovo teramino. Se c è null solleva un'eccezione.
     * @param nome nome del teramino
     * @param c Insieme di coordinate occupate dal teramino
     */
    public TeraminoConcreto(char nome, Set<Coordinata> c){
        if (c == null) throw new NullPointerException();
        c = new HashSet<Coordinata>();
        this.nome = nome;
        this.coords = c;
        this.boundingBox = new Rettangolo(c);
    }

    @Override
    public Set<Coordinata> getCoordinate() {
        return this.coords;
    }

    @Override
    public char getNome() {
        return this.nome;
    }

    //<x, y> si ottiene <y, -x>
    @Override
    public Teramino ruota() {
        Set<Coordinata> newCoords = new HashSet<Coordinata>();
        for (Coordinata c : this.coords){
            newCoords.add(new Coordinata(c.y, -c.x));
        }
        TeraminoConcreto ruotato = new TeraminoConcreto(this.nome, newCoords);
        return ruotato;
    }

    @Override
    public Rettangolo getBoundingBox() {
        return this.boundingBox;
    }

    @Override
    public Teramino createTeramino(Set<Coordinata> coord) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString(){
        
    }
    
}
