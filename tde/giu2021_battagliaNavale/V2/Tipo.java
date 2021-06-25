package giu2021_battagliaNavale.V2;

public enum Tipo{
    P(8),
    F(7),
    S(5),
    C(2);

    int numPosizioni;

    private Tipo(int numPosizioni){
        this.numPosizioni = numPosizioni;
        }
    }



