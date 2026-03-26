package projet1.project1.Partie2;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Taille du tableau : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + " : ");
            tab[i] = sc.nextInt();
        }

        System.out.println("Tableau : ");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
