package ej.blocs;

import ej.IllegalBlocException;
import ej.PorteVerrouilleException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Porte extends Bloc{

    private static Logger logger = LogManager.getLogger(Porte.class);

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
            logger.error("La porte ne peut pas être verouillée car c'est déjà le cas.");
            throw new PorteVerrouilleException();
        }else {
            verrouillee = true;
        }
    }
}
