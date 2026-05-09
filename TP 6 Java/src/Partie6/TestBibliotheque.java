package Partie6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TestBibliotheque {
    public static void main(String[] args) {

        ArrayList<Livre> livres = new ArrayList<>();
        HashSet<String> categories = new HashSet<>();
        HashMap<String, Livre> emprunts = new HashMap<>();

        livres.add(new Livre("ISBN001", "Java Débutant", "Ali", 2022));
        livres.add(new Livre("ISBN002", "Python Facile", "Sara", 2021));
        livres.add(new Livre("ISBN003", "Base de données", "Omar", 2020));

        categories.add("Programmation");
        categories.add("Base de données");
        categories.add("Réseaux");
        categories.add("Programmation");

        emprunts.put("Aicha", livres.get(0));
        emprunts.put("Omar", livres.get(1));

        System.out.println("=== Livres disponibles ===");
        for (Livre l : livres) {
            System.out.println(l);
        }

        String titreRecherche = "Python Facile";
        System.out.println("\n=== Recherche d'un livre ===");
        for (Livre l : livres) {
            if (l.getTitre().equalsIgnoreCase(titreRecherche)) {
                System.out.println("Livre trouvé : " + l);
            }
        }

        String isbnSuppression = "ISBN003";
        livres.removeIf(l -> l.getIsbn().equals(isbnSuppression));

        System.out.println("\n=== Après suppression ===");
        for (Livre l : livres) {
            System.out.println(l);
        }

        System.out.println("\n=== Catégories ===");
        for (String c : categories) {
            System.out.println(c);
        }

        System.out.println("\n=== Emprunts ===");
        for (Map.Entry<String, Livre> entry : emprunts.entrySet()) {
            System.out.println(entry.getKey() + " a emprunté : " + entry.getValue());
        }

        System.out.println("\n=== Rapport final ===");
        System.out.println("Nombre total de livres : " + livres.size());
        System.out.println("Nombre de catégories : " + categories.size());
        System.out.println("Nombre d'emprunts : " + emprunts.size());
    }
}