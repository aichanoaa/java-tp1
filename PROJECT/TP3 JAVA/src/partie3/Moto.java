package partie3;
import partie1.Vehicule;

public class Moto extends Vehicule {
    private boolean avecCasque;

    public Moto(String matricule, String marque, boolean avecCasque) {
        super(matricule, marque);
        this.avecCasque = avecCasque;
    }
    @Override
    public void stationner() {
        System.out.println("La moto se gare dans une place réservée.");
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Avec casque : " + avecCasque);
    }
}
