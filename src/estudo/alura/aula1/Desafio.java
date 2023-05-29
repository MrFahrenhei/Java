package estudo.alura.aula1;

import java.util.Scanner;

public class Desafio {
    public static Scanner leitura = new Scanner(System.in);
    public static void main(String[] args){
        String name = "Vinícius Valle Beraldo";
        String tipoDeConta = "Corrente";
        double saldo = 1312.99;
        int opcao = 0;
        System.out.println("****************");
        System.out.println("\nNome no cliente: " + name);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("***************");

        String menu = """
                ** Digite uma opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while(opcao!=4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1 -> System.out.println("O saldo atual é " + saldo);
                case 2 -> {
                    System.out.println("Quanto deseja transferir?");
                    double valor2 = leitura.nextDouble();
                    if (valor2 > saldo) {
                        System.out.println("Não há saldo para realizar transferência");
                    } else {
                        saldo -= valor2;
                        System.out.println("Novo saldo: " + saldo);
                    }
                }
                case 3 -> {
                    System.out.println("Valor recebido: ");
                    double valor3 = leitura.nextDouble();
                    saldo += valor3;
                    System.out.println("Novo saldo: " + saldo);
                }
                default -> System.out.println("Opção invalida");
            }
        }
    }
}
