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
    public Punto getVelocita() {
        // TODO Auto-generated method stub
        return new Punto(0, 0, 0);
    }

    @Override 
    public String toString(){
        //return this.toString() + ", Velocita: " + this.velocita.toString() + "\n";
        return String.format("%s: %s, Velocità: %s", nome,  getPosizione().toString(), getVelocita().toString());

    }

	@Override
	public void setVelocita(Punto p) {
		return;
	}

    @Override
    public boolean equals(Object obj){
        if (super.equals(obj)) return true;
        if (!(obj instanceof StellaFissa)) return false;
        StellaFissa o = (StellaFissa) obj;
        if (!(this.nome.equals(o.nome))) return false;
        return true;
    }

}
