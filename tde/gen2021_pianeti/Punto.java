package tde.gen2021_pianeti;
/**
 * Le istanze di questa classe rappresentano un punto (tridimensionale) nello spazio. 
 * Le istanze sono immutabili.
 * 
 * AF: AF(x, y, z) = Punto(x, y, z)
 * REP INV: 
 */

public class Punto {
    /**
     * Attributi che rappresentano le coordinate della posizione di un punto nello spazio.
     */
    private final int x;
    private final int y;
    private final int z;
    public Punto(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /**
     * Restituisce le coordindate di this: arr[0] = this.x, arr[1] = this.y, arr[2] = this.z
     * @return Array contenente le coordinate di this
     */
    public int[] getCoordinate(){
        int[] c = new int[3];
        c[0] = this.x;
        c[1] = this.y;
        c[2] = this.z;
        return c;
    }

    /**
     * Inizializza un nuovo punto ottenuto sommando this e p e lo restituisce
     * @param p Punto da sommare a this
     * @return  Punto ottenuto dalla somma dei punti this e p
     */
    public Punto somma(Punto p){
        return new Punto(this.x + p.x, this.y + p.y, this.z + p.z);
    } 
    
    /**
     * Inizializza un nuovo punto ottenuto dalla sottrazione di this e p e lo restituisce
     * @param p Punto da sottrarre a this
     * @return  Punto ottenuto dalla differenza dei punti this e p
     */
    public Punto sottrai(Punto p){ 
        return new Punto (this.x - p.x, this.y - p.y, this.z - p.z);
    }
    
    /**
     * Calcola la somma dei valori assoluti delle cordinate di un punto
     * @return Somma dei valori assoluti delle coordinate del punto
     */
    public int norma(){
        return Math.abs(this.x) +  Math.abs(this.y) +  Math.abs(this.z);
    }

    /**
     * @param o Punto da confrontare
     * @return True se this.x >= o.x, false altrimenti
     */
    public boolean isAscissaMaggiore(Punto o){
        if (this.getCoordinate()[0] >= o.getCoordinate()[0]) return true;
        return false;   
     }
     
     /**
     * @param o Punto da confrontare
     * @return True se this.y >= o.y, false altrimenti
     */
    public boolean isOrdinataMaggiore(Punto o){
        if (this.getCoordinate()[1] >= o.getCoordinate()[1]) return true;
        return false;   
    }

    /**
     * @param o Punto da confrontare
     * @return True se this.z >= o.z, false altrimenti
     */
    public boolean isQuotaMaggiore(Punto o){
        if (this.getCoordinate()[2] >= o.getCoordinate()[2]) return true;
        return false;   
    }

    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
    
}
