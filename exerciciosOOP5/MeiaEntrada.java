package exerciciosOOP5;

public class MeiaEntrada extends Ingresso{
	
	boolean meia;

	public MeiaEntrada(String nomeDoEvento, float valor, String assento, boolean vip, int quantidade,boolean meia) {
		super(nomeDoEvento, valor, assento, vip, quantidade);
		this.meia = meia;
	}

	public boolean isMeia() {
		return meia;
	}

	public void setMeia(boolean meia) {
		this.meia = meia;
	}
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("Ingresso meia entrada? " + this.meia);
	}

}
