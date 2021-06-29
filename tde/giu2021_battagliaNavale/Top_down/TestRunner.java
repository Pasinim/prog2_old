
public class TestRunner {
	final private	Object[] elements;
	private int next;

	public TestRunner(int n) {
		elements = new Object[n];
		next = 0;
	}

	// EFFECTS: restituisce il index tale che se element appartiene all'insieme, elements[idx] e element
						// altrimenti - 1
	private int indexOf(Object element) {
		for (int i = 0; i < next; i++) {
			if (elements[i].equals(element))
				return i;
		}

		return -1;
	}

	public boolean insert(Object element) {
		final int idx = indexOf(element);
		if (idx != -1)
			return false;

		if (next == elements.length)
			throw new IllegalStateException("The set is full");
		
		elements[next++] = element;
		return true;
	}

	public Object choose() {
		if (next == 0)
			throw new IllegalAccessError();
		return elements[0];
	}
public static void main(String[] args) {
    // client
    // lo uso come insieme di string
    TestRunner set = new TestRunner(10);
    System.out.println(set.insert("pippo"));
    System.out.println(set.insert(3));
    // problemi a dover fare try catch per il cast
    
}
}
