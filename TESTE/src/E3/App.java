package E3;

public class App {
    public static void main(String[] args) {
        double[][] faturamentoDiario = {
            {1, 22174.1664},
            {2, 24537.6698},
            {3, 26139.6134},
            {4, 0.0},
            {5, 0.0},
            {6, 26742.6612},
            {7, 0.0},
            {8, 42889.2258},
            {9, 46251.174},
            {10, 11191.4722},
            {11, 0.0},
            {12, 0.0},
            {13, 3847.4823},
            {14, 373.7838},
            {15, 2659.7563},
            {16, 48924.2448},
            {17, 18419.2614},
            {18, 0.0},
            {19, 0.0},
            {20, 35240.1826},
            {21, 43829.1667},
            {22, 18235.6852},
            {23, 4355.0662},
            {24, 13327.1025},
            {25, 0.0},
            {26, 0.0},
            {27, 25681.8318},
            {28, 1718.1221},
            {29, 13220.495},
            {30, 8414.61}
        };

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double totalFaturamento = 0;
        int diasComFaturamento = 0;

        // Primeiro loop para calcular o menor, maior e total de faturamento
        for (int i = 0; i < faturamentoDiario.length; i++) {
            double valor = faturamentoDiario[i][1];

            if (valor > 0) {
                diasComFaturamento++;
                totalFaturamento += valor;

                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }

                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
            }
        }

        // Cálculo da média
        double mediaFaturamento = totalFaturamento / diasComFaturamento;

        // Contar os dias com faturamento acima da média
        int diasAcimaDaMedia = 0;
        for (int i = 0; i < faturamentoDiario.length; i++) {
            double valor = faturamentoDiario[i][1];

            if (valor > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Total faturamento: " + totalFaturamento);
        System.out.println("Média de faturamento: " + mediaFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
