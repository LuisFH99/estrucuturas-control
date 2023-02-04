import java.util.Scanner;

public class Selectiva02 {
    public static void main(String[] args) {
        /*TODO:se ingresan por teclado tres números, si todos los valores ingresados
           son menores a 10, imprimir en pantalla la leyenda "Todos los números
           son menores a diez".*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 1° un número:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese 2° un número:");
        double num2 = scanner.nextDouble();
        System.out.println("Ingrese 3° un número:");
        double num3 = scanner.nextDouble();

        if(num1 < 10 && num2 < 10 && num3 < 10){
            System.out.println("Todos los números son menores a diez");
        }else{
            System.out.println("No todos los números son menores a diez");
        }
    }
}
