import java.util.*;

public class TestRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            String str = s.nextLine();
            String tokens[] = str.split(" ");
            char cmd = tokens[0].charAt(0);
            switch (cmd){
                case 'R':
                case 'C':
                case 'M':
                case 'T':
                case '.':
                    break;
            }
        }    
        s.close();   
    }
}
