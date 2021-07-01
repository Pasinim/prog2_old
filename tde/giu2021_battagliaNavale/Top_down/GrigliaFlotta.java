package giu2021_battagliaNavale.Top_down;
import java.util.*;
/**
 * Le istanze di questa classe rappresentano la griglia di un giocatore
 * In una griglia è possibile aggiungere le navi e controllare se un colpo 
 * ha colpito una nave
 */
public class GrigliaFlotta {
    private char[][] griglia;
    //ha senso o espongo la rep?? Fuori da griglai potrei comunque fare
    //navi.add per aggiungere. Dovrei mettere private final
    public final Set<Nave> navi;

    public void aggiungiNave(Nave n){
        Objects.requireNonNull(n);
        navi.add(n);
        popolaGrigliaFlotta();
    }

    /**
     * Inizializza una nuova flotta vuota
     */
    public GrigliaFlotta(){
        griglia = new char[10][10];
        navi = new HashSet<Nave>();
        for (int r = 0; r < 10; r++)
            for (int c = 0; c < 10; c++)
                griglia[r][c] = '~'; 
    }

    /**
     * Popola la griglia della flotta inserendo il carattere del tipo 
     * di ciascuna nave presente in this.navi
     */
    public void popolaGrigliaFlotta(){
        for (Nave n : navi){
            if (n.isVerticale){
                for (int i = 0; i < n.tipo.numPosizioni; i++)
                    griglia[n.start.r + i][n.start.c] = n.tipo.name().charAt(0);
            }else{
                for (int i = 0; i < n.tipo.numPosizioni; i++)
                    griglia[n.start.r][n.start.c + i] = n.tipo.name().charAt(0);
            }
        }
    }

    /**
     * Se nella posizione c è presente una nave nella griglai this 
     * restituisce true, false altrimenti
     * @param c Posizione 
     * @return True se c è occupata da una nave
     */
    public boolean isHit(Posizione c){
        if (griglia[c.r][c.c] != '~') return true;
        return false;
    }

    /**
     * Restituisce la nave che occupa la posizione p. 
     * Se non c'è nessuna nave restituisce null
     * @param p Posizione da ControlFlowAnchored
     * @return Nave in posizione p, null altrimenti
     */
    public Nave getNave(Posizione p){
        for (Nave n : navi){
            for (int i = 0; i < n.tipo.numPosizioni; i++){
                if (n.isVerticale){
                    System.out.println(String.format("\tSto confrontando %s con %s\n", n.start.incrementaRiga(i).toString(), p.toString() ));
                    if (n.start.incrementaRiga(i).equals(p)) return n;
                }
                else
                    if (n.start.incrementaColonna(i).equals(p)) return n;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        String str = "";
        for (int r = 0; r < 10; r++){
            for (int c = 0; c < 10; c++) 
                str += griglia[r][c];
            str += "\n";
        }
        return str;
    }

    public static void main(String[] args) {
        GrigliaFlotta f = new GrigliaFlotta();
        Posizione p = new Posizione('B' - 'A', 0 );
        Nave n = new Nave(Tipo.P, false, p);
        Posizione y = p.incrementaColonna(1);
        f.aggiungiNave(n);
        Posizione p2 = new Posizione('C' - 'A', 1 );
        f.aggiungiNave(new Nave(Tipo.C, true, p2));
        Nave x = f.getNave(y);
        System.out.println(x.toString());
    }
}
