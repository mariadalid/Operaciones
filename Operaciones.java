import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa cuatro numeros: ");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        double numero3 = scanner.nextDouble();
        double numero4 = scanner.nextDouble();

        double suma = numero1+numero2+numero3+numero4;

        System.out.println("La suma de estos 4 numeros es: " + suma);
    }
}