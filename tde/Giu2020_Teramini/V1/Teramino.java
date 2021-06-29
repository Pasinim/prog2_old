package Giu2020_Teramini;
import java.util.Set;
import java.util.List;

/**
 * OVERVIEW: Le istanze di questa classe rappresentano un'interfaccia per i teramnini
 */

public interface Teramino {
    // Nelle interfacce non ci sono gli attributi
    // public final char nome;
    // public final String tipo;
    // public final List<Coordinata> coords;

    /**
     * @return coordinate di this
     */
    Set<Coordinata> getCoordinate();

     /**
     * @return nome di this
     */
    char getNome();

    /**
     * Effects: restituisce un nuovo teramino ottenuto dalla rotazione a dx di this.
     * Invocando ruota su un punto di coordinate <x, y> si ottiene <y, -x>
     * @return this ruotato di 90 gradi a dx
     */
    Teramino ruota();
    /**
     * @return restituisce il rettangolo che contiene this
     */
    Rettangolo getBoundingBox();

    //??
    Teramino createTeramino(Set<Coordinata> coord);
  }