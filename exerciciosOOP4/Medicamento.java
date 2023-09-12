package exerciciosOOP4;

public class Medicamento extends Farmacia{
	
	boolean tarja;

	public Medicamento(String nomeProduto, float preco, String idProduto, int quantidade, boolean receitaMedica,boolean tarja) {
		super(nomeProduto, preco, idProduto, quantidade, receitaMedica);
		this.tarja = tarja;
	}

	public boolean isTarja() {
		return tarja;
	}

	public void setTarja(boolean tarja) {
		this.tarja = tarja;
	}
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("Tarja preta? " + this.tarja);
	}
}
