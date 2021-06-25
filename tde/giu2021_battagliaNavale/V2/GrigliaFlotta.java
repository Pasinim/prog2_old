package giu2021_battagliaNavale.V2;
import java.util.*;

public class GrigliaFlotta {
    private char[][] flotta;
    private Set<Nave> navi; 

    public GrigliaFlotta(){
        for (int i = 0 ; i < 10; i++)
            for (int j = 0 ; j < 10; j++)
                flotta[i][j] = '~';
        navi = new HashSet<Nave>();
    }

    public void aggiungiNave(Nave n){
        Objects.requireNonNull(n);
        navi.add(n);
        for (Coordinata c : n.coordinate)
            flotta[c.r][c.c] = n.tipo.name().charAt(0);
    }
}
