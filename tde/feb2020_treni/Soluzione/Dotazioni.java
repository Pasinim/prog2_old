import java.util.Collection;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class Dotazioni {

  private final SortedMap<String, Dotazione> nome2Dotazione = new TreeMap<>();

  public void aggiungi(final Dotazione d) {
    final Dotazione t = nome2Dotazione.get(d.nome);

    nome2Dotazione.put(d.nome, t == null ? d : new Dotazione(d.nome, d.quantità + t.quantità));
  }

  public void aggiungi(final Collection<Dotazione> dotazioni) {
    for (Dotazione d : dotazioni)
      aggiungi(d);
  }

  public Collection<Dotazione> dotazioni() {
    return Collections.unmodifiableCollection(nome2Dotazione.values());
  }

  @Override
  public String toString() {
    return dotazioni().toString();
  }
}