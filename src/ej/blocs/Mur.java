package ej.blocs;

import ej.exceptions.IllegalBlocException;

public class Mur extends Bloc{

    private boolean porteur;

    public Mur(final int largeur, final int longueur, final int hauteur, final boolean porteur)
           throws IllegalBlocException {
        super(largeur, longueur, hauteur, Couleur.GRIS); // Appel du constructeur de la classe mère
        this.porteur=porteur;
    }

    public boolean estTraversable(){
        return !porteur;
    }
}
