package firstyearportfolio;


//   Nombre del programador: Christian Sánchez Martínez
import java.text.*;// Imports java utilities. We need scanner.
import java.util.*;

public class cajaRegistradora3 {
    public static void main(String[] args) {
        double articulo1, articulo2, articulo3, subtotal, ivu, total, pago, cambio;

        explicar();
        articulo1 = leer();
        articulo2 = leer();
        articulo3 = leer();

        subtotal = hallarSubTotal(articulo1, articulo2, articulo3);
        ivu = hallarIVU(subtotal);
        total = hallarTotal(subtotal, ivu);
        pago = leerPago(subtotal, ivu, total);
        cambio = hallarCambio(total, pago);
        mostrarCambio(cambio);
    }

    // Función que devuelve el valor de un numero según entrado por el usuario. En
    // main esta función es
    // usado tres veces para asignarle el valor a articulo1, articulo2 y articulo3
    static double leer() {
        try (Scanner lectura = new Scanner(System.in)) {
            double numero;
            System.out.print("Entre el precio: ");
            numero = lectura.nextDouble();
            return numero;
        }
    }

    // Función par mostrar el valor asignado a la variable cambio. Este valor se le
    // asignó
    // con la función hallar cambio.
    static void mostrarCambio(double change) {
        DecimalFormat ft = new DecimalFormat("$00.00");
        if (change > 0)
            System.out.println("\nSu cambio es: " + ft.format(change));
        else
            System.out.println("No hay cambio para su transacción");
    }

    // Función que, según todos los valores ya determinados por los cálculos
    // funciones anteriores,
    // demuestra dichos valores para el usuario de manera comprensible.
    // Adicionalmente le pide el
    // total con el cual el usuario desea pagar
    static double leerPago(double subT, double imp, double compra) {
        DecimalFormat ft = new DecimalFormat("$00.00");
        try (Scanner lectura = new Scanner(System.in)) {
            double cantidad;
            System.out.println("El subtotal de su compra de tres artículos es: " + ft.format(subT));
            System.out.println("El IVU de su compra es: " + ft.format(imp));
            System.out.println("El total de su compra es: " + ft.format(compra));
            System.out.print("Favor de entrar la cantidad de su pago: ");
            cantidad = lectura.nextDouble();
            return cantidad;
        }
    }

    // Método sencillo que explica al usuario las instrucciones a seguir en lo
    // restante del programa
    static void explicar() {
        System.out.println("El siguiente programa solicitara el costo de tres artículos de uno en uno");
        System.out.println("con el propósito de proveerle los siguientes valores de su compra:");
        System.out.println("el impuesto sobre ventas y uso, subtotal y total de su compra.");
        System.out.println("Debe presionar enter luego de entrar cada articulo individualmente");
        System.out.println("Finalmente solicitará el monto de su pago y, según la cantidad");
        System.out.println("que usted entre le dirá el total d su cambio.");
        System.out.println("");
        // Coloca aquí las instrucciones que entiendas necesarias para
        // explicar al usuario lo que hace el programa y que entre el
        // entre el precio de los tres artículos que compró. También
        // debes indicar al usuario que debe oprimir la tecla Enter después
        // de entrar el precio de cada artículo.
    }

    // Utilizando los valores de las variables subtotal e ivu hallamos el total de
    // la
    // compra. Esta función depende de que las funciones hallarIvu y hallarSubtotal
    // se
    // hallan ejecutado y asignado valores a las variables antes mencionadas.
    static double hallarTotal(double costo, double tax) {
        double suma;
        suma = costo + tax;
        return suma;
    }

    // Función que suma el valor de 3 artículos para encontrar un total. En este
    // caso
    // estamos sumando el valor de 3 artículos de compra para encontrar el subtotal.
    // Este
    // subtotal es utilizado en las funciones hallarTotal leerPago.
    static double hallarSubTotal(double precio1, double precio2, double precio3) {
        double subTot;
        subTot = precio1 + precio2 + precio3;
        return subTot;
    }

    // Función que calcula el ivu utilizando el valor provisto. En este caso
    // hallarSubTotal
    // proveyó el valor del subtotal a la variable subtotal. Usamos esta misma
    // variable para
    // calcular el ivu de la compra multiplicando por 0.115.
    static double hallarIVU(double parcial) {
        double impuesto;
        impuesto = parcial * 0.115; // 11.5% del total parcial o subtotal
        return impuesto;
    }

    // Función que, luego de que el usuario somete la cantidad del pago a traves de
    // la
    // función leer pago, calcula la diferencia que se le debe al usuario.
    static double hallarCambio(double total, double payment) {
        double result;
        result = payment - total; // calcular el cambio que se devuelve
        return result;
    }
}
