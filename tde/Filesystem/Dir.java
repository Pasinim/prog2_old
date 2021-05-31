package tde.Filesystem;

import java.util.List;
import java.util.Objects;

public class Dir extends AbstractEntry {
    private List<Entry> entries;
    private int dimensione;

    public Dir(String name){
        super(name, false);
        this.dimensione = 0;
    }

    public Dir(String name, List<Entry> e){
        super(name, false);
        Objects.requireNonNull(e);
        for (Entry entry : e)
            this.dimensione += e.getSize();
    }

    public int getSize(){
        return this.dimensione;
    }

    public List<Entry> getContent(){
        return new ArrayList<>(entries);
    }


}
