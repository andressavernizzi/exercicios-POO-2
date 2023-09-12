package exerciciosOOP5;

public class Ingresso {
	
	String nomeDoEvento;
	float valor;
	String assento;
	boolean vip;
	int quantidade;
	public Ingresso(String nomeDoEvento, float valor, String assento, boolean vip, int quantidade) {
		super();
		this.nomeDoEvento = nomeDoEvento;
		this.valor = valor;
		this.assento = assento;
		this.vip = vip;
		this.quantidade = quantidade;
	}
	public String getNomeDoEvento() {
		return nomeDoEvento;
	}
	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getAssento() {
		return assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void Visualizar() {
		System.out.println("nome do evento- "+this.nomeDoEvento);
		System.out.println("preço- "+this.valor);
		System.out.println("assento- "+this.assento);
		System.out.println("vip- "+this.vip);
		System.out.println("quantidade de ingressos- "+this.quantidade);
	}

}
