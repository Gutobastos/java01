import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Faça uma avaliação para este filme entre 0 - 10: ");
        double avaliacaoFilme = leitura.nextDouble();

        System.out.println("Filme favorito: " + filme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Sua avaliação do filme: " + avaliacaoFilme);

        leitura.close();
    }
}