package Partie2;

import java.util.LinkedList;

public class TestFileAttente {
    public static void main(String[] args) {

        LinkedList<Client> file = new LinkedList<>();

        file.add(new Client(1, "Aicha"));
        file.add(new Client(2, "Omar"));
        file.add(new Client(3, "Sara"));

        System.out.println("=== File d'attente ===");
        for (Client c : file) {
            System.out.println(c);
        }

        Client servi = file.removeFirst();
        System.out.println("\nClient servi : " + servi);

        file.addLast(new Client(4, "Youssef"));

        System.out.println("\nClient en tête : " + file.getFirst());

        System.out.println("\n=== File après modification ===");
        for (Client c : file) {
            System.out.println(c);
        }
    }
}