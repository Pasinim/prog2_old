package tde.feb2020_Visicalc;

public class Test {
    public static void main(String[] args) {
        Foglio f = new Foglio();
        Costante c1 = new Costante('A', 1, 10);
        f.addCella(c1);
        f.addCella(new Costante('B', 1, 20));
        System.out.println(f.toString());
        // char x = 'A' - 64;
        // int a = x - 64;
        // int[][] mat = new int[5][5];
        // mat[x][x] = 51;
        // System.out.println(mat[x][x]);
    }
}
