package E5;

public class App {
    public static void main(String[] args) {
        String original = "palavra usada para teste";
        String invertida = inveStrings(original);

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);

    }

    public static String inveStrings(String str){
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim){
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }
        return new String(caracteres);
    }
}
