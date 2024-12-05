package ej;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Liste<T> {

    private T[] liste;

    public Liste(Class<T> classe, int quantité){
        this.liste = (T[]) Array.newInstance(classe, quantité);
    }

    public void add(int indice, T valeur){
        this.liste[indice] = valeur;
    }

    public T get(int indice){
        return this.liste[indice];
    }
}
