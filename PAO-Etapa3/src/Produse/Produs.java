package Produse;

import Furnizor.Furnizor;
import Producator.Producator;

public class Produs implements Comparable<Produs> {

    private String nume;
    private int greutate;
    private float pret;
    private String data_exp;
    private int nr_stoc;
    private Producator producator;
    private Furnizor furnizor;
    private String descriere;


   // Constructori:
    public Produs(){
        this.nume = "X";
        this.greutate = 0;
        this.pret = 0;
        this.data_exp ="Nu are data de expirare";
        this.producator = new Producator();
        this.furnizor = new Furnizor();
        this.descriere = "Nu are descriere";

    }


    public Produs(String nume, int greutate, float pret, String data_exp, int nr_stoc, Producator producator,
                  Furnizor furnizor, String descriere) {
        this.nume = nume;
        this.greutate = greutate;
        this.pret = pret;
        this.data_exp = data_exp;
        this.nr_stoc=nr_stoc;
        this.producator = producator;
        this.furnizor = furnizor;
        this.descriere = descriere;
    }

    //setters getters
    public String getNume(){
        return this.nume;
    }
    public int getGreutate(){
        return this.greutate;
    }
    public float getPret(){
        return this.pret;
    }
    public String getData_exp(){
        return this.data_exp;
    }
    public int getNr_stoc(){
        return nr_stoc;
    }
    public Producator getProducator(){
        return this.producator;
    }
    public Furnizor getFurnizor(){
        return this.furnizor;
    }
    public String getDescriere(){
        return this.descriere;
    }


    public void setNume (String nume){
        this.nume =nume ;
    }
    public void setGreutate (int greutate){
        this.greutate =greutate ;
    }
    public void setPret (float pret){
        this.pret =pret ;
    }
    public void setData_exp (String data_exp){
        this.data_exp =data_exp ;
    }
    public void setNr_stoc (int nr_stoc){
        this.nr_stoc =nr_stoc ;
    }
    public void setProducator (Producator producator){
        this.producator =producator ;
    }
    public void setFurnizor (Furnizor furnizor){
        this.furnizor =furnizor ;
    }
    public void setDescriere (String descriere){
        this.descriere =descriere ;
    }


    @Override
    public String toString() {
        return "nume= '" + nume + '\'' +
                ", greutate(g)= '" + greutate
                + '\'' + ", pret= '" + pret
                + '\'' + ", data expirare" + data_exp
                + '\'' + ", nr_stoc"  + nr_stoc
                + '\'' + ", producator: '" + producator.toString()
                + '\'' + ", furnizor: '" + furnizor.toString()
                + '\'' + ", descriere= '" + descriere;

    }

    public void display() {
        System.out.println("Nume: " + nume);
        System.out.println("Greutate(g): " + greutate);
        System.out.println("Pret: " + pret);
        System.out.println("Data expirare: " + data_exp);
        System.out.println("Nr stoc: " + nr_stoc);
        System.out.println("Producator: " + producator.toString());
        System.out.println("Furnizor: "+ furnizor.toString());

        System.out.println("Descriere: " + descriere);
    }
//pt a putea sorta alfabetic lista din service
    @Override //functie ce ne ajuta
    public int compareTo(Produs ob) {
        return this.nume.compareTo(ob.nume);
    }
}