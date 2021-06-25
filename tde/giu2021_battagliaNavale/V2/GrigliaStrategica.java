package giu2021_battagliaNavale.V2;
import java.util.*;

public class GrigliaStrategica {
    private char[][] griglia;

    public GrigliaStrategica(){
        griglia = new char[10][10];
        for (int i = 0 ; i < 10; i++)
            for (int j = 0 ; j < 10; j++)
                griglia[i][j] = '~';
    }
    
    public void updateValore(Coordinata c, char car){
        griglia[c.r][c.c] = car;
    }

    @Override
    public String toString(){
        String str = "";
        for (int i = 0 ; i < 10; i++){
            for (int j = 0 ; j < 10; j++)
                str += this.griglia[i][j];
            str += "\n";
        }
        return str;
    }
}
