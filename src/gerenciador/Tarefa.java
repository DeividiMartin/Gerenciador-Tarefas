package gerenciador;

public class Tarefa {
	
	public Tarefa(String titulo, String descriçao, String dataVencimento) {

		this.titulo = titulo;
		this.descriçao = descriçao;
		this.dataVencimento = dataVencimento;
		this.concluida = false;
	}
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescriçao() {
		return descriçao;
	}


	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}


	public String getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	public boolean isConcluida() {
		return concluida;
	}


	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}


	private String titulo;
	private String descriçao;
	private String dataVencimento;
	private boolean concluida;
	
	
}
