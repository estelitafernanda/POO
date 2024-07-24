package aplicacao;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int capacidadeAtual;
	
	public void inicializa (int cap, int totAnd) {
		capacidade = cap;
		totalAndares = totAnd;
		andarAtual = 0; //começar no térreo
		capacidadeAtual = 0; //começar vazio 
	}
	public boolean entra() {
		if (capacidadeAtual < capacidade) {
			capacidadeAtual++;
			return true;
		}else {
			return false; 
		}
	}
	public boolean sai() {
		if (capacidadeAtual > 0) {
			capacidadeAtual--;
			return true;
		}else {
			return false;
		}
	}
	public boolean sobe() {
		// consideração: o terreo conta como um andar
		// último: andarAtual == totalAndares - 1
		if (andarAtual < (totalAndares-1)) {
			andarAtual++; 
			return true;
		}else {
			return false;
		}
	}
	public boolean desce() {
		if (andarAtual >= totalAndares) {
			andarAtual--;
			return true;
		}else {
			return false; 
		}
	}
}
