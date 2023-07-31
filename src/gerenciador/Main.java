package gerenciador;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		GerenciadorTarefa gerenciador = new GerenciadorTarefa();
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println(" ===== Gerenciador de Tarefas =====");
			System.out.println("1. Adicionar Tarefa");
			System.out.println("2. Exibir Tarefas");
			System.out.println("3. Excluir Tarefa");
			System.out.println("4. Sair");
			System.out.println("Escolha uma opção");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.println("Digite o Titulo da Tarefa:");
				scanner.nextLine(); // Limpeza buffers
				String titulo = scanner.nextLine();
				
				System.out.println("Digite a Descrição: ");
				String descricao = scanner.nextLine();
				
				System.out.println("Digite a data de vencimento:");
				String dataVencimento = scanner.nextLine();
				
				gerenciador.AdicionarTarefa(titulo, descricao, dataVencimento);
				break;
				
			case 2:
				gerenciador.ExibirTarefa();
			case 3:
				gerenciador.ExibirTarefa();
				System.out.println("Digite o titulo da tarefa que deseja excluir: ");
				scanner.next();
				
				
				gerenciador.ExcluirTarefa();
			
			case 4:
				break;
			
			default:
				System.out.println("Opção invalida");
				
			}
			
		}while (opcao != 4);
		
		System.out.println("Encerrando Programa...");
		scanner.close(); // fechar  o scanner apos encerrar o programa
			
		
	}

}
