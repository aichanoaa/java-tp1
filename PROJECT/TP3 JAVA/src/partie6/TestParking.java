package partie6;
import partie1.Vehicule;
import partie2.Voiture;
import partie3.Moto;
import partie4.Camion;

public class TestParking {
    public static void main(String[] args) {
        Vehicule[] v = new Vehicule[4];

        v[0] = new Voiture("13d", "Toyota", 4);
        v[1] = new Voiture("0008o", "BMW", 2);
        v[2] = new Moto("111q", "yamaha", true);
        v[3] = new Camion("12s", "Volv", 12.5);
        // Polymorphisme
        for (Vehicule veh : v) {
            veh.stationner();
            veh.afficher();
            System.out.println("-------------------");
        }
        System.out.println("Voiture: ");
        for (Vehicule veh : v) {
            if (veh instanceof Voiture) { //instanceof :C’est un test en Java qui permet de vérifier le type réel d’un objet.
                veh.afficher();
            }
        }
    }
}

