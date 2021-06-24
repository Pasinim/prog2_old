package set2020_bancarellel.V2;
/**
 * Interfaccia che implementa le varie politiche per determinare il prezzo totale
 * di un giocattolo in un inventario
 */
public interface Listino {
    /**
     * Dato un giocattolo dell'inventario e la quantità che si desidera
     * acquistare restituisce il prezzo totale
     * @param g Giocattolo da acquistare
     * @param quantita Quantita da acquistare
     * @return prezzo totale
     */
    public int getPrezzo(Giocattolo g);
    public void aggiornaPrezzi(Giocattolo g, int prezzo);
    public int size();
    @Override
    public String toString();
    @Override
    public int hashCode();
}
