import java.util.Objects;

/**
 * An immutable pair of coordinates of a pixel.
 *
 * <p>It is a *value* class: two coordinates are considered equal if their rows and columns are
 * respectively equal.
 */
public class Coord {

  // The representation invariant is always true: any pair of integers is a valid
  // coordinate
  public final int r, c;

  public Coord(final int r, final int c) {
    this.r = r;
    this.c = c;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Coord)) return false;
    final Coord other = (Coord) obj;
    return c == other.c && r == other.r;
  }

  @Override
  public int hashCode() {
    return Objects.hash(c, r);
  }

  @Override
  public String toString() {
    return String.format("(%d, %d)", r, c);
  }
}
