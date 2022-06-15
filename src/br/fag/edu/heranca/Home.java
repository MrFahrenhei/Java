package br.fag.edu.heranca;

public class Home {

	public static void main(String[] args) {
		Empregado buiu = new Empregado();
			buiu.setName("Buiu");
			buiu.setIdade(44);
			buiu.setSex("Masculino");
			buiu.setSalario(1200.00);
			buiu.setMatricula("Empregado");
			buiu.calculaINSS();

		System.out.println(buiu);
		
		System.out.println("\n");
		
		Gerente scott = new Gerente();
			scott.setName("Michael Scott");
			scott.setIdade(49);
			scott.setSex("Masculino");
			scott.setSalario(2300.00);
			scott.setMatricula("Gerente Regional");
			scott.setDepartamento("Dunder Mifflin");

		System.out.println(scott);

		Vendedor dwight = new Vendedor();
			dwight.setName("Dwight");
			dwight.setIdade(34);
			dwight.setSex("Masculino");
			dwight.setSalario(1900.00);
			dwight.setMatricula("Vendedor de papel");
			dwight.setValorComissao(643.27);
		
		System.out.println(dwight);
		
		Cliente nilton = new Cliente(9000, 1976);
			nilton.setName("Hesnilton");
			nilton.setIdade(33);
			nilton.setSex("Masculino");
		
		System.out.println(nilton);
		
	}

}
