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
    //COSTRUTTORI
    /**
     *PRECONDIZONI: n>=0
     *EFFETTI COLLATERALI:
     *POSTCONDIZIONI: inizializza this affinchè sia una coda vuota
     */
    public IntQueue(int n){
        els = new int[n];
        head=-1;
        tail=0;
    }
    //METODI
        /**
     *PRECONDIZONI: 
     *EFFETTI COLLATERALI: potrebbe modificare this
     *POSTCONDIZIONI:   aggiunge n alla coda
                        se la coda è piena solleva un'eccezione di tipo FullException
     */
    public void enqueue (int n){
        if (isFull) throw new FullException("Coda piena, impossibile aggiungere un altro elemento");
        if (isEmpty) head=0;
        els[tail] = n;
        tail = (tail + 1) % elements.length; //con il modulo cicla se tail arriva alla fine

    }

    //PostCondizioni: restituisce true se la coda è piena, false altrimenti
    public boolean isFull(){
        return head==tail;
    }

    //PostCondizioni: restituisce true se la coda è vuota, false altrimenti
    public boolean isEmpty(){
        return head == -1;
    }
        /**
     *PRECONDIZONI: 
     *EFFETTI COLLATERALI: potrebbe modificare this
     *POSTCONDIZIONI:   rimuove e restituisce l'intero nella testa della coda
                        se la coda è piena solleva un'eccezione di tipo EmptyException
     */
    public int dequeue(){
        if (isEmpty()) throw new EmptyException();
        int r =els[head];
        head = (head + 1) % els.length;
        if (head==tail){ //se la coda è vuota
            head = -1;
            tail = 0;
        }
        return r;
    }

    @Override
    //POSTCONDIZIONI: implementa la funzione di astrazione
    public String toString(){
        String str = "\tCoda:\t\n";
        for (int i=head-1; i>=tail; i--){
            str += "\t" + els[i] + "\t";
        }
        return str + "\n";
    }

    @Override
    public booean equals(IntQueue other){

    }

    //POSTCONDIZIONI: implementa la funzione di astrazione
    private boolean repOk(){
        return true;
    }
}
