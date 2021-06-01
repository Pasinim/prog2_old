/**
 * Un pacchetto.
 *
 * <p>Questa classe è immutabile, per questa ragione è plausibile che i suoi attributi siano
 * pubblici.
 */
public class Pacchetto {
  public final int id;
  public final int totale;
  public final int progressivo;
  public final String testo;

  // La rappresentazione è valida se il [@link testo} non è {@code null}, il
  // numero {@link totale} di pacchetti è positivo, così come lo è il numero
  // {@link progressivo} (che deve essere non negativo); tale invariante è
  // assicurato dall'unico costruttore, per cui è ovvio che resta sempre valido
  // (essendo immutabile ogni attributo).

  public Pacchetto(final int id, final int totale, final int progressivo, final String testo) {
    this.id = id;
    if (totale <= 0) throw new IllegalArgumentException("totale deve essere positivo");
    this.totale = totale;
    if (progressivo < 0 || progressivo >= totale)
      throw new IllegalArgumentException("progressivo deve appartenere a [0, totale)");
    this.progressivo = progressivo;
    if (testo == null) throw new NullPointerException("testo non può essere null");
    this.testo = testo;
  }

  public static Pacchetto parsePacchetto(final String pacchetto) {
    if (pacchetto == null) throw new NullPointerException("pacchetto non può essere null");
    final String[] parts = pacchetto.split("\t");
    try {
      return new Pacchetto(
          Integer.parseInt(parts[0]),
          Integer.parseInt(parts[1]),
          Integer.parseInt(parts[2]),
          parts[3]);
    } catch (NumberFormatException | IndexOutOfBoundsException e) {

      // catturo due eccezioni legate all'implementazione e le sollevo ad un livello più alto
      // adatto all'astrazione corrente
      throw new IllegalArgumentException("non è stato possibile effettuare il parse del pacchetto");
    }
  }

  @Override
  public String toString() {
    return String.format("%d\t%d\t%d\t%s", id, totale, progressivo, testo);
  }
}
