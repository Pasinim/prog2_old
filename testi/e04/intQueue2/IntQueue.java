//OVERVIEW: le istanze di questa classe rappresentano code FIFO di interi di dimensione prefissata
// Gli oggetti di questa classe sono mutabili
public class IntQueue {
    //CAMPI
    //istanza che rappresenta la coda
    private final int[] els;
    //istanze che rappresentano l'inizio e la fine della coda.
    //head rappresenta la posizione del primo elemento e vale -1 se la coda è vuota.
    private int head, tail;

    /** 
     * ABS FUN: AF(els, head, tail) -> 
     *      {els[i] | head <= i <= tail}
     *      {els[head], els[head+1], ..., els[tail-1]} se -1 <= head <= tail 
     *      {els[head], ..., els[size-1], els[0], els[tail-1]}  se head>size
     * 
     * REP INV: La dimensione della coda può essere al massio els.size-1
     *      -1 < head < size
     *      0 <= tail < size 
     *      head = -1 -> tail = 0 
     *      
     */

    //COSTRUTTORI
    //EFFECTS inizializza una lista vuota di dimensione n
    public IntQueue (int n){
        els = new int[n];
        head = -1; 
        tail = 0;
    }

    //METODI
    /**
     * Effects: aggiunge l'elemento x alla coda. Se la coda è piena solleva un'eccezione di tipo ILlegalArgument
     * 
     */
    public void enqueue(int x){
        if (isFull()) throw new IllegalArgumentException("coda piena, impossibil aggiungere elementi");
        if (head == -1){
            head = 0;
        }
        els[tail] = x;
        tail = (tail + 1) % els.length;
    };

    /**
     * Effects: restiuisce l'elemento nella testa rimuoendonodall'insieme. Se la coda è vuota solleva un'eccezione
     */
   public int dequeue(){
       if (isEmpty()) throw new IllegalArgumentException("La coda è vuota, impossibile rimuovere elementi");
        int el = els[head];
        head = (head + 1) % els.length;
        if (head == tail){
            head = -1;
            tail = 0;
        }
        return el;

   };

   //EFFECTS: restituisce l'indice dell'elemento in posizione x. Se non è presente restituisce -1
   public int getIdx (int x){
       for (int i=0; i<els.length; i++)
            if (els[i] == x) return i;
        return -1;
   }

     public boolean isFull(){
       return head == tail;
   }

   public boolean isEmpty(){
       return head == -1;
   }

   public int size (){
    if (isEmpty()) return 0;
    if (isFull()) return els.length;
    return (tail - head + els.length) % els.length;
   }

    @Override
    public String toString(){

        String r = "IntQueue : [";
        if (!isEmpty()) {
          int i;
          for (i = 0; i < size() - 1; i++) r += els[(head + i) % els.length] + ", ";
          r += els[(head + i) % els.length];
        }
        return r + "]";
    }

    //-1 < head < size
    //      0 <= tail < size 
     //     head = -1 -> tail = 0 
    private boolean repOk(){
        return head > -1
            && head < els.length
            && tail >= 0
            && tail < els.length
            && (head != -1 || tail == 0)
    }
}
