package projet1.project1.Partie1;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez N : ");
        int n = sc.nextInt();

        int i = 1;
        int somme = 0;

        while (i <= n) {
            somme += i;
            i++;
        }

        System.out.println("Somme = " + somme);
    }
}
