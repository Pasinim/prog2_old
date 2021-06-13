package Giu2020_Teramini;
import java.util.List;
import java.util.NavigableSet;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {
     public static void main(String[] args) {
        List<Coordinata> coords = new ArrayList<Coordinata>();
        coords.add(new Coordinata(1, 2));
        coords.add(new Coordinata(11, 42));
        coords.add(new Coordinata(2, 12));
        coords.add(new Coordinata(-2, -12));
        Rettangolo ret = new Rettangolo(coords);

        System.out.println(ret.toString());
        
        Iterator<Coordinata> it = coords.iterator();
        while (it.hasNext()){
            Coordinata n = it.next();
            System.out.println(n.toString());
        }

        }
}
