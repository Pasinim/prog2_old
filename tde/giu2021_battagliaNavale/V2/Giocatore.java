package giu2021_battagliaNavale.V2;

public class Giocatore {
    private GrigliaFlotta avversario;
    private GrigliaStrategica strategica;

    public Giocatore(){
        avversario = new GrigliaFlotta();
        strategica = new GrigliaStrategica();
    }

    public void colpisci(Coordinata c, GrigliaFlotta avversario){
        if (avversario.isHit(c)) 
            strategica.updateValore(c, '*');
        else 
            strategica.updateValore(c, '.');
    }
}
