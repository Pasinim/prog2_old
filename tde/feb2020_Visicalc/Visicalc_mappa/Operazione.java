package tde.feb2020_Visicalc.Visicalc_mappa;

public class Operazione {
    private char operazione;
    public Operazione(char op){
        if (op != '+' && op != '-' && op != '*') throw new IllegalArgumentException("Operazione non supportata");
        this.operazione = op;
    }
    public int calcola(Cella c1, Cella c2){
        if (this.operazione == '+')
            return c1.getContenuto() + c2.getContenuto();
        if (this.operazione == '-')
            return c1.getContenuto() - c2.getContenuto();
        if (this.operazione == '*')
            return c1.getContenuto() * c2.getContenuto();
        return 0;
    }
}
