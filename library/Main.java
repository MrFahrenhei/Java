package br.fag.edu.library;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static Scanner entry = new Scanner(System.in);
	
	private static DateTimeFormatter agoraData = DateTimeFormatter.ofPattern("dd/mm/yy");
	public static String dataCadastrada  = agoraData.format(LocalDateTime.now());

	public static void main(String[] args) {
		Quadrinhos hq1 = new Quadrinhos(1, "Batman alguma coisa", dataCadastrada, "10 anos","Portugues", "Ficcao detetive", "DC comics");
		Jornal jornal1 = new Jornal(1, "Jornal do povo", dataCadastrada, "Livre","Portugues","Informativo", 12, "Todo Dia", "Estado");
		Revista revista1 = new Revista(1, "Muffatasso", dataCadastrada, "Livre", "Portugues" ,"Culinaria", "Muffatao", 32, "Mensal");
		Filme filme1 = new Filme(1, "Esquadrao Suicida 1", dataCadastrada, "Juvenil", "Portugues" , "Acao",120, "Warner Bros");
		Livro book1 = new Livro(1, "Arte de ligar o foda-se", dataCadastrada, "Infanto Juvenil","Portugues", "Fantasia", "Tempo Livre", 350);
		System.out.println(hq1);
		System.out.println("");
		System.out.println(jornal1);
		System.out.println("");
		System.out.println(revista1);
		System.out.println("");
		System.out.println(filme1);
		System.out.println("");
		System.out.println(book1);
		
		Aluno aluno1 = new Aluno(1, "Jaspinho", 114520942, "Rua manteiga");
		Aluno aluno2 = new Aluno(2, "Klevis", 253678945, "Rua farofa");
		Aluno aluno3 = new Aluno(3, "Robson", 34234234, "Rolha");
		System.out.println("");
		System.out.println("Lista de emprestimo");
		System.out.println("");
		Emprestimo emprestimo1 = new Emprestimo();
		emprestimo1.setAluno(aluno1);
		emprestimo1.setObra(hq1);
		emprestimo1.setDate("01/02/2022");
		emprestimo1.setEntrega("10/02/2022");
		emprestimo1.setStatus("Atrasado");
		System.out.println(emprestimo1.showInfo());
		System.out.println("");
		Emprestimo emprestimo2 = new Emprestimo();
		emprestimo2.setAluno(aluno2);
		emprestimo2.setObra(book1);
		emprestimo2.setDate("20/03/2022");
		emprestimo2.setEntrega("26/03/2022");
		emprestimo2.setStatus("Renovado");
		System.out.println(emprestimo2.showInfo());
		System.out.println("");
		Emprestimo emprestimo3 = new Emprestimo();
		emprestimo3.setAluno(aluno3);
		emprestimo3.setObra(revista1);
		emprestimo3.setDate(dataCadastrada);
		emprestimo3.setEntrega("20/05/2022");
		emprestimo3.setStatus("Devolvido");
		System.out.println(emprestimo3.showInfo());
	}

}
