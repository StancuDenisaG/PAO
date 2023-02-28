package Produse;

import Furnizor.Furnizor;
import Producator.Producator;

public class Cosmetice extends Produs {
    private String tip;
    private String substante_active;
    private String tipul_tenului;

    //constructor:
    public Cosmetice(){
        super();
        this.tip="";
        this.substante_active="";
        this.tipul_tenului="";

    }

    public Cosmetice(String nume, int greutate, float pret, String data_exp, int nr_stoc, Producator producator,
                     Furnizor furnizor, String descriere,
                     String tip, String substante_active, String tipul_tenului)
    {
        super(nume, greutate, pret, data_exp, nr_stoc, producator, furnizor,descriere);
        this.tip=tip;
        this.substante_active=substante_active;
        this.tipul_tenului=tipul_tenului;

    }

    //setters, getters
    public String getTip(){
        return this.tip;
    }
    public String getSubstante_active(){
        return this.substante_active;
    }
    public String getTipul_tenului(){
        return this.tipul_tenului;
    }


    public void setTip(String tip){
        this.tip=tip;
    }
    public void setSubstante_active(String substante_active){
        this.substante_active=substante_active;
    }
    public void setTipul_tenului(String tipul_tenului){
        this.tipul_tenului=tipul_tenului;
    }


    @Override
    public String toString() {
        return   "produs: '" + super.toString()   + '\'' +
                "tip produs: '" + tip + '\'' +
                ", substante active: '" + substante_active
                + '\'' + ", tipul tenului: '" + tipul_tenului;



    }

    //afisare:
    public void display(){
        System.out.println("Produs: " + super.toString());
        System.out.println("Tipul produsului: " + tip);
        System.out.println("Substante active: " + substante_active);
        System.out.println("Recomandat pentru tipul de ten " + tipul_tenului);
    }
}
