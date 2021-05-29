import java.util.Set;

public interface Teramino {
    char nome();
    Set<Coordinata> coordinate();
    Teramino ruota();
    Rettangolo boundingBox();
}