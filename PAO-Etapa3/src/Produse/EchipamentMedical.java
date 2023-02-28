package Produse;

import Furnizor.Furnizor;
import Producator.Producator;

public class EchipamentMedical extends Produs {
    private String tip;
    private String mod_utilizare;
    private boolean aprobare;

    //constructori:
    public EchipamentMedical(){
        super();
        this.tip="";
        this.aprobare=false;
        this.mod_utilizare="";

    }

    public EchipamentMedical(String nume, int greutate, float pret, String data_exp, int nr_stoc, Producator producator,
                             Furnizor furnizor, String descriere, String tip, String mod_utilizare, boolean aprobare)
    {
        super(nume, greutate, pret, data_exp, nr_stoc, producator, furnizor,descriere);
        this.tip=tip;
        this.aprobare=aprobare;
        this.mod_utilizare=mod_utilizare;
    }


    //setters, getters
    public String getTip(){
        return this.tip;
    }
    public String getMod_utilizare(){
        return this.mod_utilizare;
    }
    public boolean getAprobare(){
        return this.aprobare;
    }


    public void setTip(String tip){
        this.tip=tip;
    }
    public void setMod_utilizare(String mod_utilizare){
        this.tip=tip;
    }
    public void setAprobare(boolean aprobare){
        this.aprobare=aprobare;
    }


    @Override
    public String toString() {
        return   "produs: '" + super.toString()   + '\'' +
                "tip produs '" + tip + '\'' +
                ", mod de utilizare: '" + mod_utilizare
                + '\'' + ", aprobare: '" + aprobare;



    }


    public void display(){
        System.out.println("Produs: " + super.toString());
        System.out.println("Tip produs: " + tip);
        System.out.println("Mod de utilizare: " + mod_utilizare);
        System.out.println("Aprobat: " + aprobare);
    }



}
