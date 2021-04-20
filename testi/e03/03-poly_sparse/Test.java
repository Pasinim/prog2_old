public class Test {
    public static void main(String[] args) {
        Sparse s = new Sparse(3, 2);
        Sparse p = new Sparse(1, 2);
        System.out.println(s.toString());
        s=s.add(p);
        System.out.println(s.toString());    
    }
}
