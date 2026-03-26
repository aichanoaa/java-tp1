package projet1.project1.Partie4;
import java.util.Scanner;
public class EX14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String inv = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            inv += str.charAt(i);
        }
        if (str.equals(inv)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Non palindrome");
        }
    }
}
