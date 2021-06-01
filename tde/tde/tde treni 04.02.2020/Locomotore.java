import java.util.NoSuchElementException;
import java.util.Scanner;

public class Locomotore extends Rotabile {

  public final long potenza;
  
  public Locomotore(final String modello, final int peso, final int potenza) {
    super(modello, peso);

    if (potenza <= 0)
      throw new IllegalArgumentException();
    this.potenza = potenza;
  }

  public static Locomotore fromString(final String stringa) {
    try (final Scanner s = new Scanner(stringa)) {
      try {
        return new Locomotore(s.next(), s.nextInt(), s.nextInt());
      } catch (NoSuchElementException e) {
        throw new IllegalArgumentException(e);
      }
    }
  }

  @Override
  public String toString() {
    return "Locomotore: modello = " + modello + ", peso = " + peso + ", potenza = " + potenza;
  }
}