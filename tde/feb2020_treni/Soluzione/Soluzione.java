import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Soluzione {

  public static void main(String[] args) {
    final Map<String, Rotabile> modello2Rotabile = new HashMap<>();

    try (Scanner s = new Scanner(System.in)) {
      while (s.hasNextLine()) {
        final String line = s.nextLine();
        Rotabile r;

        switch (line.charAt(0)) {
        case 'L':
          r = Locomotore.fromString(line.substring(2));
          break;
        case 'V':
          r = Vagone.fromString(line.substring(2));
          break;
        default:
          throw new IllegalArgumentException();
        }

        modello2Rotabile.put(r.modello, r);
        System.out.println(r);
      }
    }

    final String nome = args[0];
    final List<Rotabile> composizione = new ArrayList<>();

    for (int i = 1; i < args.length; i++)
      composizione.add(modello2Rotabile.get(args[i]));

    final Convoglio c = new Convoglio(nome, composizione);
    System.out.println(c);
  }
}