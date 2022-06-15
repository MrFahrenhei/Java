package br.fag.edu.lista03;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	
	public static Scanner scan = new Scanner(System.in);
	public static String ops;
	public static double saque;
	public static double deposito;
	public static double sal = 0;
	public static boolean exit = false;
	
	public static void main(String[] args) {				
			AskInfo();
				while(exit == false){
					AskInfo();
				}
		  }
	
		private static void AskInfo() {					
			System.out.println("O que gostaria de realizar?");
			System.out.println("a) Consultar saldo");
			System.out.println("b) Fazer saque");
			System.out.println("c) Realizar o depósito");
			System.out.println("d) Sair");			
			String val1 = scan.next();
			ops = val1;
			
			switch(ops) {			
			  case "a":
				  System.out.println("Saudo: ");
				  	NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
				  System.out.println(formatter.format(sal));
			break;	
			
			  case "b":
				  
				  System.out.println("Saque: ");
				  double val2 = scan.nextDouble();
				  
				  saque = val2;			  
				  sal -= saque;
				  if(sal >= 0) {
					  System.out.println("Saudo: ");
					  	NumberFormat formatter1 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
					  System.out.println(formatter1.format(sal));
				  	}
				  else {
					  sal = 0;
					  System.out.println("Saldo indisponível");					  
				 	}
			break;	
			
			  case "c":
				  
				  System.out.println("Digite o seu deposito");
				  double val3 = scan.nextDouble();
				  
				  deposito = val3;				  
				  sal += deposito;
				  System.out.println("Saudo: ");
				  	NumberFormat formatter2 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
				  System.out.println(formatter2.format(sal));
				  break;
		
			case "d":
				 exit = true;
				 System.out.println("Adeus, tenha uma excelente semana");
			break;	
			
			default:
			  System.out.println("Não está válido");
			}		
		}
}