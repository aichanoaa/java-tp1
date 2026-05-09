package Partie2;

public class Client {
    private int numero;
    private String nom;

    public Client(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Numéro: " + numero + ", Nom: " + nom;
    }
}