package E2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (fibonacci(numero)){
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean fibonacci(int numero){
        if (numero == 0 || numero == 1){
            return true;
        }

        int a = 0;
        int b = 1;
        int c = a + b;

        while (c <= numero){
            if (c == numero){
                return true;
            } else {
                a = b;
                b = c;
                c = a + b;
            }
        }
        return false;
    }
}
