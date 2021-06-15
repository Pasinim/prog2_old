import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

/**
 * OVERVIEW: classe astratta che rappresenta una nave di battaglia navale.
 * 
 */
public abstract class Nave {
    protected char nome;
    public final Coordinata posizione_iniziale;
    protected List<Coordinata> posizione;
    protected int danno;
    protected boolean affonda;
    public final boolean isVertical;

    /**
     * EFFECTS: inizializza una nuova nave
     * @param isVertical 'V' se la nave sarà in verticale, 'O' se in orizzontale
     * @param coord Prima posizione occupata nella griglia 
     */
    public Nave(char isVertical, Coordinata coord) {
        if (isVertical != 'O' && isVertical != 'V')
            throw new IllegalArgumentException(
                    "La nave può essere solo in orizzontale (O) o in verticale (V). Trovato " + isVertical);
        if (isVertical == 'V')
            this.isVertical = true;
        else
            this.isVertical = false;
        this.danno = 0;
        this.affonda = false;
        this.posizione_iniziale = coord;
        this.posizione = new ArrayList<Coordinata>();
        this.nome = '~';
    }

    /**
     * EFFECTS: incrementa di uno this.danno
     */
    public void aggiungiDanno() {
        this.danno++;
    }
}