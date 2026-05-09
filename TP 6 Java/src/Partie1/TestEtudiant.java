package Partie1;

import java.util.ArrayList;
import java.util.Comparator;

public class TestEtudiant {
    public static void main(String[] args) {

        ArrayList<Etudiant> etudiants = new ArrayList<>();

        etudiants.add(new Etudiant(1, "Aicha", 15.5));
        etudiants.add(new Etudiant(2, "Sara", 12.75));
        etudiants.add(new Etudiant(3, "Youssef", 17.25));
        etudiants.add(new Etudiant(4, "Omar", 10.5));
        etudiants.add(new Etudiant(5, "Hajar", 14.0));

        System.out.println("=== Liste des étudiants ===");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }

        String nomRecherche = "Sara";
        System.out.println("\n=== Recherche par nom ===");
        for (Etudiant e : etudiants) {
            if (e.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("Étudiant trouvé : " + e);
            }
        }

        int idSuppression = 4;
        etudiants.removeIf(e -> e.getId() == idSuppression);

        System.out.println("\n=== Après suppression ===");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }

        etudiants.sort(Comparator.comparingDouble(Etudiant::getMoyenne));

        System.out.println("\n=== Tri par moyenne croissante ===");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }

        Etudiant meilleur = etudiants.get(etudiants.size() - 1);
        System.out.println("\nMeilleure moyenne : " + meilleur);
    }
}
