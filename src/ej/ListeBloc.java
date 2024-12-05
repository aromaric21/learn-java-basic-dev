package ej;

import ej.blocs.Bloc;

public class ListeBloc {
    private Bloc[] liste;

    public ListeBloc(int quantite){
        this.liste = new Bloc[quantite];
    }

    public void add(int indice, Bloc bloc){
        this.liste[indice] = bloc;
    }

    public Bloc get(int indice){
        return this.liste[indice];
    }
}
