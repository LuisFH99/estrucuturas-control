import java.util.Scanner;

public class Selective01 {
    public static void main(String[] args) {
        /*TODO: Realizar un programa que pida un número e imprima en pantalla si es par o impar.*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println(num  +" es un número par");
        } else {
            System.out.println(num + " es un número impar");
        }
    }
}
