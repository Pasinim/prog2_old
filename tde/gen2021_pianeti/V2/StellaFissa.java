package gen2021_pianeti.V2;
/**
 * Le istanze di questa classe rappresentano una stella fissa, identificata
 * da un nome e da una posizione (immutabile).
 * La velocità delle stelle fisse è 0, di conseguenza anche U è 0.
 */
public class StellaFissa extends CorpoCeleste{
    public final Punto velocita;
    private long cinetica;

    public StellaFissa(String nome, Punto posizione){
        super(nome, posizione);
        this.cinetica = this.getPosizione().norma();
        this.velocita = new Punto(0, 0, 0);
    }

    @Override
    public long getK() {
        return this.cinetica;
    }

    @Override
    public long getU() {
        return 0;
    }
}
