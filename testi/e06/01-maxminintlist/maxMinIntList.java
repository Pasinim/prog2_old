import java.util.List;
/**
 * OVERVIEW: le istanze di questa classe rappresentano una lista di interi
 *             gli oggetti sono immutabili.
 *              intList è una sequenza [x1, x2, ..., xn]
 */
public abstract class maxMinIntList extends List {
    //CAMPI 
    private List<Integer> list;
    private int max, min;

    //COSTRUTTORI
    public maxMinIntList(){
        super();
    }

    //METODI
    public void insert(int x){
        if (size() == 0 || x >= max) max=x;
        if (size() == 0 || x <= min) min=x;
        super.add(x);
    }

    public int smallest(){
        return this.min;
    }

    public int largest(){
        return this.max;
    }

    private boolean RepOK(){};

    @Override
    public String toString(){
        String str = "[ ";
        for (int i=0; i<super.size()-1; i++)    
            str += super.get(i) + ", ";
        str += super.get(super.size()-1) + " ]";
    }   

    @Override
    public int hashCode(){}
}