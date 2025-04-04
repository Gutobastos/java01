public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2020;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPLano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme recente que os clientes estão curtindo !");
        } else {
            System.out.println("Filme retro que vale a pena assistir !");}

        //if (incluidoNoPlano == true || tipoPLano.equals("plus")) {
        if (incluidoNoPlano == true && tipoPLano.equals("plus")) {
            System.out.println("Filme liberado !");
        } else {
            System.out.println("Deve pagar a locação !");
        }
    }
}
