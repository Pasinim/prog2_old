package giu2021_battagliaNavale.V2;
import java.util.*;

public class GrigliaFlotta {
    private char[][] flotta;
    private Set<Nave> navi; 

    public GrigliaFlotta(){
        flotta = new char[10][10];
        for (int i = 0 ; i < 10; i++)
            for (int j = 0 ; j < 10; j++)
                flotta[i][j] = '~';
        navi = new HashSet<Nave>();
    }

    public void aggiungiNave(Nave n){
        Objects.requireNonNull(n);
        navi.add(n);
        //devo controllare che nessuna nave si sovrapponga
        for (Coordinata c : n.coordinate){
            flotta[c.r][c.c] = n.tipo.name().charAt(0);
        }
    }


    public boolean isHit(Coordinata c){
        if (flotta[c.r][c.c] != '~'){
            this.getNave(c).incrementaDanno();
            return true;
        }
        return false;
    }


    @Override
    public String toString(){
        String str = "";
        for (int i = 0 ; i < 10; i++){
            for (int j = 0 ; j < 10; j++)
                str += this.flotta[i][j];
            str += "\n";
        }
        return str;
    }

        /**
     * Restituisce la nave che occupa la coordinta C
     */
    public Nave getNave(Coordinata c){
        Iterator<Nave> it = navi.iterator();
        while (it.hasNext()){
            Nave curr = it.next();
            for (Coordinata x : curr.coordinate){
                if (c.equals(x))
                    return curr;
            }
        }
        return null;
    }
    public static void main(String[] args) {


        // GrigliaFlotta g = new GrigliaFlotta(); 
        // GrigliaStrategica s = new GrigliaStrategica();
        // 
        // Coordinata c1 = new Coordinata(1, 0);
        // g.aggiungiNave(n);
        
        // g.isHit(c);
        // g.isHit(c1);
        // // Nave x = g.getNave(c);
        // // System.out.println(x.toString());
        // System.out.println(g.isHit(new Coordinata(1, 0)));
    }


}
