package Producator;

public class Producator {
    private String nume;
    private String adresa;
    private String nr_telefon;

    //constructori:
    public Producator(){
        this.nume="X";
        this.adresa="  ";
        this.nr_telefon=" ";
    }

    public Producator(String nume, String adresa, String nr_telefon){
        this.nume=nume;
        this.adresa=adresa;
        this.nr_telefon=nr_telefon;
    }

    public String getNume(){
        return nume;
    }
    public String getNr_telefon(){
        return nr_telefon;
    }
    public String  getAdresa() {return adresa;}



    public void setNr_tel(String nr_telefon) {
        this.nr_telefon = nr_telefon;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setAdresa(String adresa){ this.adresa=adresa; }

    @Override
//    public String toString() {
//        return "nume= " + nume + '\'' +
//                ", adresa= '" + adresa + '\'' + " , nr telefon= '" + nr_telefon;
//    }

    public String toString() {
        return  nume + ',' + adresa + ','  + nr_telefon;
    }
}


