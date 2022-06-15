package br.fag.edu.lista04;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
	
	public static int vec1[] = new int[10];
	public static int vec2[] = new int[10];
	public static int vec3[] = new int[10];

	public static List<String> arrayLIST = new ArrayList<>();
	public static String array[];

	public static Random random = new Random();


	public static void main(String[] args){
		doTheVector();
	}

	private static void doTheVector() {
		System.out.print("Vetor1 ");
		System.out.print("Vetor2");
		System.out.println(" ");

		for (int I = 0; I < vec1.length; I++){
			vec1[I] = random.nextInt(9)+1;
			System.out.print(" ");
			System.out.print(vec1[I]);
			System.out.print(" ");
			System.out.print(" ");
			System.out.print(" ");
			System.out.print(" ");
			System.out.print(" ");
			vec2[I] = random.nextInt(9)+1;
			System.out.print(vec2[I]);
			System.out.println(" ");
		}

		for (int A = 0; A < vec1.length; A++){
			for(int B = 0; B < vec1.length; B++){
				if(vec1[A] == vec2[B]){
					int loop4 = 0;
					while(loop4 < vec1.length){
						if (vec1[A] == vec3[loop4]) { break; }
						loop4++;
						if (loop4 == vec1.length) {
							vec3[A] = vec1[A];
							arrayLIST.add(Integer.toString(vec1[A]));
						}
					}
				}
			}
		}

		System.out.println(" ");
		System.out.print("Intersecção: ");
		System.out.println(arrayLIST);
		System.out.println(" ");

		
	}
}