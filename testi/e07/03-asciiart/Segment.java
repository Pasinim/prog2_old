import java.util.Objects; 
public class Segment implements Figure {
    
    private Coord start;
    private int length;
    private boolean isVertical;
    
    //COSTRUTTORI
    public Segment(Coord start, int length, boolean isVertical){
        this.start = Objects.requireNonNull(start);
        Coord c = new Coord(r, c);
        this.length = length;
        this.isVertical = isVertical;
    }

    @Override
    public void draw(Bitmap bitmap){

    }
}
