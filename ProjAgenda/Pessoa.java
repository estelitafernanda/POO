package aplicacao;

public class Pessoa {
	private String nome;
	private String telefone; 
	private String email;
	
	public Pessoa (String nomeP, String telefoneP, String emailP) {
		this.nome = nomeP;
		this.telefone = telefoneP;
		this.email = emailP; 
	}
	
	public String getNome(){
		return nome; 
	}
	public String getTelefone(){
		return telefone; 
	}
	public String getEmail() {
		return email; 
	}
}
