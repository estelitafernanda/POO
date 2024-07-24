package visao;

import java.util.ArrayList;
import java.util.Scanner; 
import aplicacao.Pessoa;

public class Principal {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList <Pessoa> agenda = new ArrayList<>();
		int op;
		do {
			System.out.println("Agenda");
			System.out.println("1 - Cadastrar Pessoa");
			System.out.println("2 - Remover pessoa");
			System.out.println("3 - Buscar pessoa");
			System.out.println("4 - Informar um dado específico");
			System.out.println("5 - Ver toda Agenda");
			System.out.println("6 - Sair");
			op = teclado.nextInt(); 
			
			switch (op) {
				case 1:
					String nomeP, telefoneP, emailP;
					System.out.println("Cadastrar Pessoa");
					teclado.nextLine();
					System.out.println("Nome: ");
					nomeP = teclado.nextLine();
					System.out.println("Telefone: ");
					telefoneP = teclado.nextLine();
					System.out.println("Email: ");
					emailP = teclado.nextLine(); 
					Pessoa pessoa = new Pessoa(nomeP, telefoneP, emailP); 
					agenda.add(pessoa); 
					break;
				case 2:
				    System.out.println("Digite o número de telefone da pessoa que você quer deletar:");
				    teclado.nextLine(); // Consume o caractere de nova linha
				    telefoneP = teclado.nextLine(); 
				    
				    boolean apagou = false;
				    for (Pessoa pessoa1 : agenda) {
				        if (pessoa1.getTelefone().equals(telefoneP)) {
				           System.out.println("O contato foi apagado");
				            apagou = true;
				            agenda.remove(pessoa1);
				            break; 
				        }
				    }
				    if (!apagou) {
				    	System.out.println("Contato não encontrado"); 
				    }
					break; 
				case 3:
					 System.out.println("Digite o número de telefone da pessoa que você quer buscar:");
					  	teclado.nextLine(); // Consume o caractere de nova linha
					  	telefoneP = teclado.nextLine(); 
					  	
					 boolean encontrado = false;
					    for (Pessoa pessoa1 : agenda) {
					        if (pessoa1.getTelefone().equals(telefoneP)) {
					           System.out.println("Nome:" + pessoa1.getNome());
					           System.out.println("Telefone:" + pessoa1.getTelefone());
					           System.out.println("Email:" + pessoa1.getEmail());
					           
					           encontrado = true;
					            break; 
					        }
					    }
					    if (!encontrado) {
					    	System.out.println("Contato não encontrado"); 
					    }
					    break;
				case 4:
					String nome;
					int resultado; 
					teclado.nextLine();
					System.out.println("Digite o nome da pessoa para saber o dado:");
					nome = teclado.nextLine();
					
					for (Pessoa pessoa1 : agenda) {
						if (pessoa1.getNome().equals(nome)) {
							System.out.println("Qual dado você quer saber 1 para telefone, 2 para email?");
							resultado = teclado.nextInt();
							switch (resultado) {
								case 1:
									System.out.println("Telefone: " + pessoa1.getTelefone());
									break;
								case 2:
									System.out.println("Email: " + pessoa1.getEmail()); 
									break;
							}
						}
					}
					break;
				case 5:
					for (Pessoa pessoa1 : agenda) {
				           System.out.println("Nome:" + pessoa1.getNome());
				           System.out.println("Telefone:" + pessoa1.getTelefone());
				           System.out.println("Email:" + pessoa1.getEmail());
					}
						break; 
				case 6:
					System.out.println("Fim de programa"); 
					break;
			}
		}while (op != 6);
	}
}
