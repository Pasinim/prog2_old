import java.util.Objects;

public class Rotabile {

  public final String modello;
  public final int peso;

  public Rotabile(final String modello, final int peso) {
    this.modello = Objects.requireNonNull(modello);

    if (peso <= 0)
      throw new IllegalArgumentException();
    this.peso = peso;
  }
}