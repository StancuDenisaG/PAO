package Factura;

import Produse.Produs;

public class Factura {
    private int cod_factura;
    private int nr_produse;
    private Produs produs;

    //constructori:
    public Factura(){
        this.cod_factura=0;
        this.nr_produse=0;
        this.produs=new Produs();
    }

    public Factura(int cod_factura, int nr_produse, Produs produs){
        this.cod_factura=cod_factura;
        this.nr_produse=nr_produse;
        this.produs=produs;

    }
    //setters, getters
    public int getNr_produse(){
        return nr_produse;
    }
    public int getCod_factura(){
        return cod_factura;
    }
    public Produs getProduse(){
        return produs;

    }

    public void setCod_factura(int cod_factura){
        this.cod_factura=cod_factura;
    }

    public void setNr_produse(int nr_produse){
        this.nr_produse=nr_produse;
    }

    public void setProduse(Produs produs){
       this.produs=produs;


        }


    @Override
    public String toString() {
        return "Cod factura '" + cod_factura + '\'' +
                ", Nr produse: '" + nr_produse
                + '\'' + ", Produs: '" + produs.toString();



    }
    }





