package tde.Filesystem;
import java.util.List;

public class Dir extends AbstractEntry  {
    
    @Override
    public int getSize();
    @Override
    public String getName();
    @Override
    public List<Entry> getPath();
}
