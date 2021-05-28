import java.util.List;
//Le istanze di questa classe rappresentano le entry di un filesystem, siano esse file o directory
public abstract class Entry {
    //CAMPI
    //variabile d'istanza che rappresenta il percorso da root alla cartella attuale
    private List<String> path;
    //variabile d'istanza che indica se la entry corrente è un file oppure una directory
    private boolean isFile;
    //variabile d'istanza che indica la dimensione della entry
    private int size;

    /**
     * ABS FUN: AF(path, size, isFIle) = {path[0], path[1], ..., path[n]} dove path[0] = root, path[1] = dir1, path[2] = dir2
     *          size = sommatoria (path[0].size + path[1].size + ... + path[n].size)
     *          isFile = 1 se la entry è un file, 0 se è una dir
     * REP INV: size >= 0
     * ABS INV: size >= 0
     */

     abstract public int size();
     abstract public Entry create();

}
