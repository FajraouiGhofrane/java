
package tn.tuniprod.gestionmagasin;

public class Vendeur extends Employe {
        float tauxDeVente;

    public Vendeur(float tauxDeVente, int identifiant, String adresse, String nom, int nbrHeure) {
        super(identifiant, adresse, nom, nbrHeure);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{" + "tauxDeVente=" + tauxDeVente + '}' + " " + super.toString();
    }

    public float getSalaireEmploye() {
        float salaire = 0;

        salaire = (450 * (tauxDeVente / 100)) + 450;
        
        return salaire;
    }
}
