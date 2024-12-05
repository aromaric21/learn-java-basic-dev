package ej.kits;

import ej.exceptions.IllegalBlocException;
import ej.blocs.IBloc;

import java.util.LinkedHashSet;
import java.util.Set;

public class KitDemarrage {

    private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
    private Set<String> motsCles = new LinkedHashSet<String>();

    public KitDemarrage(final Set<IBloc> blocs) throws IllegalBlocException {

        this.blocs.addAll(blocs);

        motsCles.add("Cabane");
        motsCles.add("Muraille");
        motsCles.add("Maison");
    }

    public void afficherKit(){
        System.out.println("Nombre de blocs dans le kit:" + blocs.size());
        System.out.println("Liste des mots clés du kit :");
        for (String motCle : motsCles){
            System.out.println(motCle + " ");
        }
    }

    public Set<IBloc> getBlocs() {
        return blocs;
    }

    public Set<String> getMotsCles() {
        return motsCles;
    }
}
