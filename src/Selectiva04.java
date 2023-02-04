import java.math.BigDecimal;
import java.util.Scanner;

public class Selectiva04 {
    public static void main(String[] args) {
        /*TODO: Hacer un programa para una tienda de zapatos que tiene una promoción de descuento para vender al mayor,
           esta dependerá del número de zapatos que se compren.
           - Si son más de diez hasta 19, se les dará un 10% de descuento sobre el total de la compra;
           - si el número de zapatos es mayor o igual de veinte, pero menor de treinta, se le otorga un 20% de descuento;
           - y si el número de zapatos es mayor o igual de treinta se otorgará un 40% de descuento.
           El precio de cada zapato es de $80.
           Se debe ingresar por teclado el número de zapatos a comprar y el programa debe imprimir
           cuánto se pagará aplicando el descuento*/

        BigDecimal pago;
        int precio = 80;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de zapatos:");
        int cantzapatos = scanner.nextInt();

        if (cantzapatos >= 30) {
            pago = BigDecimal.valueOf(precio * cantzapatos * 0.6);
        } else if (cantzapatos >= 20) {
            pago = BigDecimal.valueOf(precio * cantzapatos * 0.8);
        } else if (cantzapatos >= 19) {
            pago = BigDecimal.valueOf(precio * cantzapatos * 0.9);
        } else {
            pago = BigDecimal.valueOf(precio * cantzapatos);
        }


        System.out.println("Por " + cantzapatos + " zapatos pagará: $" + pago + " aplicando descuento");
    }
}
