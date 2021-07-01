package giu2021_battagliaNavale.Top_down;
import java.util.*;

public class GrigliaStrategica {
    private char[][] griglia;

    public GrigliaStrategica(){
        griglia = new char[10][10];
        for (int r = 0; r < 10; r++)
            for (int c = 0; c < 10; c++)
                griglia[r][c] = '~'; 
    }

    /**
     * Modifica il valore della posizione c con il carattere car
     * @param c Posizione da modificare
     * @param car Carattere da inserire in c
     */
    public void updateValore(Posizione c, char car){
        Objects.requireNonNull(c);
        if (car != '*' && car != '#' && car != '.')
            throw new IllegalArgumentException();
        griglia[c.r][c.c] = car;
    }
}
