public class Desafios {
    public static void main(String[] args) {
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 5.5;
        double nota2 = 7.8;
        double media = (nota1 + nota2) / 2;
        System.out.println("A média é : " + media);

        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e
        // imprima o resultado.
        double numeroDouble = 4.5;
        int numeroInteiro = (int)numeroDouble;
        System.out.println("Cast de double para int : " + numeroInteiro);

        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas
        // variáveis e concatene-as em uma mensagem.
        char letra;
        String palavra;
        letra = 'V';
        palavra = "ermelho";
        String mensagem = letra + palavra;
        System.out.println(mensagem);

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor
        // total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 10.50;
        int quantidade = 13;
        double total = precoProduto * (double)(quantidade);
        System.out.println("Total valor da compra: " + "R$ " + total);

        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere
        // que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e
        // imprima o resultado formatado.
        double valorDolar = 10;
        double valorBRL = 4.94;
        double cotacao = valorDolar * valorBRL;
        System.out.println("Valor convertido de US$ " + valorDolar + "em valor em BRL: R$ " + cotacao);

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando
        // o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e
        // atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto
        // em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 80.00;
        double percentualDesconto = 15;
        double valorDesconto = precoOriginal * (percentualDesconto/100);
        double valorProduto = precoOriginal - valorDesconto;
        System.out.println("Valor de desconto: " + valorDesconto);
        System.out.println("Valor do produto: " + valorProduto);
    }
}