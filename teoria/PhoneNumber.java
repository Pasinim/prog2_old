import java.util.ArrayList;

public class lez11 {
//    conctat //ad una persona sono associati più numeri di telefono
//      phoneNumber //voglio che il numero ha senso solamente se è associato ad un certo contatto -> OWNED ENTITY
    //per questo motivo deve essere inner, non può essere statica visto  che voglio riferirmi ad una particolare istanza
//come posso fare questo utilizzando una classe annidata?

    private final String first, last; //nome, cognome
    private final List<phoneNumber> numbers = new ArrayList<>(); //qui tengo i numeri di telegono di quella persona
    public Contact(String first, String last ){
        this.first=first;
        this.last=last;
    }
    class phoneNumber { //non statica, così posso avere i riferimenti ai numero
        private final String prefix, number;

        public phoneNumber(String prefix, String number){
            this.prefix=prefix;
            this.number=number;
        }
        //ora voglio il metodo tostring
        @Override
        public String toString(){
            return first + " " + last + ": " + prefix + "/" + number;
            //posso avere i riferimenti al nome dato che phoneNumber NON è statico
        }
    }
    public void addNumber(String prefix, String number){
            numbers.add(Conctat.this.new phoneNumber(prefix, number));
        }
    public phoneNumber firstWitPrefix(String prefix){
        for (phoneNumber p : numbers)
            if (p.prefix.equals(prefix)) return p;
        
    }
    public static void main(String[] args) {
        Contact me = new Contact("Massimo" , "Pippo");
        me.addNumber ("02", "353535");
        me.addNumber ("02", "353345");

        //se voglio accedere alla
        phoneNumber p = me.new phoneNumber("123", "123");
    }
    }

