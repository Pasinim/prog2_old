package tde.feb2020_Visicalc.Visicalc_mappa;

public class Test {
    public static void main(String[] args) {
        Foglio f = new Foglio(3);
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        for(String line = reader.readLine(); line != null; line = reader.readLine()){
            String[] token = line.split(" ");
            String cmd = token[0];
            switch (cmd){
                case "!": //aggiorno la cella
                Operazione op = new Operazione(token[3]);
                String[] celle = token[4].split(";");
                for (int i=0; i < celle.length; i++){
                    int colonna = celle[i].charAt[0];
                    int riga = Integer.valueOf(celle[i].substring(1));
                    Coord c = new Coord(riga, colonna);

                }



            }
        
    }
}
