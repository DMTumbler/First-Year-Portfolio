package firstyearportfolio;

import java.util.*;
public class leerNumero {
    public static void main (String[]args){
        explicativo();
        leerNúmeros();
    }
    
    static void leerNúmeros(){
    int numero = userEntry();
    double dato, resultado;
    switch (numero) {
    case 1:
        dato = userEntry();
        resultado = Math.sqrt(dato);
        System.out.println("La raiz cuadrada de " + dato + " es " + resultado);
        break;
    case 2:
        dato = userEntry();
        resultado = Math.pow(dato,2);
        System.out.println(dato + " al cuadrado es " + resultado);
        break;
    case 3:
        dato = userEntry();
        resultado = Math.pow(dato,3);
        System.out.println(dato + " al cubo es " + resultado);
        break;
    default:
        System.out.println("El numero leído es el incorrecto");
        break;
    }
        }

static void explicativo() {
    try (Scanner key = new Scanner(System.in)) {
    }
    System.out.println("Entre 1 para calcular raíz cuadrada, 2 para elevar a la 2, y para elevar a la 3.");
}
static int userEntry() {
    try (Scanner key = new Scanner(System.in)) {
        System.out.println("Entre el dato que desee utilizar en la operación");
        return key.nextInt();
    }
    }
}