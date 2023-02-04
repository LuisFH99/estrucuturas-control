import java.util.Scanner;

public class Selectiva03 {
    public static void main(String[] args) {
        /*TODO: Realizar un programa que pida 3 números y muestre en pantalla el mayor de ellos*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 1° un número:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese 2° un número:");
        double num2 = scanner.nextDouble();
        System.out.println("Ingrese 3° un número:");
        double num3 = scanner.nextDouble();

        double numeromayor = num1;

        if (numeromayor < num2) {
            numeromayor = num2;
        }

        if (numeromayor < num3) {
            numeromayor = num3;
        }
        System.out.println("El número mayor es: " + numeromayor);
    }
}
