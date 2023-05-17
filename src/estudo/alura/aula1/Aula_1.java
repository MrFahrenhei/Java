package estudo.alura.aula1;

public class Aula_1 {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFile = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        //sinopse = "Filme de aviões dos EUA";
        sinopse = """
                Filme TopGun
                Filme de aviões dos EUA
                Muito Bom!
                Ano de lançamento
                """;
        System.out.println(sinopse);
        int classification;
        classification = (int) (media/2);
        System.out.println(classification);

    }
}
