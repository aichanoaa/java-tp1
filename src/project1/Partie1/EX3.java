package project1.Partie1;
import java.util.Scanner;

public class EX3 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Entrez un nombre : ");
            int n = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }

}
