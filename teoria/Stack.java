
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Example of an iterable bounded integer stack built using <a
 * href="https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html">Anonymous Nested
 * Classes</a>.
 */
public class BoundedIntStackAI {

  private final int[] numbers;
  private int free; //prima posizione dell'array

  public BoundedIntStackAI(int n) {
    numbers = new int[n];
    free = 0;
  }

  public boolean isFull() {
    return free == numbers.length;
  }

  public void push(int x) {
    if (isFull()) throw new IllegalStateException("Stack is full");
    numbers[free++] = x;
  }

  public boolean isEmpty() {
    return free == 0;
  }

  public int pop() {
    if (isEmpty()) throw new IllegalStateException("Stack is empty");
    return numbers[--free];
  }

  public Iterator<Integer> content() {

    return new Iterator<Integer>() {

      private int i = 0;

      @Override
      public boolean hasNext() {
        return i < free;
      }

      @Override
      public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        return numbers[i++];
      }
    };
  }
}
