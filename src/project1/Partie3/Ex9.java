package project1.Partie3;
public class Ex9 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int somme = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somme += mat[i][j];
            }
        }
        System.out.println("Somme = " + somme);
    }
}
