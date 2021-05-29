package tde.Filesystem;
import java.util.List;
import java.util.Objects;


//Le istanze di questa classe rappresentano le entry di un filesystem, siano esse file o directory
public abstract class AbstractEntry implements Entry{
    //CAMPI
    //variabile d'istanza che rappresenta il percorso da root alla cartella attuale
    private final String name;
    //variabile d'istanza che indica se la entry corrente è un file oppure una directory
    private final boolean isFile;

    //variabile d'istanza che indica la dimensione della entry
    //private int size;
    //La implemento nelle classi concrete dato che la dimensione del file sarà final, quella delle dir no


    /**
     * ABS FUN: AF(path, size, isFIle) = {path[0], path[1], ..., path[n]} dove path[0] = root, path[1] = dir1, path[2] = dir2
     *          size = sommatoria (path[0].size + path[1].size + ... + path[n].size)
     *          isFile = 1 se la entry è un file, 0 se è una dir
     * REP INV: size >= 0
     * ABS INV: size >= 0
     */
    
    public AbstractEntry (String name, char t){
        if (t.equals('f'))
             this.isFile = 1;
        else if (t.equals('d')) 
            this.isFile = 0;
        this.name = name; 
    }

    abstract public int getSize();
    
    abstract public List<Entry> getPath();

    @Override 
    public boolean equals(Object obj){
        if (!(obj istanceof Entry)) 
            return false;
        AbstractEntry e = (Entry) obj;
        if (!this.name.equals(e.name)) return false;
        if (!this.isFile != e.isFile) return false;
        return true;
    }
}
