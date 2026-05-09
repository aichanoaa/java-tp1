package Partie4;

import java.util.HashMap;
import java.util.Map;

public class TestNotes {
    public static void main(String[] args) {

        HashMap<String, Double> notes = new HashMap<>();

        notes.put("Aicha", 16.5);
        notes.put("Omar", 12.0);
        notes.put("Sara", 14.75);
        notes.put("Youssef", 18.0);

        System.out.println("=== Toutes les notes ===");
        for (Map.Entry<String, Double> entry : notes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nNote de Sara : " + notes.get("Sara"));

        notes.put("Omar", 13.5);

        notes.remove("Aicha");

        double somme = 0;
        for (double note : notes.values()) {
            somme += note;
        }

        double moyenne = somme / notes.size();

        System.out.println("\n=== Après modification ===");
        for (Map.Entry<String, Double> entry : notes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Moyenne générale : " + moyenne);
    }
}
