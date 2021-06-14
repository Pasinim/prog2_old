package Trasmissioni;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//NOME ORARIO DURATA nome_trasmissione
public class Test {
    
    
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);
        FasciaOraria fascia;

        try {
            for (String line = reader.readLine(); line != null; line = reader.readLine()){
                String[] token = line.split(" ");
                String tipoTrasmissione = token[0];

                switch (tipoTrasmissione){
                    case "SEMPLICE":
                        int ora = Integer.parseInt(token[1].At(0) + token[1].charAt(1));
                        int minuti = Integer.parseInt(token[1].substring(3, 4));
                        fascia = new FasciaOraria(new Betaorario(ora, minuti), Integer.parseInt(token[2]));
                        System.out.println(fascia.toString());

                    default:
                        continue;
                }
            }

        }
        catch (IOException e){
            System.out.println("Errore lettura input");
            e.printStackTrace();
        }





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
