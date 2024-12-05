package ej.kits;

import ej.exceptions.IllegalBlocException;
import ej.blocs.IBloc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class KitDemarrage {

    private Logger logger= LogManager.getLogger(KitDemarrage.class);

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
        motsCles.forEach(System.out::println);

        /*        for (String motCle : motsCles){
            System.out.println(motCle + " ");
        }*/
    }

    public Set<IBloc> getBlocs() {
        return blocs;
    }

    public Set<String> getMotsCles() {
        return motsCles;
    }

    public  void sauvegarder(){
        StringBuilder builder = new StringBuilder();
        builder.append("Kit de démarrage\n");
        motsCles.forEach((motsCles) -> builder.append(motsCles + " "));
        // Or
        /**
         * for (String motCle : motsCles){
         * builder.append(motCle + " ");
        }
         **/
        try {
            // Acceder au fichier
            BufferedWriter writer = new BufferedWriter(new FileWriter("kit.txt"));
            writer.write(builder.toString());
            writer.close();
        } catch (IOException e) {
            logger.error("Impossible d'écrire dans le fichier");
        }
    }

    public void charger() {
        try (BufferedReader reader = new BufferedReader(new FileReader("kit.txt"))) {
            String line = null;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            logger.error("Le fichier kit.txt n'existe pas.");
        } catch (IOException e) {
            logger.error("Impossible de lire le fichier kit.txt");
        }
    }
}
