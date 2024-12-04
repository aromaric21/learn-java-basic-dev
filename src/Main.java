public class Main {
    public static void main(String[] args) {
        Main.commenteLaMeteo("soleil");
    }

    public static void commenteLaMeteo(final String meteo){
        switch (meteo){
            case "soleil" -> System.out.println("Beau temps");
            case "nuage" -> System.out.println("Couvert");
            case "pluie" -> System.out.println("Mauvais temps");
            default -> System.out.println("Temps inconnu");
        }
    }
}