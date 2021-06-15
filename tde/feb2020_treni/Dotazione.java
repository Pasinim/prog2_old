package tde.feb2020_treni;

import java.io.*;
import java.util.*;

/**
 * OVERVIEW: Le istanze di questa classe rappresentano una dotazione di un vagone
 *          Le istanze di questa classe sono immutabili, per questo motivo è plausibile 
 *          lasciare gli attributi pubblici
 * ABS FUN: AF(nome, quantita) -> this.nome = this.quantita
 * REP INV: nome != null, quantita >= 0
 */
public class Dotazione implements Comparable<Dotazione>{
    public final String nome;
    public final int quantita;

    /**
     * EFFECTS: inizializza una nuova dotazione con Nome nome e quantita quantita.
     * Se nome è null o quantità < 0 solleva una eccezione
     * @param nome Nome della dotazione 
     * @param quantita Quantità della dotazione
     */
    public Dotazione(String nome, int quantita){
        this.nome = nome;
        this.quantita = quantita;
        if (!repOK()) throw new IllegalArgumentException("Quantita deve essere positiva.");
    }

    @Override
    public int compareTo(Dotazione o) {
        return this.nome.compareTo(o.nome);
    }

    /**
     * Controlla l'invariante di rappresentazione
     * @return true se IR è rispettato, false altrimenti
     */
    private boolean repOK(){
        if (this.quantita < 0 || this.nome == null) return false;
        return true;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Dotazione)) return false;
        Dotazione o = (Dotazione) obj;
        if (!(this.nome.equals(o.nome))) return false;
        //if (this.quantita != o.quantita) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int result = this.nome.hashCode();
        //result = 37 * result + Integer.hashCode(this.quantita);
        return result;
    }

    @Override 
    public String toString(){
        return this.nome + " = " + this.quantita;
    }

    // public static void main(String args[]){
    //     InputStreamReader is = new InputStreamReader(System.in);
    //     BufferedReader reader = new BufferedReader(is);

    //     Dotazione d = new Dotazione("Ciao", 100);
    //     try {
    //         for(String line = reader.readLine(); line != null; line = reader.readLine()){
    //             String[] tkns = line.split(" ");
    
    //             Dotazione dot = new Dotazione(tkns[0], Integer.parseInt(tkns[1]));
    //             System.out.println(dot);
    //             System.out.println(d.equals(dot));
    //             System.out.println(d.compareTo(dot));
    //         }           
    //     } catch (Exception e) {
    //         //TODO: handle exception
    //     }
    // }

}
