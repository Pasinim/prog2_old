package giu2021_battagliaNavale.V2;


public class GrigliaStrategica {
    private Coordinata[][] grigliaStrategica;

    public GrigliaStrategica(){
        grigliaStrategica = new Coordinata[10][10];
    }

    public void updateValore(Coordinata c, char car){
        grigliaStrategica[c.x][c.y].updateValore(car);       
    }

    public void popolaGriglia(){
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                this.updateValore(new Coordinata(i, j), '~');         
    }


}
