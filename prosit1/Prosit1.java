
package prosit1;
import java.util.Date;
import java.time.LocalDate;
import java.time.Month;
d.festionmagasin;

import tn.tuniprod.festionmagasin.Magasin;

public class Prosit1 {


public static void main(String[] args) {
    Produit p = new Produit(); 
Produit p1=new Produit(1021,"Lait","Délice");
Produit p2=new Produit(2510,"yaourt","vitalait");
Produit p3=new Produit(3250,"Tomate","Sicam",1.2f);


       p.afficher();
p1.afficher();
p2.afficher();
p3.afficher();
p2.ModifierPrix(0.7f);
p2.afficher();

System.out.println(p3.toString());
LocalDate d= LocalDate.of(2000, 3, 12);
p2.AffecterDate(d);
p2.afficher();
System.out.println(d);
    }
    Magasin M = new Magasin(20, "mg");
    System.out.println("Afficher" +M.toString());
    M.ajouteProduit(p3);
    System.out.println("Affichage après ajout " +M.toString());
    
}
