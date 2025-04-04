import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            avaliacao += nota;
        }
        String mediaAvaliacao = String.format("%.1f", avaliacao / 3);
        System.out.println("Média de avaliações: " + mediaAvaliacao );
        leitura.close();
    }
}
