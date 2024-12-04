package ej;

public class Main {
    public static void main(String[] args) {

        //Mur unBlocMur = new Mur(10, 10, 5, true);
        IBloc unBlocMur = new Mur(100, 100, 100, true);
        Rampart monRampart = new Rampart(unBlocMur);

        unBlocMur.afficherDescription();
    }
}