package aplicacao;

public class Pedido {
	private int codigo = 0;
	private int quantidade;
    private String endereco;
    private String hora;
    private double valor;
    private String numeroCartao;
    private boolean confirmado;
    private boolean entregue;
	
	public Pedido (String endereco, String hora) {
		codigo++; 
		this.endereco = endereco;
		this.hora = hora; 
		this.confirmado = false;
		this.entregue = false;
	}
	public String getEndereco () {
		return endereco; 
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco; 
	}
	public String getHora() {
		return hora; 
	}
	public void setHora (String hora) {
		this.hora = hora;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade (int quantidade) {
		this.quantidade = quantidade;
		calcularValor();
	}
	public double getValor() {
		return valor;
	}
	private void calcularValor() {
		valor = quantidade * 60.0; 
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao; 
	}
	public boolean isConfirmado() {
		return confirmado; 
	}
	public void setConfirmado(boolean confirmado){
		this.confirmado = confirmado; 
	}
	public boolean isEntregue() {
		return entregue; 
	}
	public void setEntregue (boolean entregue) {
		this.entregue = entregue; 
	}
	public int getCodigo() {
		return codigo; 
	}
}
