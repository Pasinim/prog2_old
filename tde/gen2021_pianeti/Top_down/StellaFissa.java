package gen2021_pianeti.Top_down;
/**
 * Le istanze di questa classe rappresentano una stella fissa, identificata
 * da un nome e da una posizione (immutabile).
 * La velocità delle stelle fisse è 0, di conseguenza anche U è 0.
 */

public class StellaFissa extends CorpoCeleste {
    public final Punto posizioneFissa;

    public StellaFissa(String nome, Punto posizione){
        super(nome, posizione);
        this.posizioneFissa = posizione;
    }

    @Override
    public int getK() {
        return 0;
    }

    @Override
    public int getU() {
        return 0;
    }

    @Override
    public int getVelocita() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void iterazione(CorpoCeleste c) {
        // TODO Auto-generated method stub
        
    }
    
}
