package br.fag.edu.heranca;

public class Gerente extends Empregado {
	private String departamento;
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return(super.toString() + "\n" + "Departamento: "+getDepartamento() + "\n");
	}

}
