public class TestAbonnements {
    public static void main(String[] args) {

        Abonnement[] abonnements = {
                new AbonnementVideo("Netflix", 80, 4, true, true),
                new AbonnementMusique("Spotify", 50, 2, 25, true),
                new AbonnementJeux("SDFGHJB", 100, 3, 60, 50)
        };

        System.out.println(" Liste des abonnements :");

        for (Abonnement a : abonnements) {
            a.afficherInfos();
            System.out.println("CoUt mensuel : " + a.calculerCoutMensuel() + " DH");
            System.out.println("Score satisfaction : " + a.calculerScoreSatisfaction());
        }

        Reducible[] reducibles = {
                new AbonnementVideo("Disney+", 70, 3, true, false),
                new AbonnementMusique("Deezer", 40, 2, 30, true)
        };

        System.out.println(" Test REduction ");

        for (Reducible r : reducibles) {
            System.out.println("REduction 20% : " + r.appliquerReduction(20));

            if (r.estEligibleReduction(50)) {
                System.out.println("REduction 50% : " + r.appliquerReduction(50));
            } else {
                System.out.println("REduction 50% refusE");
            }

        }
    }
}