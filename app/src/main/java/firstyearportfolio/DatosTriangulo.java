package firstyearportfolio;

class DatosTrianjagulo {
    public static void main(String[] args) {
        userDocumentation();
        triangulo();
    }

    static void triangulo() {
        int i, j = 1;

        for (i = 1; i <= 5; ++i) {
            for (j = 1; j <= i; ++j) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void userDocumentation() {
        System.out.println("El programa muestra un triángulo de valores en la pantalla.\n");
    }
}
