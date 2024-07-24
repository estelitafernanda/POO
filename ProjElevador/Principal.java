package visao;

import java.util.Scanner;
import aplicacao.Elevador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		Elevador e1 = new Elevador(); 
		int op;
		
		e1.inicializa(4, 5);
		
		do {
			System.out.println("Menu Principal");
			System.out.println("1 - Entra");
			System.out.println("2 - Sai");
			System.out.println("3 - Sobe");
			System.out.println("4 - Desce");
			System.out.println("5 - Sair");
			System.out.println("Qual a opção desejada?");
			op = teclado.nextInt(); 
			
			switch (op) {
			case 1: //resposta = ;
				if (e1.entra()) {
					System.out.println("Entrada Permitida");
				}else {
					System.out.println("Entrada negada, elevador cheio");
				}
				break;
			case 2:
				if (e1.sai()) {
					System.out.println("Saída permitida");
				}else {
					System.out.println("Saída negada");
				}
				break;
			case 3:
				if (e1.sobe()) {
					System.out.println("Subida permitida");
				}else {
					System.out.println("Subida negada, último andar");
				}
				break;
			case 4:
				if (e1.desce()) {
					System.out.println("Descida permitida");
				}else {
					System.out.println("Descida negada, último andar");
				}
				break;
			case 5:
				System.out.println("Fim do programa");
				break;
			}
		}while (op!= 5);
	}

}