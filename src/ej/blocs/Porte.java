package ej.blocs;

import ej.IllegalBlocException;
import ej.PorteVerrouilleException;

public class Porte extends Bloc{

    protected boolean verrouillee;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verouillee)
                    throws IllegalBlocException {
        super(largeur, longueur, hauteur);
        this.verrouillee = verouillee;
        this.couleur = Couleur.Bleu;
    }

    public boolean estVerouillee(){
        return verrouillee;
    }

    @Override
    public void afficherDescription() {
        System.out.println("Je suis une porte !");
    }

    public void verrouiller() throws PorteVerrouilleException {
        if (verrouillee){
            throw new PorteVerrouilleException();
        }else {
            verrouillee = true;
        }
    }
}
