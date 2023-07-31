package gerenciador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefa {
	
	private List<Tarefa> listaTarefas;
	Scanner scanner = new Scanner(System.in);
	
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
			int i= 0;
			for(Tarefa tarefa : listaTarefas) {
				i=i+1;
				System.out.println(i + " Tarefa: " + tarefa.getTitulo());
				System.out.println("Descrição: " + tarefa.getDescriçao());
				System.out.println("Data de Vencimento: " + tarefa.getDataVencimento());
				System.out.println("Concluida: " + (tarefa.isConcluida() ? "Sim" : "Não") + "\n");
				
			}	
			}
	
		}			
	
	
	public void ExcluirTarefa() {
		if(listaTarefas.isEmpty()) {
			System.out.println("Não há tarefas cadastradas");
		}
		else {
			ExibirTarefa();
			System.out.println("Digite o titulo da tarefa que deseja excluir: ");
			String selection = scanner.nextLine();
			
			Iterator<Tarefa> iterator = listaTarefas.iterator();
			boolean encontrou = false;
			
			while (iterator.hasNext()) {
				Tarefa tarefa = iterator.next();
				if (tarefa.getTitulo().equals(selection)) {
					iterator.remove();
					encontrou = true;
					break;
				}
		}
			if (encontrou) {
				System.out.println("Tarefa" + selection + "excuida com sucesso" );
			}
			else {
				System.out.println("Tarefa "+ selection + " não encontrada!");
			}
			
			}
		
		
		
	}
}
	
	
























