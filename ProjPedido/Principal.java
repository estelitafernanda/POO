package visao;
import java.util.ArrayList;
import aplicacao.Pedido;
import java.util.Scanner; 
public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Pedido> pedidos = new ArrayList<>();
		Scanner teclado = new Scanner (System.in);
		int op;
		do {
			System.out.println("Menu:");
	        System.out.println("1 - Fazer Pedido");
	        System.out.println("2 - Confirmar Entrega");
	        System.out.println("3 - Ver pedidos confirmados");
	        System.out.println("4 - Ver pedidos entregues");
	        System.out.println("5 - Sair");
	        op = teclado.nextInt(); 
	        teclado.nextLine();
			
	        
	        switch(op) {
	        case 1:
	        	System.out.println("Fazendo Pedido");
	        	System.out.println("Digite seu endereço:");
	        	String endereco = teclado.nextLine();
	        	System.out.println("Digite a hora: ");
	        	String hora = teclado.next();
	        	
	        	Pedido pedido = new Pedido(endereco, hora); 
	        	
	        	System.out.println("Informações do Pedido: ");
	        	System.out.println("Endereço: " + pedido.getEndereco());
	        	System.out.println("Hora:" + pedido.getHora());
	        	
	        	String alterar; 
	        	do {
	        		System.out.println("Deseja fazer alguma alteração no pedido? (Sim ou S para continuar, qualquer coisa para sair)");
	        		alterar = teclado.nextLine(); 
	        		if(alterar.equalsIgnoreCase("Sim") || alterar.equalsIgnoreCase("S")) {
	        			System.out.println("O que deseja alterar?");
	        			System.out.println("1 - Endereço");
	        			System.out.println("2 - Hora");
	        			int opcao = teclado.nextInt();
	        			teclado.nextInt();
	        			switch(opcao) {
	        				case 1: 
	        					System.out.println("Digite o novo Endereço:");
	        					String novoEndereco = teclado.nextLine();
	        					pedido.setEndereco(novoEndereco);
	        					break;
	        				case 2:
	        					System.out.println("Digite a nova Hora:");
	        					String novaHora = teclado.nextLine();
	        					pedido.setHora(novaHora);
	        					break;
	        			}
	        		}
	        	} while (alterar.equalsIgnoreCase("Sim")|| alterar.equalsIgnoreCase("S"));
	        	System.out.println("Quantidade:");
	        	int quantidade = teclado.nextInt();
	        	pedido.setQuantidade(quantidade);
	        	System.out.println("Valor: R$" + pedido.getValor());
	        	System.out.println("Digite o número do Cartão:");
	        	String numeroCartao = teclado.next();
	        	pedido.setNumeroCartao(numeroCartao);
	        	pedido.setConfirmado(true); 
	        	System.out.println("Pedido Confirmado! Código do pedido:" + pedido.getCodigo()); 
	        	pedidos.add(pedido); 
	        	break;
	        case 2:
	        	System.out.println("Digite o código do pedido para confirmar a entrega: ");
	        	int codigoEntrega = teclado.nextInt(); 
	        	boolean encontrado = false; 
	        	for (Pedido p : pedidos) {
	        		if (p.getCodigo() == codigoEntrega) {
	        			p.setEntregue(true);
	        			encontrado = true; 
	        			System.out.println("Pedido confirmado como entregue");
	        			break; 
	        		}
	        	}
	        	if (!encontrado) {
	        		System.out.println("Pedido não localizado");
	        	}
	        	break;
	        case 3:
	        	System.out.println("Pedidos Confirmados:");
	        	for (Pedido p : pedidos) {
	        		if (p.isConfirmado() && !p.isEntregue()) {
	        			System.out.println("Código do pedido:" + p.getCodigo() + ", Endereço: " + p.getEndereco() + ",Hora: " + p.getHora());
	        		}
	        	}
	        	break;
	        case 4:
	        	System.out.println("Pedidos Entregues:");
	        	for (Pedido p : pedidos) {
	        		if (p.isEntregue()) {
	        			System.out.println("Código do pedido:" + p.getCodigo() + ", Endereço: " + p.getEndereco() + ",Hora: " + p.getHora());
	        		}
	        	}
	        	break;
	        case 5:
	        	System.out.println("Fim de programa");
	        	break; 
	        }
	        
	        
	        
		}while(op != 5);
	}
}
