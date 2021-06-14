package Trasmissioni;
import java.util.Scanner;

//NOME ORARIO DURATA nome_trasmissione
public class Test {
    
    
    public static void main(String[] args) {

        Palinsesto palinsesto = new Palinsesto();
        Scanner input = new Scanner (System.in);
        while (input.hasNext()){
            String line = input.nextLine();
            String[] tokens = line.split(" ");
            String cmd = tokens[0];
            switch (cmd){
                case "SEMPLICE":
                    String[] orario = tokens[1].split(":");
                    int ora = Integer.parseInt(orario[0]); 
                    int minuti = Integer.parseInt(orario[1]); 
                    FasciaOraria f = new FasciaOraria(new Betaorario(ora, minuti), Integer.parseInt(tokens[2]));
                    palinsesto.aggiungi(tokens[3], f);

            }
        }
        System.out.println(palinsesto.toString());
        input.close();
        // try {
        //     for (String line = reader.readLine(); line != null; line = reader.readLine()){
        //         String[] token = line.split(" ");
        //         String tipoTrasmissione = token[0];

        //         switch (tipoTrasmissione){
        //             case "SEMPLICE":
        //                 String[] orario = token[1].split(":");
        //                 int ora = Integer.parseInt(orario[0]);
        //                 int minuti = Integer.parseInt(orario[1]);
        //                 fascia = new FasciaOraria(new Betaorario(ora, minuti), Integer.parseInt(token[2]));
        //                 TrasmissioneSemplice t = new TrasmissioneSemplice(token[3], fascia);
        //                 palinsesto.aggiungi(t, fascia);
        //                 break;

        //             default:
        //                 fascia = new FasciaOraria(new Betaorario(1, 1), 1);
        //                 line = null;
        //         }
        //     }

        // }
        // catch (IOException e){
        //     System.out.println("Errore lettura input");
        //     e.printStackTrace();
        // }



        // Betaorario a = new Betaorario(29, 79);
        // Betaorario b = new Betaorario(29, 78);
        // Betaorario d = new Betaorario(29, 8);
        // List<Betaorario> l = new ArrayList<Betaorario>();
        // l.add(a);
        // l.add(b);
        // l.add(d);
       // Betaorario c = a.addBetaorario(b);
        //System.out.println(c.toString());
        //System.out.println(a.compareTo(b));
       // System.out.println(fascia.toString());
    }
}
