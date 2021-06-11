package set2020_bancarellel;
import java.util.*;

/**
 * OVERVIEW: Le istanze di questa classe rappresentano delle bancarelle, identificate dal
 * nome del propietario, da un listino e da un inventario
 * ABS FUN: AF(proprietario, listino, inventario) -> bancarella
 * REP INV: proprietario != NULL
 */

public class Bancarella{

    private final String proprietario;
    private final Listino listino;
    private final Inventario inventario;

    //Come passo listino ed inventario? all'iniizo sono vuoti>
    public Bancarella (String nome, Listino list, Inventario inv){
        this.proprietario = nome;
        this.listino = list;
        this.inventario = inv;
    }

    

    //EFFECTS: restituisce il proprietario di this
    public String getProprietario(){
        return this.proprietario;
    }

    @Override
    public String toString(){
        String str = "Bancarella di " + this.proprietario + ":\n";
        str += listino.toString();
        return str;
    } 
}