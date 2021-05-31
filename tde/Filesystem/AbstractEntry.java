package tde.Filesystem;

import java.util.Objects;

public abstract class AbstractEntry implements Entry{
    private final String name;
    private final boolean isFile;

    public AbstractEntry(String name, boolean isFile){
        this.name = name;
        this.isFile = isFile;
    }

    abstract public int getSize();
    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals (Object obj){
        if (!(obj instanceof Entry)){
            return false;
        }
        return true;
    };

    @Override
    public String toString (){
        return this.name;
    }
}
