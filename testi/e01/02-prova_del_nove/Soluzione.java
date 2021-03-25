import java.util.Scanner; 
public class Soluzione {
    public static String intToString(int n){
        return "" + n;
    }
    public static int stringToInt(String s){
        int n=0; 
        for (int i=0; i<s.length(); i++){
            n*=10;
            n+=s.charAt(i) - '0';
        }
        return n;
    }
    //PRE: s è un riferimento non nullo
    //POST: fornisce il numero ottenuto sommando le cifre che compongono n finchè non si ottiene un numero di una sola cifra

    public static int sommaCifre (String s){
        int n=0;
        for (int i=0; i<s.length(); i++){
            System.out.println(n);
            //if (s.length()==1) return n;
            n+=s.charAt(i)-'0';
        }
        return n;
    }
    public static int sommaTutto (String s){
        int n=0;    
        if (s.length()==1) return s.parseInt();
        sommaCifre(s)
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        System.out.println(sommaCifre(intToString(n)));
    }
}
