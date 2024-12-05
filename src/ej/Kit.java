package ej;

import ej.blocs.IBloc;
import ej.blocs.Mur;
import ej.blocs.Porte;

import java.util.LinkedHashSet;
import java.util.Set;

public class Kit {

    private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
    private Set<String> motscles = new LinkedHashSet<String>();

    public Kit() throws IllegalBlocException{

        blocs.add(new Mur(3,2,2,true));
        blocs.add(new Mur(3,2,2,true));
        blocs.add(new Mur(2,1,2,false));
        blocs.add(new Mur(2,1,2,false));
        blocs.add(new Porte(1,2,2,true));

        Liste<String> motsclés= new Liste<String>(String.class, 2);
        motscles.add("cabane");
        motscles.add("muraille");
    }

    public void afficherKit(){
        System.out.println("Nombre de blocs dans le kit:" + blocs.size());
        System.out.println("Liste des mots clés du kit :");
        for (String motCle : motscles){
            System.out.println(motCle + " ");
        }
    }
}
