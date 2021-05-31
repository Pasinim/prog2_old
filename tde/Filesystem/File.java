package tde.Filesystem;
import java.util.List;

public class File extends AbstractEntry {
    private final int size;
    public File(String name, int size){
        super(name, true);
        this.size = size;
    }

    @Override
    public int getSize(){
        return this.size;
    }

    @Override
    public List<Entry> getContent() throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Cant get the content of a File");

    }
}
