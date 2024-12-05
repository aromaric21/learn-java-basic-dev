package ej.blocs;

import ej.IllegalBlocException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Bloc implements IBloc {
    protected int longueur;
    protected int largeur;
    protected int hauteur;
    protected Couleur couleur;

    private static Logger logger = LogManager.getLogger(Bloc.class);

    public Bloc(final int longueur, final int largeur, final int hauteur) throws IllegalBlocException {
        if (longueur < MIN_LONGUEUR || largeur < Min_LARGEUR || hauteur < MIN_HAUTEUR ){
            logger.error("Les valeurs minimales pour longueur, largeur, hauteur n'ont pas été respectées.");
            throw new IllegalBlocException();
        }
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;

        logger.info(" Un bloc de type " +this.getClass().getSimpleName() + " a été construit. ");
    }

    public int getLongueur(){
        return longueur;
    }

    public int getLargeur(){
        return largeur;
    }

    public int getHauteur(){
        return hauteur;
    }

    public void setCouleur(Couleur couleur){
        this.couleur = couleur;
    }
}
