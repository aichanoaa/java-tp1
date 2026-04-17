package partie5;
import partie1.Compte;
import partie2.CompteCourant;
import partie3.CompteEpargne;
import partie4.ComptePremium;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[4];
        comptes[0] = new CompteCourant("Cqw1", "Ali", 1000, 500);
        comptes[1] = new CompteEpargne("Ebf1", "Sara", 2000, 0.05);
        comptes[2] = new ComptePremium("sds5", "Omar", 3000, 1000);
        comptes[3] = new CompteCourant("ccf2", "Aya", 500, 200);
        for (Compte c : comptes) {
            c.deposer(100);
            c.retirer(50);
            c.afficher();
        }
        System.out.println("COMPTES EPARGNE ");
        for (Compte c : comptes) {
            if (c instanceof CompteEpargne) {
                c.afficher();
            }
        }
    }
}

