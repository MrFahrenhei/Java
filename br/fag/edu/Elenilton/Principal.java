package br.fag.edu.Elenilton;

public class Principal {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Dezengrini");
		gerente.setSalario(100);
		gerente.setTempoDeEmpresa(5);
		gerente.reajustarSalario(0.1);
		gerente.setLogradouroDescricao("Av das Torres");
		gerente.setLogradouroNumero("500");
		System.out.println(gerente.getSalario());

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Elenilton");
		funcionario.setSalario(100);
		funcionario.reajustarSalario(0.1);
		System.out.println(funcionario.getSalario());

		System.out.println(funcionario);

		System.out.println(gerente);


	}

}
