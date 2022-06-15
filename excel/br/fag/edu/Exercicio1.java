package br.fag.edu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Exercicio1 {

	public static int number[][] = new int[60][2];
	public static int take = 1;
	
	public static void main(String[] args) {
		
		getToTheSheets();
		makeMyDay();
		
	}
	private static void makeMyDay() {
		for (int linha = 0; linha < number.length; linha++) {
			number[linha][0] = take;
			take++;
			for (int coluna = 0; coluna < number[0].length; coluna++) {
				System.out.print(number[linha][coluna] + " ");
			}
			System.out.println(" ");
		}
	}
	private static void getToTheSheets() {
		
		int li = 2415;
		String dados[][] = new String[li][8];
		
		try {
			
			Workbook workbook = Workbook.getWorkbook(new File("src/trabson/mega_sena_asloterias_ate_concurso_2408_crescente.xls"));
			Sheet sheet = workbook.getSheet(0);

			File arquivo = new File("src/trabson/mega_sena_asloterias_ate_concurso_2408_crescente.xls");
			FileReader leitura;
			leitura = new FileReader(arquivo);
			BufferedReader ler = new BufferedReader(leitura);

			for (int linha = 7; linha < li; linha++) {
				for (int coluna = 2; coluna < 8; coluna++) {
					Cell celula = sheet.getCell(coluna, linha);
					String valor = celula.getContents();
					int Convertido = Integer.parseInt(valor);
					dados[linha][coluna] = valor;
					number[Convertido - 1][1]++;
				}}
			workbook.close();
			ler.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (BiffException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unused")
	private static void mostrarMatriz(String[][] dados) {
		for (int linha = 7; linha < dados.length; linha++) {
			for (int coluna = 2; coluna < dados[linha].length; coluna++) {
				System.out.print(dados[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}
