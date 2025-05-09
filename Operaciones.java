import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa cuatro numeros: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int numero4 = scanner.nextInt();

        int suma = numero1+numero2+numero3+numero4;

        System.out.println("La suma de estos 4 numeros es: " + suma);
    }
}