package estudo.alura.aula1;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorita");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lan�amento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.print("Nota: ");
        double nota = leitura.nextDouble();
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(nota);
        leitura.close();
    }
}
