package exerciciosOOP4;

public class Perfumaria extends Farmacia{
	
	boolean infantil;

	public Perfumaria(String nomeProduto, float preco, String idProduto, int quantidade, boolean receitaMedica, boolean infantil) {
		super(nomeProduto, preco, idProduto, quantidade, receitaMedica);
		this.infantil = infantil;
	}

	public boolean isInfantil() {
		return infantil;
	}

	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("Produto infantil: " + this.infantil);
	}

}
