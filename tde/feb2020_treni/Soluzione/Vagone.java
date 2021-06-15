import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

public class Vagone extends Rotabile {

  private final Dotazioni dotazioni;

  public Vagone(final String modello, final int peso, final Dotazioni dotazioni) {
    super(modello, peso);

    this.dotazioni = Objects.requireNonNull(dotazioni);
  }

  public static Vagone fromString(final String stringa) {
    try (final Scanner s = new Scanner(stringa)) {
      try {
        final String modello = s.next();
        final int peso = s.nextInt();
        final Dotazioni dotazioni = new Dotazioni();

        while (s.hasNext())
          dotazioni.aggiungi(new Dotazione(s.next(), s.nextInt()));

        return new Vagone(modello, peso, dotazioni);
      } catch (NoSuchElementException e) {
        throw new IllegalArgumentException(e);
      }
    }
  }

  public Collection<Dotazione> dotazioni() {
    return dotazioni.dotazioni();
  }

  @Override
  public String toString() {
    return "Vagone: modello = " + modello + ", peso = " + peso + ", dotazioni = " + dotazioni;
  }
}