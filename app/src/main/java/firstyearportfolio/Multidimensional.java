package firstyearportfolio;

public class Multidimensional {
    public static void main(String[] args) {
        int[][] array;
        array = new int[3][5];
        int i, j;
        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 5; ++j) {
                array[i][j] = i;
                System.out.println(array[i][j]);
            }
        }
        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 5; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");

        }
    }
}
