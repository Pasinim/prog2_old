/**
 * Un messaggio.
 *
 * <p>Questa classe consente di ricevere (e raccogliere) una sequenza di pacchetti (con lo stesso
 * identificatore), impedendo che vengano ricevuti due pacchetti con lo stesso numero progressivo.
 * Una volta ricevuti tutti i pacchetti, questa classe diventa sostanzialmente immutabile (perché
 * l'unico metodo mutazionale solleva eccezione comunque invocato).
 */
public class Messaggio {

  // La rappresentazione di un messaggio è data dal suo {@link id} e da un array
  // dei suoi {@link pacchetti}; tale array è {@code null} in posizione i-esima
  // se e solo se l'i-esimo pacchetto non è ancora stato ricevuto (non è possibile
  // ricevere più volte un pacchetto con lo stesso numero progressivo); la
  // variabile {@link ricevuti} corrisponde al numero di pacchetti ricevuti.
  // Tale invariante è assicurato dall'unico costruttore e resta vero alla chiamata
  // {@link #aggiungi(Pacchetto)} (unico metodo mutazionale).

  public final int id;
  private final Pacchetto[] pacchetti;
  private int ricevuti;

  /**
   * Costruisce un messaggio atto a contenere tutti i pacchetti con il medesimo identificatore del
   * pacchetto dato.
   *
   * <p>Se {@code p} è {@code null} verrà sollevata l'eccezione {@link IllegalArgumentException}.
   *
   * @param p un pacchetto.
   */
  public Messaggio(final Pacchetto p) {
    if (p == null) throw new NullPointerException("pacchetto non può essere null");
    this.id = p.id;
    pacchetti = new Pacchetto[p.totale];
    pacchetti[p.progressivo] = p;
    ricevuti = 1;
  }

  /**
   * Aggiunge un pacchetto al messaggio.
   *
   * <p>Se {@code p} è {@code null}, o se appartiene ad un messaggio con un numero identificativo
   * diverso da quello del messaggio corrente, verrà sollevata l'eccezione {@link
   * IllegalArgumentException}.
   *
   * @param p un pacchetto.
   */
  public void aggiungi(final Pacchetto p) {
    if (p == null) throw new NullPointerException("pacchetto non può essere null");
    if (pacchetti[p.progressivo] != null)
      throw new IllegalArgumentException(
          "è già presente un pacchetto con lo stesso numero progressivo");
    pacchetti[p.progressivo] = p;
    ricevuti++;
  }

  public boolean completo() {
    return ricevuti == pacchetti.length;
  }

  /**
   * Restituisce l'elenco dei testi dei pacchetti ricevuti in ordine progressivo e separati da
   * a-capo.
   */
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Pacchetto p : pacchetti) if (p != null) sb.append(p.testo + "\n");
    return sb.toString();
  }
}
