public class StellaFissa extends CorpoCeleste {

  private Punto posizione, velocità;

  public StellaFissa(final String nome, final int x, final int y, final int z) {
    super(nome);

    posizione = new Punto(x, y, z);
    velocità = new Punto(0, 0, 0);
  }

  @Override
  public void aggiornaPosizione() {
  }

  @Override
  public void aggiornaVelocità(final CorpoCeleste c) {
  }

  @Override
  public String toString() {
    return String.format("Stella fissa, nome: %s, pos: %s", nome, posizione);
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