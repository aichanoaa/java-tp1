package partie1;

public class Compte {
    protected String numero;
    protected String titulaire;
    protected double solde;
    public Compte(String numero, String titulaire, double solde) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTitulaire() {
        return titulaire;
    }
    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void deposer(double montant) {
        solde += montant;
    }
    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant ");
        }
    }
    public void afficher() {
        System.out.println("Numo : " + numero +", Titulaire : " + titulaire + ", Solde : " + solde);
    }
}
