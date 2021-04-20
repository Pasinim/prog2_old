import java.io.IOException;

public class checked {
    int n;
    public checked(int num){
        n=num;
        //il blocco try-catch-finally deve essere dichiarato in modo consecutivo
        try {
            if (num<0) throw new IOException();
        }
        catch(IOException e){
            n = 100;
        }
        finally{
            System.out.println("numeretto " + n);
        }
    }
}
