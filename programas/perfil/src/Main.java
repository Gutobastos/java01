public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é o Screen Match!");
        //System.out.println("Top Gun: Maverik");

        int anoDeLancamento = 2022;
        //System.out.println("Ano de Lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        //System.out.println("Nota do Filme: " + media);
        String sinopse;
        sinopse = """
                Top Gun: Maverik
                Filme de ação com galã dos anos 80.
                Muito bom
                Ano de Lançamento: """+ anoDeLancamento;
        System.out.println(sinopse);
        System.out.println("Nota do Filme: " + media);
    }
}
