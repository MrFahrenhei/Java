package br.fag.edu.lista03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	
	public static int age, maior, cont, contM, contF, menor = 9999;
	public static double salario, media, menor_salario = 9999, maiorIdade = 0, menor_idade = 9999;
	public static String sex = "null", M = "M", F = "F", menorSexo = "Null";
	public static Scanner entry = new Scanner (System.in);
	public static DecimalFormat formatterD = new DecimalFormat("#.00"); //casas decimais ap�s a v�rgula
	public static NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR")); //adiciona o $ do realu
	
	public static void main(String[] args) {
		do {
			System.out.println("Qual a sua idade: ");
			age = entry.nextInt();
		if (age < 0) {break;}
			System.out.println("Seu g�nero <M/F>: ");
			sex = entry.next();
			System.out.println("Quanto � o seu sal�rio: ");
			salario = entry.nextDouble();
			media = media + salario;
		if (age > maior) {
				maior = age;
			}
		if (age < menor) {
				menor = age;
			}
		if (sex.equalsIgnoreCase(M)) { //ignora o case se � ma�uculo ou min�sculo
				contM++;
			}
		if (sex.equalsIgnoreCase(F)) { 
				contF++;
			}
		if(age == menor){
				menor_salario = salario;
				menorSexo = sex;
				menor_idade = age;
			}
		} 
		
	while (age >= 0); {
		System.out.println("A media do sal�rio do grupo: "+formatterD.format(media/(contF+contM)));
		System.out.println("A maior idade do grupo: "+maior);
		System.out.println("A menor idade do grupo: "+menor);
		System.out.println("A quantidade de mulheres: "+contF);
		System.out.println("A quantidade de homens: "+contM);
		System.out.println("G�nero com menor idade e seu sal�rio: G�nero: "+menorSexo+", idade: "+menor+" e Sal�rio: "+formatter.format(menor_salario));
		}
	}
}