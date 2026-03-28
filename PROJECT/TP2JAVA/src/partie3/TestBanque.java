package partie3;

import partie1.CompteBancaire;
import partie2.Banque;

public class TestBanque {

    public static void main(String[] args) {

        Banque banque = new Banque("MarocBank", 1500);
        CompteBancaire c1 = new CompteBancaire("Aicha", 1000, 500);
        CompteBancaire c2 = new CompteBancaire("Ali", 2000, 300);
        CompteBancaire c3 = new CompteBancaire("Sara", 1500, 400);
        banque.ajouterCompte(c1);
        banque.ajouterCompte(c2);
        banque.ajouterCompte(c3);
        c1.deposer(500);
        c1.retirer(300);
        c2.virementVers(c3, 700);
        banque.afficherTous();

        System.out.println("Solde c2 avec interets: " + c2.calculerSoldeAvecInterets());
        System.out.println("Solde c2 avec bonus: " + c2.calculerSoldeAvecInterets(0.015));

        System.out.println("Nombre total de comptes: " + CompteBancaire.getNbComptes());
        System.out.println("Taux d'interet: " + CompteBancaire.getTauxInteret());
    }
}


