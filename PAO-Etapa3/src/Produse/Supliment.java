package Produse;

import Furnizor.Furnizor;
import Producator.Producator;

public class Supliment extends Produs {
     private  String compozitie; //fier, calciu etc
     private String doza_recomandata;
     private int unitati; //in mg

    //constructori:
    public Supliment(){
        super();
        this.compozitie="";
        this.doza_recomandata="";
        this.unitati=0;
    }


     public Supliment(String nume, int greutate, float pret, String data_exp, int nr_stoc, Producator producator,
                      Furnizor furnizor, String descriere, String compozitie, String doza_recomandata, int unitati)
     {
         super(nume, greutate, pret, data_exp, nr_stoc, producator, furnizor,descriere);
         this.compozitie=compozitie;
         this.doza_recomandata=doza_recomandata;
         this.unitati=unitati;
     }

     //setters, getters

    public String getCompozitie(){
         return this.compozitie;
    }

    public String getDoza_recomandata(){
         return this.doza_recomandata;
    }

    public int getUnitati(){
         return this.unitati;
    }

    public void setCompozitie(String compozitie){
         this.compozitie=compozitie;
    }
    public void setDoza_recomandata(String doza_recomandata){
         this.doza_recomandata=doza_recomandata;
    }
    public void  setUnitati(int unitati){
         this.unitati=unitati;
    }

    @Override
    public String toString() {
        return   "produs: '" + super.toString()   + '\'' +
                "compozitie '" + compozitie + '\'' +
                ", doza recomandata: '" + doza_recomandata
                + '\'' + ", unitati(mg): '" + unitati;



    }

    public void display(){
//        System.out.println("Produs: " + super.toString());
//        System.out.println("Compozitie: " + compozitie);
//        System.out.println("Doza recomandata: " + doza_recomandata);
//        System.out.println("Unitati(mg): " + unitati);
        System.out.println("Produs: " + super.toString());
        System.out.println("Compozitie: " + compozitie);
        System.out.println("Doza recomandata: " + doza_recomandata);
        System.out.println("Unitati(mg): " + unitati);
    }


}
