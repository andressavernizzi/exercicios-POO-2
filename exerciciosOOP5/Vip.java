package exerciciosOOP5;

public class Vip extends Ingresso{
	
	boolean comida;

	public Vip(String nomeDoEvento, float valor, String assento, boolean vip, int quantidade,boolean comida) {
		super(nomeDoEvento, valor, assento, vip, quantidade);
		this.comida = comida;
	}

	public boolean isComida() {
		return comida;
	}

	public void setComida(boolean comida) {
		this.comida = comida;
	}
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("Vip com jantar incluso? " + this.comida);
	}

}
