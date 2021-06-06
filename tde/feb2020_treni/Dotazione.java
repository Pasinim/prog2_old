import java.util.Objects;

public class Dotazione implements Comparable<Dotazione> {

  public final String nome;
  public final int quantità;

  public Dotazione(final String nome, final int quantità) {
    this.nome = Objects.requireNonNull(nome);

    if (quantità < 0)
      throw new IllegalArgumentException();
    this.quantità = quantità;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Dotazione))
      return false;

    return nome.equals(((Dotazione) obj).nome);
  }

  @Override
  public int hashCode() {
    return nome.hashCode();
  }

  @Override
  public int compareTo(Dotazione o) {
    return nome.compareTo(o.nome);
  }

  @Override
  public String toString() {
    return nome + " = " + quantità;
  }
}