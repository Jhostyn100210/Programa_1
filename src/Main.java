import java.util.Scanner;

public class Main {

    public static void holaMundo() {
        System.out.println("Hola, Mundo!");
    }

    public static void sumaDeDosNumeros(Scanner scanner) {
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    }

    public static void numeroParOImpar(Scanner scanner) {
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " es un número impar.");
        }
    }

    public static void factorialDeUnNumero(Scanner scanner) {
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }

    public static void tablaDeMultiplicar(Scanner scanner) {
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        System.out.println("Tabla de multiplicar de " + num + " en orden ascendente:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        System.out.println("Tabla de multiplicar de " + num + " en orden descendente:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    sumaDeDosNumeros(scanner);
                    break;
                case 3:
                    numeroParOImpar(scanner);
                    break;
                case 4:
                    factorialDeUnNumero(scanner);
                    break;
                case 5:
                    tablaDeMultiplicar(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 6);

        scanner.close();
    }
}