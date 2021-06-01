import java.lang.Math;
import java.util.Objects;

// Un pianeta è un corpo celeste con posizione velocità non null, questo fatto
// è vero in costruzione e mai modificato da alcun metodo; sebbene velocità e
// posizione siano sostituite dai metodi mutazionali, i campi possono essere
// esposti senza rischi in quanto immutabili
public class Pianeta extends CorpoCeleste {

  private Punto posizione, velocità;

  public Pianeta(final String nome, final int x, final int y, final int z) {
    super(nome);

    posizione = new Punto(x, y, z);
    velocità = new Punto(0, 0, 0);
  }

  @Override
  public void aggiornaPosizione() {
    posizione = posizione.somma(velocità);
  }

  @Override
  public void aggiornaVelocità(final CorpoCeleste c) {
    Objects.requireNonNull(c, "c non può essere null");

    Punto d = posizione.sottrai(c.posizione());
    velocità = velocità.somma(new Punto((int) Math.signum(d.x), (int) Math.signum(d.y), (int) Math.signum(d.z)));
  }

  @Override
  public String toString() {
    return String.format("Pianeta, nome: %s, pos: %s, vel: %s", nome, posizione, velocità);
  }

  @Override
  public Punto posizione() {
    return posizione;
  }

  @Override
  public Punto velocità() {
    return velocità;
  }
}