package E1;

public class App {
    public static void main(String[] args) {
        int i = 13;
        int soma = 0;
        int k = 0;

        while (k < i) {
            k = k + 1;
            soma = soma + k;
            System.out.println("k = " + k + " soma = " + soma);
        }
    }
}
