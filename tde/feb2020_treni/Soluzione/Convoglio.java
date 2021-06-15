import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Convoglio {

  public final String nome;
  public final long peso;

  private final List<Rotabile> composizione;
  private final Dotazioni dotazioni = new Dotazioni();

  public Convoglio(final String nome, final List<Rotabile> composizione) {
    this.nome = Objects.requireNonNull(nome);

    Objects.requireNonNull(composizione);
    if (composizione.size() < 1)
      throw new IllegalArgumentException();
    this.composizione = Collections.unmodifiableList(new ArrayList<>(composizione));

    long peso = 0;
    for (final Rotabile r : composizione) {
      if (r == null)
        throw new NullPointerException();

      peso += r.peso;

      if (r instanceof Vagone)
        dotazioni.aggiungi(((Vagone) r).dotazioni());
    }

    this.peso = peso;
  }

  public Rotabile testa() {
    return composizione.get(0);
  }

  public Rotabile coda() {
    final int size = composizione.size();

    if (size > 1)
      return composizione.get(size - 1);

    return null;
  }

  public long potenza() {
    final Rotabile testa = testa(), coda = coda();

    if (!(testa instanceof Locomotore))
      return 0;

    long potenza = ((Locomotore) testa).potenza;
    if (coda instanceof Locomotore)
      potenza += ((Locomotore) coda).potenza / 2;

    return potenza;
  }

  public boolean valido() {
    return peso <= potenza();
  }

  public List<Rotabile> composizione() {
    return composizione;
  }

  @Override
  public String toString() {
    return "Convoglio: nome = " + nome + ", peso = " + peso + ", potenza = " + potenza() + ", dotazioni " + dotazioni
        + (valido() ? ", valido" : ", non valido");
  }
}