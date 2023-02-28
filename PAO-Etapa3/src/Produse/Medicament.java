package Produse;

import Furnizor.Furnizor;
import Producator.Producator;

public class Medicament extends Produs {
   private boolean reteta;
   private String efecte_adverse;
   private String substante_active;

  //constructori:
    public Medicament(){
        super();
        this.reteta=false;
        this.efecte_adverse="";
        this.substante_active="";

    }

   public Medicament(String nume, int greutate, float pret, String data_exp, int nr_stoc, Producator producator,
                     Furnizor furnizor, String descriere, boolean reteta, String efecte_adverse, String substante_active) {
      super(nume, greutate, pret, data_exp, nr_stoc, producator, furnizor,descriere);
      this.reteta=reteta;
      this.efecte_adverse=efecte_adverse;
      this.substante_active=substante_active;
   }

   //setters, getters
   public boolean getReteta(){
      return this.reteta;
   }

   public String getEfecte_adverse(){
      return this.efecte_adverse;
   }

   public String getSubstante_active(){
      return this.substante_active;
   }

   public void setReteta(boolean reteta){
      this.reteta=reteta;
   }

   public void setEfecte_adverse(String efecte_adverse){
      this.efecte_adverse=efecte_adverse;
   }

   public void setSubstante_active(String substante_active){
      this.substante_active=substante_active;
   }


    @Override
    public String toString() {
        return   "produs: '" + super.toString()   + '\'' +
        "eliberare pe baza de reteta '" + reteta + '\'' +
                ", substante active: '" + substante_active
                + '\'' + ", efecte edverse: '" + efecte_adverse;



    }

  public void display(){
      System.out.println("Produs: " + super.toString());
      System.out.println("Eliberare pe baza de reteta: " + reteta);
      System.out.println("Substante active: " + substante_active);
      System.out.println("Efecte adverse: " + efecte_adverse);
  }

}
