import java.util.Scanner;

public class Soluzione {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int arr[]=new int[n];
        Scanner s = new Scanner(System.in);

        String str[]= s.nextLine().split(" ");
        s.close();
        for(int i =0 ; i < n; i++){ 
           arr[i]= Integer.parseInt(str[i]);
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
