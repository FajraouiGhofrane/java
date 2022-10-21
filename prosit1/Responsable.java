
package tn.tuniprod.gestionmagasin;

public class Responsable extends Employe {
    float prime;

    public Responsable(float prime, int identifiant, String adresse, String nom, int nbrHeure) {
        super(identifiant, adresse, nom, nbrHeure);
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable{" + "prime=" + prime + '}' + " " + super.toString();
    }

    @Override
    public float getSalaireEmploye() {
        float salaire = 0;
        int nbrHeureSup = 0;
        int nbrDeBase = 0;
        if (nbrHeure > 160) {
            nbrHeureSup = nbrHeure - 160;
            nbrDeBase = 160;
        } else {
            nbrHeureSup = 0;
            nbrDeBase = nbrHeure;
        }
        salaire = (float) ((nbrDeBase * 10) + (10 * 1.2 * nbrHeureSup));
        salaire += prime;
        return salaire;
    }

}
    
}
