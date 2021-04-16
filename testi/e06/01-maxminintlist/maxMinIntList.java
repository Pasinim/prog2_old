/**
 * OVERVIEW: le istanze di questa classe rappresentano una lista di interi
 *             gli oggetti sono immutabili.
 *              intList è una sequenza [x1, x2, ..., xn]
 */
public class maxMinIntList{
    //CAMPI 
    private List<Integer> list;

    //COSTRUTTORI
    public maxMinIntList(){
        list = new ArrayList<>();
    }

    //METODI
    public void insert(){};
    public int smallest(){};
    public int largest(){};
    private boolean RepOK(){};

    @Override
    public String toString(){
    } 

    @Override
    public int hashCode(){}
}