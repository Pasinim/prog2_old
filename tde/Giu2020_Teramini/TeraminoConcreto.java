package Giu2020_Teramini;

import java.util.NavigableSet;
import java.util.Set;
import java.util.Set;

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
    public TeraminoConcreto(char nome, NavigableSet<Coordinata> c){
        if (c == null) throw new NullPointerException();
        c = new NavigableSet<Coordinata>();
        this.nome = nome;
        this.coords = c;
        this.boundingBox = new Rettangolo(c);
    }

    @Override
    public NavigableSet<Coordinata> getCoordinate() {
        return this.coords;
    }

    @Override
    public char getNome() {
        return this.nome;
    }

    //<x, y> si ottiene <y, -x>
    @Override
    public Teramino ruota() {
        Set<Coordinata> newCoords = new NavigableSet<Coordinata>();

        //devo fare il ciclo con l'iteratore 
        for (int i = 0; i < coords.size(); i++){
            int newX = this.coords.get(i).getY();
            int newY = -this.coords.get(i).getX();
            newCoords.add(new Coordinata(newX, newY));
        }
        TeraminoConcreto ruotato = new TeraminoConcreto(this.nome, Set<Coordinata> newCoords);
        return ruotato;
    }

    @Override
    public Rettangolo getBoundingBox() {
        return this.boundingBox();
    }

    @Override
    public Teramino createTeramino(Set<Coordinata> coord) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
