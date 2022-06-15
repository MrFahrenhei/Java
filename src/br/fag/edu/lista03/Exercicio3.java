package br.fag.edu.lista03;

import java.util.Scanner;

public class Exercicio3 {	
	
	    private static int valor, val100, val50, val20, val10, val5, val2;
	    private static Scanner scanner = new Scanner(System.in);
	    
	    public static void main(String[] args) throws Exception {
	        AskInfo();
	        verific();	
	        ShowAnswers();
	    }

	    private static void ShowAnswers() {
	    	 if(valor > 1) {
		    	 System.out.println("O(a) senhor(a) poderá retirar esse valor com:");
		    	 System.out.printf("%d notas de 100\n", val100);
		    	 System.out.printf("%d notas de 50\n", val50);
		    	 System.out.printf("%d notas de 20\n", val20);
		    	 System.out.printf("%d notas de 10\n", val10);
		    	 System.out.printf("%d notas de 5\n", val5);
		    	 System.out.printf("%d notas de 2\n", val2);
	    	 } else {
	    		 System.out.println("Valor incorreto, digite novamente");
	    	 }
		}

		public static void AskInfo() {        
	        System.out.println("Digite o Valor:");
	        valor = scanner.nextInt();
	    }

	    public static void verific() {	   
	        if (valor >= 100 ){
	        	val100 = valor / 100;	         
	        }
	        if (valor >= 50) {
	        	val50 = valor / 50;
	        }
	        if (valor >= 20) {
	        	val20 = valor / 20;
	        } 
	        if(valor >= 10) {
	        	val10 = valor / 10;            
	        } 
	        if (valor >= 5) {
	        	val5 = valor / 5;            
	        } 
	        if (valor >= 2) {
	        	val2 = valor / 2;
	        }
	       
	   }
	}