package giu2021_battagliaNavale.Top_down;

public enum Tipo {
    P(8),
    F(7),
    C(2),
    S(5);
    
    public int numPosizioni;

    Tipo(int numPosizioni){
        this.numPosizioni = numPosizioni;
    }

}
