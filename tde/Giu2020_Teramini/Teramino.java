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

    Set<Coordinata> getCoordinate();
    char getNome();
    Teramino ruota();
    Rettangolo getBoundingBox();
    Teramino createTeramino(Set<Coordinata> coord);
  }