
package prosit1;

public class Magasin {
    int id, capacite;
    String adresse;
    Produit T [];
    public Magasin(int id, int capacite,String adresse){
        this.id=id;
        this.capacite=capacite;
        this.adresse=adresse;
        T= new Produit[50];
    }
    public void AjouterProduit(Produit p){
        T[capacite]=p;
        capacite++;        
    }
     public String toString ()
    {
        String ch = "";
        for (int i = 0; i<capacite; i++)
        {
           ch= ch+ " Libellé " +T[i].getLibellé() + " Prix " + T[i].getPrix() ; 
        }
        return (" l'identifant " +id + "\n"+
                " Adresse " + adresse+"\n" +
                "nbr produits " +capacite + ch);
    }
   
    public int getCapacité ()
    {return capacite ; }
}

    public boolean chercher(Produit p)
    { boolean exist = false;
    int i=0;
    while(i <capacite && exist == false)
    {        
           if (comparer(p,T[i]) == true)
                   exist = true;
           i++;
    }
        return exist ;
    }
    
    public void supprimerProduit(Produit p)
    {
        int x = this.indiceProduit(p);
        
        for (int i = x; i<capacite; i++)
        {
            this.T[i]= this.T[i+1] ;
        }
        capacite -- ;
    }
    public  Magasin comparer(Magasin m){
        if (this.capacite >= m.capacite){
            return this;
        }
        else{
            return m;
        }
    
}
    

    
    
    
}
