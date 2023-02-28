package Testare;

import Factura.Factura;
import Furnizor.Furnizor;
import Producator.Producator;
import Produse.Cosmetice;
import Produse.Medicament;
import Produse.Produs;

import java.sql.*;
import java.util.*;

public class Service  {


    public static final void afisareMed(List<Medicament> ms){ //era static final inainte
        for(int i=0; i<ms.size(); i++) {
            System.out.println(ms.get(i));
        }
        System.out.println("--------------------------------------------------------------------------------");
        ms.clear();
    }

    public static final void afisareFact(Set<Factura> set_facturi ){ //era static final inainte
        Iterator it = set_facturi.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


}


