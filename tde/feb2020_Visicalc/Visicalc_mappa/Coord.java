package tde.feb2020_Visicalc.Visicalc_mappa;

public class Coord {
    private int x;
    private int y;
    public Coord(int r, int c){
        this.x = r;
        this.y = c - 'A';
    }
}
