package br.fag.edu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Exercicio2 {

	public static int num1[][] = new int[60][2];
	public static int criar = 1;

	public static int infos[][] = new int[2408][6];
	public static String data[] = new String[2408];

	public static int c = 0;
	public static int sort1[] = new int[6];
	public static int sort2[] = new int[6];

	public static Scanner scan = new Scanner(System.in);
	public static Random random = new Random();
	public static DecimalFormat formatador = new DecimalFormat("00");

	public static void main(String[] args) {
		
		readSheets();
		doTheSort();
		System.out.println("Sorteio Realizado pelo usuário");
		while (c < 6) {
			SorteioU();
		}
		Comparar();
	}

	private static void SorteioU() {
		int valor = scan.nextInt();
		sort2[c] = valor;
		c++;
	}

	private static void Comparar() {
		int acerto = 0;
		int aprox = 0;
		int lineAprox = 0;
		boolean verify = false;
		int aprox2 = 0;
		int lineAprox2 = 0;
		boolean verify2 = false;
		int parar = 0;
		int parar1 = 0;
		int acerto1 = 0;
		for (int linha = 0; linha < infos.length; linha++) {
				acerto = 0;
				acerto1 = 0;
				
			for (int coluna = 0; coluna < sort2.length; coluna++) {

					if (infos[linha][coluna] == sort1[coluna]) {
						acerto++;
							if (acerto > aprox) {
								aprox = acerto;
								lineAprox = linha;
							}
					}
					
				if (acerto == 6) {
						verify = true;
					System.out.printf("\n");
					System.out.printf("\n");
					System.out.println("Sorteiro Gerado");
					System.out.println(Arrays.toString(sort1));
					System.out.printf("Datas: %s", data[linha]);
					System.out.printf("\n");
					System.out.printf("Linha: %d  ", linha + 8);
					System.out.printf("\n");
					System.out.printf("\n");

						for (int coluna1 = 0; coluna1 < sort2.length; coluna1++) {
							System.out.printf("Matriz:  %s  Coluna: %d", formatador.format(infos[linha][coluna1]),coluna1 + 2);
							System.out.printf("\n");
							System.out.printf("Sorteio: %s", formatador.format(sort1[coluna1]));
							System.out.printf("\n");
						}
				} else if (linha + 1 == 2408) {
						parar++;
					if (parar > 5 & verify == false) {
						System.out.printf("\n");
						System.out.printf("\n");
						System.out.println("Ninguem acertou o sorteio gerado");
						System.out.println("Valores próximos ao sorteio gerado");
						System.out.println(Arrays.toString(sort1));
						System.out.printf("Datas: %s", data[lineAprox]);
						System.out.printf("\n");
						System.out.printf("Linha: %d  ", lineAprox + 8);
						System.out.printf("\n");
						System.out.printf("\n");

						for (int coluna3 = 0; coluna3 < sort2.length; coluna3++) {
							System.out.printf("Matriz:  %s  Coluna: %d", formatador.format(infos[lineAprox][coluna3]),coluna3 + 2);
							System.out.printf("\n");
							System.out.printf("Sorteios: %s", formatador.format(sort1[coluna3]));
							System.out.printf("\n");
						}}}

				if (infos[linha][coluna] == sort2[coluna]) {
							acerto1++;
						if (acerto1 > aprox2) {
							aprox2 = acerto1;
							lineAprox2 = linha;
						}
				}
				if (acerto1 == 6) {
						verify2 = true;
					System.out.printf("\n");
					System.out.printf("\n");
					System.out.println("Sorteiro gerado igual ao do usuário");
					System.out.println(Arrays.toString(sort2));
					System.out.printf("Datas: %s", data[linha]);
					System.out.printf("\n");
					System.out.printf("Linha: %d  ", linha + 8);
					System.out.printf("\n");
					System.out.printf("\n");

					for (int coluna2 = 0; coluna2 < sort2.length; coluna2++) {
						System.out.printf("Matriz:  %s  Coluna: %d", formatador.format(infos[linha][coluna2]),coluna2 + 2);
						System.out.printf("\n");
						System.out.printf("Sorteio: %s", formatador.format(sort2[coluna2]));
						System.out.printf("\n");
					}
				} else if (linha + 1 == 2408) {
						parar1++;
					if (parar1 > 5 & verify2 == false) {
						System.out.printf("\n");
						System.out.printf("\n");
						System.out.println("Não houve vencedor no sorteiro feito pelo usuários");
						System.out.println("Valores aproximados ao sorteio gerado pelo usuário");
						System.out.println(Arrays.toString(sort2));
						System.out.printf("Datas: %s", data[lineAprox2]);
						System.out.printf("\n");
						System.out.printf("Linha: %d  ", lineAprox2 + 8);
						System.out.printf("\n");
						System.out.printf("\n");

						for (int coluna4 = 0; coluna4 < sort2.length; coluna4++) {
							System.out.printf("Matriz:  %s  Coluna: %d", formatador.format(infos[lineAprox2][coluna4]), coluna4 + 2);
							System.out.printf("\n");
							System.out.printf("Sorteio: %s", formatador.format(sort2[coluna4]));
							System.out.printf("\n");
						}
					}
				}
			}
		}
	}


	private static void doTheSort() {
		for (int i = 0; i < sort1.length; i++) {
				boolean y = false;
			while (y == false) {
					int x = random.nextInt(59) + 1;
				for (int j = 0; j < sort1.length; j++) {

					if (sort1[j] == x) {break;}

					if (j + 1 == sort1.length) {sort1[i] = x; y = true;}
				}
			}
		}

		System.out.println("Sorteio Aleatorio");
			for (int L = 0; L < sort1.length; L++) {
				System.out.println(formatador.format(sort1[L]));
			}
		System.out.println(" ");
	}

	@SuppressWarnings("unused")
	private static void criarArray() {
		for (int L = 0; L < num1.length; L++) {
			num1[L][0] = criar;
			criar++;
			for (int coluna = 0; coluna < num1[0].length; coluna++) {
				System.out.print(formatador.format(num1[L][coluna]) + " ");
			}
			System.out.println(" ");
		}
	}

	private static void readSheets() {
		try {
			String local = "src/trabson/mega_sena_asloterias_ate_concurso_2408_crescente.xls";
			File file = new File(local);
			FileInputStream fileStream = new FileInputStream(file);

			Workbook workbook = Workbook.getWorkbook(fileStream);

			Sheet sheet = workbook.getSheet(0);

			BufferedReader ler = new BufferedReader(new FileReader(file));

			for (int L = 7; L < 2415; L++) {
				for (int C = 2; C < 8; C++) {
					Cell celula = sheet.getCell(C, L);
					String valor = celula.getContents();
					int Convertido = Integer.parseInt(valor);
					infos[L - 7][C - 2] = Convertido;
					num1[Convertido - 1][1]++;
				}
			}

			for (int L = 7; L < 2415; L++) {
				Cell celula1 = sheet.getCell(1, L);
				String valor1 = celula1.getContents();
				data[L - 7] = valor1;
			}

			workbook.close();
			ler.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private static void mostrarMatriz() {
		for (int L = 0; L < infos.length; L++) {
			for (int C = 0; C < infos[0].length; C++) {
				System.out.print(formatador.format(infos[L][C]) + " ");
			}
			System.out.println(" ");
		}
	}
}