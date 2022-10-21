
package prosit1;
import java.util.Date;
import java.time.LocalDate;
public class Produit {
    private int id;
    private String libelle, marque;
    private float prix;
    private Date date_exp;
   public Produit(){
        
    }
    
    public Produit(int id, String libelle, String marque){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;  
    }
        public Produit(int id, String libelle, String marque, float prix){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
    }
  public void afficher(){
      System.out.println("afficher les produits:\n"+"id\n"+this.id+"\nlibelle\n"+this.libelle+"\nmarque\n"+this.marque+"\nprix\n"+this.prix);
  }   
  public void ModifierPrix(float p){
       prix=p;
  
}
    @Override
  public String toString(){
      System.out.println("afficher les produits:\n"+"id\n"+this.id+"\nlibelle\n"+this.libelle+"\nmarque\n"+this.marque+"\nprix\n"+this.prix);
        return null;
  }
  public void AffecterDate(Date d){
        Date dateExpr;
        dateExpr = d;
  }
  public void setLibellé (String s)
{
this.libellé = s ;
}

public String getLibellé ()
{ return libellé ;}
        



public void setPrix (float p)
{
if (p < 0)
{
 System.out.println ("Prix négatif ");
}
else 
prix = p ;
}


public float getPrix()
{
    return prix ;
}
}
    public boolean Comparer(Produit p)
    {
      if ((this.id == p.id) && 
              ((p.libellé).equals(this.libellé)== true)&&
                      (this.prix == p.prix))
              return true;
              else
              return false;
    }

  
}
