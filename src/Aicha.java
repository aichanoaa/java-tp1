import java.util.Scanner;
public class Aicha {
    public static void main(String[] args) {
        System.out.println("Hello World");
        sayHi();
    }

    public static void sayHi(){//(parameter)
        System.out.println("First class for learn Java .");
        Scanner keyb = new Scanner(System.in);
        int n=keyb.nextInt();
        System.out.println("Le nombre est :"+ n);
        System.out.println("Le double est :"+ n*2);
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " x ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

    }
}
