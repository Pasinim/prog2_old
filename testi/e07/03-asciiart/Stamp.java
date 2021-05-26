import java.util.Collections;
import java.util.Set;

public class Stamp implements Figure{
    private final Set<Coord> coords;

    public Stamp(int[][] mat){
        if (mat == null) throw IllegalArgumentException;
        Set<Coord> temp = new HashSet<>(); 
        for (int r = 0; r < mat.length; r++)
            for (int c = 0; c < mat[r].length; c++)
                if (mat[r][c] != 0) temp.add(new Coord(r,c));

        coords = Collections.unmodifiableSet(temp);
    }

    @Override
    public void draw(Bitmap bitmap){

    }

    public void draw(Bitmap bitmap, int r, int c){  

    }
}
