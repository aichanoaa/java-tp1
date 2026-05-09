package Partie5;

import java.util.Map;
import java.util.TreeMap;

public class TestClassement {
    public static void main(String[] args) {

        TreeMap<Integer, String> classement = new TreeMap<>();

        classement.put(105, "Aicha");
        classement.put(101, "Omar");
        classement.put(110, "Sara");
        classement.put(99, "Youssef");

        System.out.println("=== Liste triée automatiquement ===");
        for (Map.Entry<Integer, String> entry : classement.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nPremier étudiant : " + classement.firstEntry());
        System.out.println("Dernier étudiant : " + classement.lastEntry());

        System.out.println("\nÉtudiants avec numéro > 100 :");
        for (Map.Entry<Integer, String> entry : classement.tailMap(101).entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
