package br.fag.edu.library;

public class Emprestimo {
	private Aluno aluno;
	private Obra obra;
	private String date;
	private String entrega;
	private String status;
	
	public Aluno getAluno() {
		return aluno;
	}
	public Obra getObra() {
		return obra;
	}
	public String getDate() {
		return date;
	}
	public String getEntrega() {
		return entrega;
	}
	public String getStatus() {
		return status;
	}
	
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public void setObra(Obra obra) {
		this.obra = obra;
	}
	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String showInfo() {
		return ("Aluno: " + this.getAluno().getNome()+"\nObra: "+this.getObra().getName()+", "+this.getObra().getTema()+"\nData do empréstimo: "+this.date+"\nData para entrega: "+this.entrega+"\nStatus: "+status);
	}
	
}
