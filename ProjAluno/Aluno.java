package aplicacao;

public class Aluno {
	private String nome;
	private int matricula;
	private float nota1;
	private float nota2;
	private float nota3;
	private float media;
	private String situacao;
	
	
	public void setNome(String novoNome) {
		nome = novoNome;
		
	}
	public String getNome() {
		return nome;
	}
	public void setMatricula(int novaMat) {
		matricula = novaMat;
	}
	public void setNotas(float n1, float n2, float n3) {
		nota1 = n1;
		nota2 = n2;
		nota3 = n2;
	}
	public float getNota1() {
		return nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public float getNota3() {
		return nota3;
	}
	public void calcularMedia () {
		media = ((nota1 * 4) + (nota2 * 5) + (nota3 * 6) / 15); 
		if (media < 3) {
			situacao ="Reprovado";
		} 
		if (media >= 7) {
			situacao ="Aprovado";
		} else {
			situacao ="Recuperação";
		}
	}
	public float getMedia() {
		return media;
	}
	public boolean buscarAluno(int matricula) {
		return (this.matricula == matricula);   
	}
	public String getSituacao () {
		return situacao;
	}
	public String alterarNota(int codNota, float valorNota) {
		return null;
	}
}
