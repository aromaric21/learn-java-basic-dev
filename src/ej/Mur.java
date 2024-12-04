package ej;

public class Mur extends Bloc{
    private boolean porteur;

    public Mur(final int largeur, final int longueur, final int hauteur, final boolean porteur) {
        super(largeur, longueur, hauteur); // Appel du constructeur de la classe mère
        this.porteur=porteur;
    }

    public void afficherBloc(){
        System.out.println(
                super.largeur + "" +
                super.longueur + "" +
                super.hauteur + "" +
                this.porteur);
    }
    public boolean isTraversable(){
        return !porteur;
    }


    @Override
    public void afficherDescription() {
        System.out.println("Je suis un mur !");
    }
}
