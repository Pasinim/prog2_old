package set2020_bancarellel.V2;

import java.util.Iterator;
import java.util.*;

/**
 * IR: listino.size = inventario.size
 *      listino != null
 *      proprietario != null
 *      inventario != null
 */
public class Bancarella {
    public final String proprietario;
    public final Inventario inventario;
    public final Listino listino;

    public Bancarella(String nome){
        this.proprietario = nome;
        inventario = new Inventario();
        listino = new PoliticaUnitaria();
    }

    /**
     * Aggiunge il giocattolo g, di prezzo unitario p, a this
     * @param g Giocattolo da inserire
     * @param prezzo Prezzo unitario di g
     */
    public void aggiungiToBancarella(Giocattolo g, int p){
        inventario.aggiungi(g);
        listino.aggiornaPrezzi(g, p);
    }

    /**
     * Rimuove q giocattoli g da this.inventario
     * @param g Giocattolo da rimuovere
     * @param q Quantità di g
     */
    public void rimuoviFromBancarella(Giocattolo g, int q){
        //not null, q < 0...
      
        
    }



    private boolean repOK(){
        return (listino.size() == inventario.size());
    }
    
    @Override 
    public String toString(){
        Iterator<Giocattolo> it = this.inventario.giocattoli();
        String str = String.format("Bancarella di: %s\n", this.proprietario);
        //devo iterare su ogni giocattolo con iteratore + prezzoTotale(g, 1);
        while (it.hasNext()){
            Giocattolo g = it.next();
            str = str + String.format("num: %d %s, prezzo: %d\n", inventario.getQuantita(g), g.toString(), listino.prezzoTotale(g, 1));
        }
        return str;
    }

    public static void main(String[] args) {
        Bancarella b = new Bancarella("pippo");

        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String s = input.nextLine();
            String tokens[] = s.split(" "); 
            int quantita = Integer.parseInt(tokens[0]);
            String giocattolo = tokens[1];
            String materiale = tokens[2];
            int prezzoUnitario = Integer.parseInt(tokens[3]);
            Giocattolo g = new Giocattolo(giocattolo, materiale);
            for (int i = 0; i < quantita; i++)
                b.aggiungiToBancarella(g, prezzoUnitario);
        }
        input.close();

        System.out.println(b.toString());
    }

}
