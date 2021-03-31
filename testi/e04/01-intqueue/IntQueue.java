/** 
 * Le istanze di questa classe rappresentano code 
 * di interi FIFO. Gli oggetti sono mutabili
 */
public class IntQueue {
    //CAMPI
    //Struttura dati che contiene gli elementi di IntQUeue
    private final int[] els;
    /**
     * Head e tail rappresentano gli indici della coda .
     * Head indica il primo elemento di IntQueue, -1 se è vuota
     * Tail rappresenta la prima posizione disponibile, quando tail==head 
     * non è possibile aggiungere elementi
     */
    private int head, tail;
    //COSTRUTTORI
    /**
     *PRECONDIZONI: 
     *EFFETTI COLLATERALI:
     *POSTCONDIZIONI: restituisce una coda vuota di dimension n
     */
    public IntQueue(int n){
        els = new int[n];
        head=-1;
        tail=0;
    }
    /**
     * AF: Dominio: oggetti concreti, dominio: oggetto astratto:
     * AF(els, head, tail) -->  [elements[i] | tail <= i <= head ]= 
     *                          [] se tail = -1, la coda è vuota -> head=0
     *                          se head<tail: (elements[h], elements[h+1] ... elements[t-1])
     *                          se head>tail: (eleements[h], elements[h+1], .... elements[elements.size-1], elements[0], ... , elements[t-1])
     * IR: - la coda non contiene più elementi della sua dimensione
     *      - elements non deve essere null
     *      - -1< =head < element.size-1
     *      - 0 < =head < element.size-1
     */
    //METODI
        /**
     *PRECONDIZONI: 
     *EFFETTI COLLATERALI: la coda potrebbe essere modificata
     *POSTCONDIZIONI: alla coda viene aggiunto l'elemento passato per parametro
     */
    public void enqueue (int n){
        if (tail==head) throw new NullPointerException();
        if (head<tail) els[head++]=n;
        else {
            if (tail==els.size-1) tail=0;
            els[head++]=n;
        }
    }
    /**
     * POSTCONDIZIONI: toglie un elemento alla coda e tail restituisce
     */
    public int dequeue(){
        return els[tail--];
    }

    @Override
    public String toString(){
        String str = "\tCoda:\t\n";
        for (int i=head-1; i>=tail; i--){
            str += "\t" + els[i] + "\t";
        }
        return str + "\n";
    }
}
