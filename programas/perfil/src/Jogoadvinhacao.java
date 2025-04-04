import java.util.Random;
import java.util.Scanner;

//Para gerar um número aleatório em Java: new Random().nextInt(100);
//Utilize o Scanner para obter os dados do usuário;
//Utilize uma variável para contar as tentativas;
//Utilize um loop para controlar as tentativas;
//Utilize a instrução break; para interromper o loop.

public class Jogoadvinhacao {
    public static void main(String[] args) {
        int gerador = new Random().nextInt(100);
        System.out.println("Número Sercreto: " + gerador);
        int tentativas = 0;
        int resposta = 1;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual seu nome ?");
        String nome = leitura.nextLine();
        System.out.println("Nome: " + nome);
        System.out.println("Escolha um número inteiro para adivinhar o número secreto: ");
        int numeroEscolhido = leitura.nextInt();
        System.out.println("Seu número: " + numeroEscolhido);

        while (resposta != 2) {
            tentativas++;
            switch (resposta) {
                case 1:
                    if (numeroEscolhido == gerador) {
                        System.out.println("Número Sercreto é : " + gerador);
                        System.out.println(String.format("Você acertou o número SECRETO, com %s tentativa(s)!!!",
                                tentativas));
                        System.out.println("Até breve !!!");
                        resposta = 2;
                    } else {
                        System.out.println("Você errou o número secreto, tente digite novamente: ");
                        numeroEscolhido = leitura.nextInt();
                        System.out.println("Seu número: " + numeroEscolhido);
                        resposta = 1;
                    }
                    break;
            }
        }
        leitura.close();
    }
}
