package br.fag.oop;

public class Cliente 
{
	
	private int idCliente;
	private String nameCliente;
	private String cpfCliente;
	private String telCliente;
	private String adressCliente;
	
	public Cliente(int idCliente, String nameCliente, String cpfCliente, String telCliente, String adressCliente) 
	{
		this.idCliente = idCliente;
		this.nameCliente = nameCliente;
		this.cpfCliente = cpfCliente;
		this.telCliente = telCliente;
		this.adressCliente = adressCliente;
	}
	
	public int getId() {
		return idCliente;
	}
	public String getCPF() {
		return cpfCliente;
	}
	public String getName() {
		return nameCliente;
	}
	public String getTel() {
		return telCliente;
	}
	public String getAdress() {
		return adressCliente;
	}

	public void showInfo()
	{
		System.out.printf("Id Cliente: %s \n", this.idCliente);
		System.out.printf("Nome Cliente: %s \n", this.nameCliente);
		System.out.printf("Cpf Cliente: %s \n", this.cpfCliente);
		System.out.printf("Telefone Cliente: %s \n", this.telCliente);
		System.out.printf("Endereço Cliente: %s \n", this.adressCliente);
	}
	public void showBasic() 
	{
		System.out.printf("Id do cliente: %s \n", this.idCliente);
		System.out.printf("Cliente: %s \n", this.nameCliente);
		System.out.printf("Cpf: %s \n", this.cpfCliente);
	}
}