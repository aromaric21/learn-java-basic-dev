package ej;

public class ListeMotCle {
    private String[] liste;

    public  ListeMotCle(int quantite){
        this.liste = new String[quantite];
    }

    public void add(int indice, String valeur){
        this.liste[indice] = valeur;
    }

    public String get(int indice){
        return this.liste[indice];
    }
}
