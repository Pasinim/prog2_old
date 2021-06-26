package gen2021_pianeti.V2;
/**
 * Le istanze di questa classe rappresentano una stella fissa, identificata
 * da un nome e da una posizione (immutabile).
 * La velocità delle stelle fisse è 0, di conseguenza anche U è 0.
 */
public class StellaFissa {
    public final Punto posizione;
    //public final Punto velocita; //ridondante??
    //public final long pontenziale; //ridondante>?
    public final String nome;
    private long cinetica;
}
