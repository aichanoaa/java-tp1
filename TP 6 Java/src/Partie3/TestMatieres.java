package Partie3;
import java.util.HashSet;
import java.util.TreeSet;

public class TestMatieres {
    public static void main(String[] args) {

        HashSet<String> matieres = new HashSet<>();

        matieres.add("Java");
        matieres.add("Python");
        matieres.add("Math");
        matieres.add("Java");
        matieres.add("Réseaux");

        System.out.println("=== Matières sans doublons ===");
        for (String m : matieres) {
            System.out.println(m);
        }

        TreeSet<String> matieresTriees = new TreeSet<>(matieres);

        System.out.println("\n=== Matières triées ===");
        for (String m : matieresTriees) {
            System.out.println(m);
        }
    }
}