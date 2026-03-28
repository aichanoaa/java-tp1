package partie1;

public class CompteBancaire {
    //1
    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;
    //2
    private static int nbComptes = 0;
    private static double tauxInteret = 0.03;
    private static int Compteur = 1 ;
    //3
    public CompteBancaire(){
        this.numero = Compteur++;
        this.titulaire = " ";
        this.solde = 0;
        this.decouvertAutorise = 0;
        nbComptes++;
    }
    //4
    public CompteBancaire(String titulaire, double solde,double decouvertAutorise){
        this.numero = Compteur++;
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
        nbComptes++;
    }
    //5
    public String getTitulaire(){
        return titulaire;
    }
    public void setTitulaire(String titulaire){
        if(titulaire != null ){
            this.titulaire=titulaire;
        }
    }
    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        if(decouvertAutorise>=0){
            this.decouvertAutorise = decouvertAutorise;
        }
    }

    public static int getNbComptes() {
        return nbComptes;
    }

    public static double getTauxInteret() {
        return tauxInteret;
    }

    public static void setTauxInteret(double tauxInteret) {
        CompteBancaire.tauxInteret = tauxInteret;
    }
    public void afficher(){
        System.out.println("Compte:"+numero+"Titulaire : "+titulaire+"Solde: "+solde+" Decouvert autorise : "+decouvertAutorise);
    }
    public void deposer(double montant){
        if(montant>0){
            solde+=montant;
        }
        System.out.println("Montant de depot invalide");
    }
    public void retirer (double montant){
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("retrait refus");
        }
    }
    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            this.retirer(montant);
            autre.deposer(montant);
        } else {
            System.out.println("Virement impossible");
        }
    }
    public double calculerSoldeAvecInterets() {
        return solde + (solde * tauxInteret);
    }
    public double calculerSoldeAvecInterets(double bonus) {
        return solde + (solde * (tauxInteret + bonus));
    }

}
