package br.fag.edu.lista08;

import java.util.Random;

public class exercicio1 {
	
	private static int num[] = new int[100];
	private static int numBuble[] = new int[100];
	private static int numInsertion[] = new int[100];
	private static int numQuick[] = new int[100];
	private static int numSelection[] = new int[100];
	private static int numMerge[] = new int[100];
	
	
	public static int correr3 = 0;
	public static int troca3 = 0;
	
	public static int correr5 = 0;
	public static int troca5 = 0;
	

	public static void main(String[] args) {
		getInfo();
		getSplit();
		sortBubleSort();
		sortInsertionSort();
		sortQuickSort(numQuick);
		sortSelectionSort(numSelection);
		sortMergeSort();
		//ShowInfo();
	}
	

	
	private static void sortMergeSort() {
		
		int tamanho = numMerge.length;
		int elementos = 1;
		int inicio, meio, fim;
		
		while (elementos < tamanho) {
			inicio = 0;
			correr5++;
			while (inicio + elementos < tamanho) {
				meio = inicio + elementos;
				fim = inicio + 2*elementos;
					if(fim > tamanho)
						fim = tamanho;
					intercalar(numMerge, inicio, meio, fim);
					
					inicio = fim;
					
			}
			elementos = elementos * 2;
		}
		System.out.println("");
		System.out.println("Metodo Merge: ");
		System.out.println("quantas vezes correu pelo código: "+correr5);
		System.out.println("quantas vezes houve trocas dentro do código: "+troca5);
		for (int test = 0; test < num.length - 1; test++) {
			System.out.print(numMerge[test] + ", ");
		}
		System.out.println(" ");	
		
	}
	
	private static void intercalar(int[] numMerge, int inicio, int meio, int fim) {
		int newVector[] = new int[fim - inicio];
		int i = inicio;
		int m = meio;
		int pos = 0;
		
		while (i<meio && m < fim) {
			if (numMerge[i] <= numMerge[m]) {
				newVector[pos] = numMerge[i];
				pos = pos + 1;
				i = i +1;
				troca5++;
			} else {
				newVector[pos] = numMerge[m];
				pos = pos + 1;
				m = m + 1;
				troca5++;
			}
		}
		
		while (i < meio) {
			newVector[pos] = numMerge[i];
			pos = pos + 1;
			i = i + 1;
			troca5++;
		}
		while (m < fim) {
			newVector[pos] = numMerge[m];
			pos = pos + 1;
			m = m + 1;
			troca5++;
		}
		for (pos = 0, i = inicio; i < fim; i++, pos++) {
			numMerge[i] = newVector[pos];
			
		}
		
	}
	




	private static void sortSelectionSort(int[] numSelection) {
		int correr4 = 0;
		int troca4 = 0;
		for (int fix = 0; fix < numSelection.length - 1; fix++) {
			correr4++;
			int menor = fix;
			for (int i = menor + 1; i < numSelection.length; i++) {
				if (numSelection[i] < numSelection[menor]) {
					menor = i;
					troca4++;
				}
			}
			if (menor != fix) {
				int t = numSelection[fix];
				numSelection[fix] = numSelection[menor];
				numSelection[menor] = t;
				troca4++;
			}
		}
		System.out.println("");
		System.out.println("Metodo Selection: ");
		System.out.println("quantas vezes correu pelo código: "+correr4);
		System.out.println("quantas vezes houve trocas dentro do código: "+troca4);
		for (int test = 0; test < num.length - 1; test++) {
			System.out.print(numSelection[test] + ", ");
		}
		System.out.println(" ");	
		
	}




	//METODO QUICKSORT;
	
	private static void sortQuickSort(int[] numQuick) {	
	    int inicio = 0;
	    int fim = numQuick.length - 1;
	    QuickSort1(numQuick, inicio, fim);
	    System.out.println("");
		System.out.println("Metodo Quicksort: ");
		System.out.println("quantas vezes correu pelo código: "+correr3);
		System.out.println("quantas vezes houve trocas dentro do código: "+troca3);
		for (int test = 0; test < num.length - 1; test++) {
			System.out.print(numQuick[test] + ", ");
		}
		System.out.println(" ");
	}
	
