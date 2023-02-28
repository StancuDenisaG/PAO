package Furnizor;

public class Furnizor {
    private String nume;
    private String nr_tel;


    //constructori:
    public Furnizor(){
        this.nume="x";
        this.nr_tel=" ";
    }

    public Furnizor(String nume, String nr_tel){
        this.nume=nume;
        this.nr_tel=nr_tel;
    }

    //setters, getters
    public String getNume(){
        return nume;
    }

    public String getNr_tel(){
        return nr_tel;
    }

    public void setNr_tel(String nr_tel) {
        this.nr_tel = nr_tel;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
//    public String toString() {
//        return "nume= '" + nume + '\'' +
//                ", nr telefon= '" + nr_tel;
//    }


    public String toString() {
        return  nume + ',' + nr_tel;
    }
}
