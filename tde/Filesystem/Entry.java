package tde.Filesystem;
import java.util.List;

public interface Entry {

    public int getSize();
    public String getNome();
    public List<Entry> getContenuto();

    @Override
    public String toString();

    @Override
    public boolean equals();

    @Override
    public boolean repOk();


}
