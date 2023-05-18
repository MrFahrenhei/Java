package estudo.alura.aula1;

import java.util.Scanner;

public class Loop_two {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;
        while (nota != -1) {
            System.out.println("Digite uma nota");
            nota = scanner.nextDouble();
            if(nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        System.out.println("Media de avaliações: " + mediaAvaliacao/totalDeNotas);
    }
}
