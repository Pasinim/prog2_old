package giu2021_battagliaNavale.V2;

public enum Tipo {
    P(8), 
    C(2), 
    F(7), 
    S(5);
    int numPosizioni;
    Tipo(int numPosizioni){
        this.numPosizioni = numPosizioni;
    }
}