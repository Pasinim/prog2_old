package set2020_bancarellel.V2;

import java.util.*;

public class TestRunner {
    public static void main(String[] args) {
        int num_bancarelle;
        Set<Bancarella> bancarelle = new HashSet<>();
        Scanner input = new Scanner(System.in);

        while (input.hasNext()){
            String line = input.nextLine();
            String tokens[] = line.split(" ");
            num_bancarelle = Integer.parseInt(tokens[0]);
            for (int i = 0; i < num_bancarelle; i++){
                String line2 = input.nextLine();
                tokens = line2.split(" ");
                String proprietario = tokens[0];
                Bancarella b = new Bancarella(proprietario);
                bancarelle.add(b);
                int num_giocattoli = Integer.parseInt(tokens[1]);
                for (int j = 0; j < num_giocattoli; j++){
                    String line3 = input.nextLine();
                    tokens = line3.split(" ");
                    int quantita = Integer.parseInt(tokens[0]);
                    Giocattolo g = new Giocattolo(tokens[1], tokens[2]);
                    int prezzo = Integer.parseInt(tokens[3]);
                    for (int k = 0; k < quantita; k++)
                        b.aggiungiToBancarella(g, prezzo);      

                }
            }
        }

        
        Iterator<Bancarella> it = bancarelle.iterator();
        Bancarella curr;
        while (it.hasNext()){
            curr = it.next();
            System.out.println(curr.toString());
        }
        
        Compratore c = new CompratoreUnitario(bancarelle);
        Acquisto a = c.compra(11, new Giocattolo("soldatino", "stagno"));
        System.out.println(a.toString());
        
        it = bancarelle.iterator();
        while (it.hasNext()){
            curr = it.next();
            System.out.println(curr.toString());
        }
    }
}
