package gen2021_pianeti.Top_down;
import java.util.*;

/**
 * Le istanze di questa classe rappresentano un sistema astronomico, identificato
 * da un tempo e da una collezione di pianeti e stelle fisse.
 Un sistema astronomico è una collezione di pianeti e stelle fisse. 
 Questo deve essere in grado di eseguire una simulazione (come quella di cui sopra)
 per un intervallo di tempo arbitrario (esprimibile come intero),
 e di calcolare l'energia totale del sistema nella configurazione in cui viene a trovarsi trascorso questo tempo.
 * 
 */


public class SistemaAstronomico {
   public final Set<CorpoCeleste> sistema;
   private int tempo; 

   public SistemaAstronomico(int tempo){
       this.sistema = new HashSet<CorpoCeleste>();
       this.tempo =  tempo;
   }

   public void aggiungiCorpo(CorpoCeleste c){
        sistema.add(c);
   }

   public void simula(){
       for (int i = 0; i < tempo; i++){
           iterazioneTraPosizioni();
           iterazioneTraVelocita();
       }
   }

   /**
    * Confronta tutte le coppie di corpi celesti nel sistema e modifica la loro 
    * velocità in base alla loro posizione.
    * Cambia la velocità di ciascun pianeta in base alla seguente formula:
    * se x > x', l'ascissa della velocità di A aumenta di 1;
    * se x < x', l'ascissa della velocità di A diminuisce di 1.
    */
   public void iterazioneTraPosizioni() {
    Punto x = new Punto(1, 0, 0);
    Punto y = new Punto(0, 1, 0);
    Punto z = new Punto(0, 0, 1);
    Iterator<CorpoCeleste> it = sistema.iterator();
    Iterator<CorpoCeleste> it2 = sistema.iterator();
    while (it.hasNext()){
        CorpoCeleste c1 = it.next();
        while (it2.hasNext()){
            CorpoCeleste c2 = it2.next();
            if (c2.equals(c1)) continue;
            //ascisse
            if (c2.getPosizione().x > c1.getPosizione().x){
                c2.setVelocita(c2.getVelocita().somma(x));
                c1.setVelocita(c1.getVelocita().sottrai(x));
            }
            else if (c2.getPosizione().x < c1.getPosizione().x){
                c1.setVelocita(c1.getVelocita().somma(x));
                c2.setVelocita(c2.getVelocita().sottrai(x));
            }
        
            //ordinate 
            if (c2.getPosizione().y > c1.getPosizione().y){
                c2.setVelocita(c2.getVelocita().somma(y));
                c1.setVelocita(c1.getVelocita().sottrai(y));
            }
            else if (c2.getPosizione().y < c1.getPosizione().y){
                c1.setVelocita(c1.getVelocita().somma(y));
                c2.setVelocita(c2.getVelocita().sottrai(y));
            } 
        
            //z
            if (c2.getPosizione().z > c1.getPosizione().z){
                c2.setVelocita(c2.getVelocita().somma(z));
                c1.setVelocita(c1.getVelocita().sottrai(z));
            }
            else if (c2.getPosizione().z < c1.getPosizione().z){
                c1.setVelocita(c1.getVelocita().somma(z));
                c2.setVelocita(c2.getVelocita().sottrai(z));
                } 
        }
    }
    }

    /**
    * Confronta tutte le coppie di corpi celesti nel sistema e modifica la loro 
    * posizione in base alla loro velocità.
    */
    public void iterazioneTraVelocita() {
        Punto x = new Punto(1, 0, 0);
        Punto y = new Punto(0, 1, 0);
        Punto z = new Punto(0, 0, 1);
        Iterator<CorpoCeleste> it = sistema.iterator();
        Iterator<CorpoCeleste> it2 = sistema.iterator();
        while (it.hasNext()){
            CorpoCeleste c1 = it.next();
            while (it2.hasNext()){
                CorpoCeleste c2 = it2.next();
                if (c2.equals(c1)) continue;
                //ascisse
                if (c2.getVelocita().x > c1.getVelocita().x){
                    c2.setPosizione(c2.getPosizione().somma(x));
                    c1.setPosizione(c1.getPosizione().sottrai(x));
                }
                else if (c2.getVelocita().x < c1.getVelocita().x){
                    c1.setPosizione(c1.getPosizione().somma(x));
                    c2.setPosizione(c2.getPosizione().sottrai(x));
                }
            
                //ordinate 
                if (c2.getVelocita().y > c1.getVelocita().y){
                    c2.setPosizione(c2.getPosizione().somma(y));
                    c1.setPosizione(c1.getPosizione().sottrai(y));
                }
                else if (c2.getVelocita().y < c1.getVelocita().y){
                    c1.setPosizione(c1.getPosizione().somma(y));
                    c2.setPosizione(c2.getPosizione().sottrai(y));
                } 
            
                //z
                if (c2.getVelocita().z > c1.getVelocita().z){
                    c2.setVelocita(c2.getPosizione().somma(z));
                    c1.setVelocita(c1.getPosizione().sottrai(z));
                }
                else if (c2.getVelocita().z < c1.getVelocita().z){
                    c1.setVelocita(c1.getPosizione().somma(z));
                    c2.setVelocita(c2.getPosizione().sottrai(z));
                    } 
            }
        }
        }
    @Override
    public String toString(){
        String str = "";
        Iterator<CorpoCeleste> it = sistema.iterator();
        while (it.hasNext())
            str += it.next().toString() + "\n";
        return str;
    }
    
    public static void main(String[] args) {
        SistemaAstronomico s = new SistemaAstronomico(1);
        CorpoCeleste p1 = new Pianeta("Marte", new Punto(1, 0 , 0));
        CorpoCeleste p2 = new StellaFissa("Pluto", new Punto(3, 3, 3));
        CorpoCeleste p3 = new Pianeta("Aippo", new Punto(1, 0, 1));
        CorpoCeleste p4 = new Pianeta("Piskis", new Punto(1, 3, 5));
        // System.out.println(p1.toString());
        // System.out.println(p2.toString());
        s.aggiungiCorpo(p1);
        s.aggiungiCorpo(p2);
       // s.aggiungiCorpo(p3);
       // s.aggiungiCorpo(p4);
        System.out.println(s.toString());
        s.simula();
        System.out.println(s.toString());




    }
}
