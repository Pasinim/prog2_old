package tde.Filesystem;

import java.util.List;
public interface Entry {
    public String getName();
    public int getSize();
    public List<Entry> getContent();  

    @Override
    public boolean equals (Object obj);
}
