package ej.blocs;

import ej.IllegalBlocException;

public class Mur extends Bloc{
    private boolean porteur;

    public Mur(final int largeur, final int longueur, final int hauteur, final boolean porteur)
           throws IllegalBlocException {
        super(largeur, longueur, hauteur); // Appel du constructeur de la classe mère
        this.porteur=porteur;
        this.couleur = Couleur.Gris;
    }

    public void afficherBloc(){
        System.out.println(
                super.largeur + "" +
                super.longueur + "" +
                super.hauteur + "" +
                this.porteur);
    }
    public boolean estTraversable(){
        return !porteur;
    }


    @Override
    public void afficherDescription() {
        System.out.println("Je suis un mur !");
    }
}
