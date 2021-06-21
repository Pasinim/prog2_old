package giu2021_battagliaNavale;

/** enum contenente i tipi di nave */

public enum Tipo{
    P(8),
    F(7),
    S(5),
    C(2);

    int numPosizioni;

    Tipo(int numPosizioni){
        this.numPosizioni = numPosizioni;
        }
    }
