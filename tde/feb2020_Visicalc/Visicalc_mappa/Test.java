package tde.feb2020_Visicalc.Visicalc_mappa;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Foglio f = new Foglio(3);
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        for(String line = reader.readLine(); line != null; line = reader.readLine()){
            String[] token = line.split(" ");
            String cmd = token[0];
            List<Cella> cells = new ArrayList<>();
            switch (cmd){
                case "!": //aggiorno la cella
                if (token[2] == '='){ //significa che c'è una formula
                    Operazione op = new Operazione(token[3]);
                    String[] celle = token[4].split(";");
                    for (int i=0; i < celle.length; i++){
                        int colonna = celle[i].charAt[0];
                        int riga = Integer.valueOf(celle[i].substring(1));
                        Coord c = new Coord(riga, colonna);
                        cells.add(f.getCella(c));
                    }

                }



            }
        
    }
}
