package Testare;


import Furnizor.Furnizor;
import Producator.Producator;
import Produse.*;
import ProduseDB.CosmeticeInDB;
import ProduseDB.EchipMedDB;
import ProduseDB.MedicamenteDB;
import ProduseDB.SuplimentDB;

import java.util.*;

public class Main extends Service implements CosmeticeInDB, MedicamenteDB {
    public static void main(String[] args) {
        Furnizor f1 = new Furnizor("Ana", "03245667");
        Furnizor f2 = new Furnizor("Thea", "03545667");
        Furnizor f3 = new Furnizor("Missha", "03245654");

        Producator p1 = new Producator("Secom", "Bd 1 Decembrie", "009982");
        Producator p2 = new Producator("Nyx", "Bd Nicolae Grigorescu", "098982");
        Producator p3 = new Producator("Secom", "Bd 1 Decembrie", "009982");


        Produs produs1 = new Produs("Vitamina c", 20, 23, "12.09.2023", 100, p1, f1, "Ajuta imunitatea");
        Produs produs2 = new Produs("Nivea", 50, 45, "12.12.2023", 34, p2, f2, "Crema hidratanta pentru fata");

        Medicament medicament1 = new Medicament("antinevralgic", 20, 45, "12-09-2023", 66,
                p1, f1, "Pentru dureri de cap si migrene", false, "soc anafilactic(reactie" +
                " alergica), agravarea semnelor unor infectii", "acid acetilsalicilic, paracetamol si cafeina");

        List<Medicament> m= new ArrayList<>();
        m.add(medicament1);
        m.add(new Medicament("ibuprofen",10,25,"12-09-2023", 23,
                p1,f1,"Pentru dureri de cap, febra si raceala", false, "soc anafilactic(reactie" +
                " alergica)", "ibuprofen"));
        m.add(new Medicament("coldrex",50,20,"14-03-2023", 45,
                p1,f1,"Pentru febra si raceala", false, "soc anafilactic(reactie" +
                " alergica), agravarea semnelor unor infectii", "paracetamol"));
        m.add(new Medicament("agocalmin",20,45,"12-09-2023", 67,
                p1,f1,"Pentru dureri de cap si migrene", true, "soc anafilactic(reactie" +
                " alergica), agravarea semnelor unor infectii", "acid acetilsalicilic, paracetamol si cafeina"));


        List<Cosmetice> cs= new ArrayList<>();

        cs.add(new Cosmetice("Face tint",25,56,"01-01-2023", 23,
                p1,f1,"Fond de ten cu acoperire medie", "Fond de ten", "acid salicilic", "Acneic"));
        cs.add(new Cosmetice("Sunshine serum",150,120,"14-03-2023", 100,
                p2,f2,"Ser hidratant", "ser", "vitamina C", "Uscat"));
        cs.add(new Cosmetice("Belife cream",50, 44.9f,"12-09-2023", 20,
                p2,f1,"Crema hidratanta", "crema", "acid hialuronic", "Normal"));
        //SUPLIMENT:


        List<Supliment> ms= new ArrayList<>();

        ms.add(new Supliment("MultiVit",10,45,"12-09-2023", 25,
                p1,f1,"Ajuta la productia de colagen din organism si contribuie la sanatatea vaselor de sange", "Vitamina C si Zinc", "Adulti: 1 comprimat pe zi, dizolvat in 200 ml de apa",
                4000));
        ms.add(new Supliment("DETRICAL",15,50,"14-03-2023", 120,
                p2,f1,"Pentru imunitate", "Vitamina D", "Se recomanda administrarea zilnica a unui comprimat de Detrical.", 2000));
        ms.add(new Supliment("NATURALIS",20,45,"12-09-2023", 80,
                p1,f2,"Pentru imunitate", " Magneziu + Vitamina B6", "1-2 comprimate filmate de 3 ori pe zi, administrate dupa mese. A nu se depasi doza maxima de 5 comprimate filmate pe zi."
                ,2000 ));



        List<EchipamentMedical> em= new ArrayList<>();

        em.add(new EchipamentMedical("Halat medical",10,55,"-", 34,
                p1,f1,"Protectie", "Uniforma medicala", "-", true));
        em.add(new EchipamentMedical("DRAGER - X-PECT 8515 ",50,120,"14-03-2023", 12,
                p1,f1,"Asigura protectie mecanica, UV si chimica",
                "ochelari", "Ochelari recomandati pentru vopsitorie si activitati de dezinsectii si lucru cu substante chimice.", false));
        em.add(new EchipamentMedical(" STATIONAR Trusa",112,245,"12-09-2023", 33,
                p1,f1,"Trusa medicala omologata", "Trusa medicala", "Truse medicale de prim ajutor, truse medicale fixe recomandate pentru unitatile comerciale si de productie.", true));


        //ETAPA 3:

        //INSERT:


//        int k=1;
//        Iterator it3 = cs.iterator();
//        while(it3.hasNext()){
//           Cosmetice cos = (Cosmetice) it3.next();
//            CosmeticeInDB.insertcosmetice(k, cos);
//            k=k+1;
//
//
//        }
//
//        int j=1;
//        Iterator it = m.iterator();
//        while(it.hasNext()){
//            Medicament med = (Medicament) it.next();
//            MedicamenteDB.insertMedicament(j, med);
//            j=j+1;
//
//
//        }
//
//        Iterator it1 = ms.iterator();
//        int i=1;
//        while(it1.hasNext()){
//            Supliment s = (Supliment)it1.next();
//            SuplimentDB.insertSupliment(i,s);
//            i=i+1;}
//
//        int c=1;
//        Iterator it2 = em.iterator();
//        while(it2.hasNext()){
//            EchipamentMedical e = (EchipamentMedical) it2.next();
//            EchipMedDB.insertEchipamentMedical(c, e);
//            c=c+1;
//
//
//        }
//

//READ, UPDATE, DELETE:

        System.out.println("\nCOSMETICE:\n");

//        CosmeticeInDB.deleteCosmetice(2);
//        CosmeticeInDB.updatePretCosmetice(1,23);

        CosmeticeInDB.getCosmetice();


        System.out.println("\nMEDICAMENT:\n");

//        MedicamenteDB.updatePretMedicament(1,23);
//        MedicamenteDB.deleteMedicament(2);

        MedicamenteDB.getMedicament();



        System.out.println("\nSUPLIMENTE:\n");
//        SuplimentDB.updateNumeSupliment(1, "MULTVIT");
//        SuplimentDB.deleteSupliment(3);

        SuplimentDB.getSupliment();

        System.out.println("\nECHIPAMENTE MEDICALE\n");


//        EchipMedDB.updateAprobEchipamentMedical(2,true);
//        EchipMedDB.deleteEM(3);

        EchipMedDB.getEchipamentMedical();



    } }




