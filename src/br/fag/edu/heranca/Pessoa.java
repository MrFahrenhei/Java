package br.fag.edu.heranca;

public class Pessoa {
	private String name;
	private int idade;
	private String sex;
	
	public String getName() {
		return name;
	}
	public int getIdade() {
		return idade;
	}
	public String getSex(){
		return sex;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return ("Nome: " + getName() + "\n" + "idade: "+getIdade()+"\n"+"Sexo: "+getSex());
	}
}