	private static void QuickSort1(int[] numQuick, int inicio, int fim) {
	    if (inicio < fim) {
	        int posicaoPivo = Separar(numQuick, inicio, fim);
	        QuickSort1(numQuick, inicio, posicaoPivo - 1);
	        QuickSort1(numQuick, posicaoPivo + 1, fim);
	    }
	}

	private static int Separar(int[] vetor1, int inicio, int fim) {
	    int pivo = vetor1[inicio];
	    int i = inicio + 1, f = fim;
	    while (i <= f) {
	    	correr3++;
	        if (vetor1[i] <= pivo) {
	            i++;
	            troca3++;
	        } else if (pivo < vetor1[f]) {
	            f--;
	            troca3++;
	        } else {
	            int troca = vetor1[i];
	            vetor1[i] = vetor1[f];
	            vetor1[f] = troca;
	            i++;
	            f--;
	            troca3--;
	        }
	    }
	    vetor1[inicio] = vetor1[f];
	    vetor1[f] = pivo;
	    return f;
	}


	//METODO INSERTION;
	
	private static void sortInsertionSort() {
		int j;
		int chave;
		int i;
		int correr2 = 0;
		int troca2 = 0;
		for (j = 1; j < numInsertion.length; j++) {
			correr2++;
			chave = numInsertion[j];
			
			for( i = j - 1; (i>=0)&&(numInsertion[i] > chave); i--) {
				numInsertion[i+1] = numInsertion[i];
				troca2++;
			}
			numInsertion[i+1]=chave;
		}
		System.out.println("");
		System.out.println("Metodo Insertion: ");
		System.out.println("quantas vezes correu pelo código: "+correr2);
		System.out.println("quantas vezes houve trocas dentro do código: "+troca2);
		for (int test = 0; test < num.length - 1; test++) {
			System.out.print(numInsertion[test] + ", ");
		}
		System.out.println(" ");

	}

	
	//METODO BUBLE;
	
	private static void sortBubleSort() {
		boolean logica = true;
		int aux;
		int correr1 = 0;
		int troca1 = 0;
		while (logica){
			logica = false;
			correr1++;
			for (int i = 0; i < numBuble.length - 1; i++ ) {
				if (numBuble[i] > numBuble[i + 1]) {
					aux  = numBuble[i];
					numBuble[i] = numBuble[i+1];
					numBuble[i+1] = aux;
					logica=true;
					troca1++;
				}
			}
		}
		System.out.println("Metodo Bubble: ");
		System.out.println("quantas vezes correu pelo código: "+correr1);
		System.out.println("quantas vezes houve trocas dentro do código: "+troca1);
		for (int test = 0; test < num.length - 1; test++) {
			System.out.print(numBuble[test] + ", ");
		}
		System.out.println(" ");
	}

		
	//AQUI ELE DIVIDE A ARRAY COM OS OUTROS METODOS;
	
	private static void getSplit() {
		for(int i = 0; i < 100; i++) {
			numBuble[i] =  num[i];
			numInsertion[i] = num[i];
			numQuick[i] = num[i];
			numSelection[i] = num[i];
			numMerge[i] = num[i];
		}
		
	}
	
	
	//AQUI ELE GERA OS 100 NÚMEROS ALEATÓRIOS;
	
	private static void getInfo() {
		Random random = new Random();
		System.out.println("Números da aleatóriedades: ");
		for (int count = 0; count < num.length; count++) {
			num[count] = random.nextInt(100);
			System.out.print(num[count] + ", ");
			
		}
		System.out.println(" ");
		System.out.println(" ");
		
		
	}
	
	
	//AQUI ELE IMPRIME OS NÚMEROS ALEATÓRIOS ORDENADOS PELO MÉTODO;
	
	private static void ShowInfo() {
		//System.out.print("Elementos de uma array ordenada: ");
		System.out.println(" ");
		for (int test = 0; test < num.length - 1; test++) {
			
		}

		
	}
	
}