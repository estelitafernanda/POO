package visao;

import java.util.Scanner;

import aplicacao.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		int op, aux; 
		Aluno a1, a2, a3;
		a1 = new Aluno();
		a2 = new Aluno();
		a3 = new Aluno();
		Scanner teclado = new Scanner(System.in);  
		
		
		do {
			System.out.println("---------------------------------");
			System.out.println("MENU PRINCIPAL");
			System.out.println("---------------------------------");
			System.out.println("1 - CADASTRAR ALUNOS");
			System.out.println("2 - CADASTRAR NOTAS");
			System.out.println("3 - CALCULAR MÉDIAS");
			System.out.println("4 - INFORMAR SITUAÇÕES");
			System.out.println("5 - INFORMAR DADOS DE UM ALUNO");
			System.out.println("6 - ALTERAR NOTA");
			System.out.println("7 - SAIR");
			System.out.println("---------------------------------");
			System.out.println("Digite a opção desejada: ");
			op = teclado.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Matricula Aluno 1: ");
				a1.setMatricula(teclado.nextInt());
				teclado.nextLine();
				System.out.println("Nome Aluno 1: ");
				a1.setNome(teclado.nextLine());
				System.out.println("Matricula Aluno 2: ");
				a2.setMatricula(teclado.nextInt());
				teclado.nextLine();
				System.out.println("Nome Aluno 2: ");
				a2.setNome(teclado.nextLine());
				System.out.println("Matricula Aluno 3: ");
				a3.setMatricula(teclado.nextInt());
				teclado.nextLine();
				System.out.println("Nome Aluno 3: ");
				a3.setNome(teclado.nextLine());
				break;
			case 2: 
				System.out.println("Digite as 3 notas do Aluno 1: ");
				a1.setNotas(teclado.nextFloat(), teclado.nextFloat(), teclado.nextFloat());
				System.out.println("Digite as 3 notas do Aluno 2: ");
				a2.setNotas(teclado.nextFloat(), teclado.nextFloat(), teclado.nextFloat());
				System.out.println("Digite as 3 notas do Aluno 3: ");
				a3.setNotas(teclado.nextFloat(), teclado.nextFloat(), teclado.nextFloat());
				break;
			case 3: 
				a1.calcularMedia();
				a2.calcularMedia();
				a3.calcularMedia();
				break;
			case 4:
				System.out.println("Situação do Aluno 1: ");
				a1.getSituacao();
				System.out.println("Situação do Aluno 2: ");
				a2.getSituacao();
				System.out.println("Situação do Aluno 3: ");
				a3.getSituacao();
				break;
			case 5:
				System.out.println("Digite a matricula do aluno procurado: ");
				aux = teclado.nextInt();
				Aluno aAux = null;
				if(a1.buscarAluno(aux)) {
					aAux = a1;
				}else {
					if(a2.buscarAluno(aux)) {
						aAux = a2;
					}else {
						if(a3.buscarAluno(aux)) {
							aAux = a3;
						}
					}
				}
				if(aAux!=null) {
					System.out.println("Nome: "+aAux.getNome());
					System.out.println("Nota 1: "+aAux.getNota1());
					System.out.println("Nota 2: "+aAux.getNota2());
					System.out.println("Nota 3: "+aAux.getNota3());
					System.out.println("Media: "+aAux.getMedia());
					System.out.println("Situação: "+aAux.getSituacao());
				}else {
					System.out.println("Aluno não cadastrado");
				}
				break;
			case 6:
				System.out.println("Digite a matricula do aluno procurado: ");
				aux = teclado.nextInt();
				if(a1.buscarAluno(aux)) {
					do{
						System.out.println("Qual nota deseja alterar (1, 2 ou 3)? ");
						aux = teclado.nextInt();
					}while((aux<1)||(aux>3));
					System.out.println("Qual o novo valor da nota "+aux+"? ");
					a1.alterarNota(aux, teclado.nextFloat());
				}else {
					if(a2.buscarAluno(aux)) {
						do{
							System.out.println("Qual nota deseja alterar (1, 2 ou 3)? ");
							aux = teclado.nextInt();
						}while((aux<1)||(aux>3));
						System.out.println("Qual o novo valor da nota "+aux+"? ");
						a2.alterarNota(aux, teclado.nextFloat());
					}else {
						if(a3.buscarAluno(aux)) {
							do{
								System.out.println("Qual nota deseja alterar (1, 2 ou 3)? ");
								aux = teclado.nextInt();
							}while((aux<1)||(aux>3));
							System.out.println("Qual o novo valor da nota "+aux+"? ");
							a3.alterarNota(aux, teclado.nextFloat());
						}else {
							System.out.println("Aluno não cadastrado");
						}
					}
				}
				break;
			case 7:
				System.out.println("Fim de programa");
				break;
			}
			
		} while(op != 7);
			
	}

}
