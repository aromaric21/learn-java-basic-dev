package ej;

public class Kit {

    private Liste<Bloc> blocs;

    private Liste<String> motsclés;

    public Kit() {
        Liste<Bloc> blocs = new Liste<Bloc>(Bloc.class, 5);
        blocs .add(0, new Mur(1,1,1,true));
        blocs .add(1, new Mur(1,1,1,true));
        blocs .add(2, new Mur(1,1,1,true));
        blocs .add(3, new Mur(1,1,1,true));
        blocs .add(3, new Porte(1,1,1,false));

        Liste<String> motsclés= new Liste<String>(String.class, 2);
        motsclés.add(0, "cabane");
        motsclés.add(1, "muraille");
    }
}
