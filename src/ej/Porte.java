package ej;

public class Porte extends Bloc{

    protected boolean verouille;

    public Porte(final int largeur, final int longueur, final int hauteur, final boolean verouille) {
        super(largeur, longueur, hauteur);
        this.verouille = verouille;
    }

    public boolean isLocked(){
        return verouille;
    }

    @Override
    public void afficherDescription() {
        System.out.println("Je suis une porte !");
    }
}
