package gerenciador;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefa {
	
	private List<Tarefa> listaTarefas;
	
	
	public GerenciadorTarefa() {
		this.listaTarefas = new ArrayList<>();
		
	}
	
	// Adicionar uma tarefa
	
	public void AdicionarTarefa( String titulo, String descrição, String dataVencimento){
		Tarefa novaTarefa = new Tarefa(titulo, descrição, dataVencimento);
		listaTarefas.add(novaTarefa);
		System.out.println("Tarefa adicionada com sucesso! ");
	}
	
	
	// Exibir Lista de tarefas
	
	public void ExibirTarefa() {
		
		if(listaTarefas.isEmpty()) {
			System.out.println("Não há tarefas cadastradas!");
		}
		
		else {
			System.out.println("==== Lista de Tarefas ====");
			for(Tarefa tarefa : listaTarefas) {
				System.out.println("Titulo: "+ tarefa.getTitulo());
				System.out.println("Descrição: "+ tarefa.getDescriçao());
				System.out.println("Data de Vencimento: "+ tarefa.getDataVencimento());
				System.out.println("Concluida: "+ (tarefa.isConcluida() ? "sim" : "Não"));
				System.out.println();
				
			}
		}
		
		
	}
}
