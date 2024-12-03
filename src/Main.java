public class Main {
    public static void main(String[] args) {
        decompte(10);

    }

    public static void decompte(final int valeur){
        if (valeur >= 0 ) {
            System.out.println(valeur);
            decompte(valeur-1);
        }
    }
}