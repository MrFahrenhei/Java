package br.fag.edu.lista04;

import java.util.Random;

public class Exercicio2 {
	
	   public static int sum,var1,var2;
	   public static int vec1[] = new int[8];
	   public static Random random = new Random();
	   
	public static void main(String[] args){
		doTheVector();
	}

	private static void doTheVector() {
		System.out.println("Vetor:");
		for(int i = 0; i <vec1.length ; i++){			
			vec1[i] = random.nextInt(8);	
			System.out.println(vec1[i]);
        	}
            var1=random.nextInt(7);
            var2=random.nextInt(7);
    
        System.out.println(" ");    
        System.out.printf("o valor %d que se encontra no %d \n",vec1[var1], var1);
        System.out.printf("o valor %d que se encontra no %d \n",vec1[var2], var2);
        System.out.printf("X %d + Y %d = %d \n", vec1[var2], vec1[var1], vec1[var2] + vec1[var1]);
        
        }
}