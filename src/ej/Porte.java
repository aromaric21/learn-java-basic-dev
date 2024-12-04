package ej;

public class Porte extends Bloc{

    protected boolean verouille;

    public Porte(final int largeur, final int longueur, final int hauteur, final boolean verouille) {
        super(largeur, longueur, hauteur);
        this.verouille = verouille;
    }

    public boolean estVerrouillee(){
        if (this.verouille){
            return true;
        }
        return false;
    }
}
