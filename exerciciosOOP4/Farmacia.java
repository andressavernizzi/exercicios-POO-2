package exerciciosOOP4;
//dados aleatorios para estudo
public class Farmacia {
	
	String nomeProduto;
	float preco;
	String idProduto;
	int quantidade;
	boolean receitaMedica;
	
	public Farmacia(String nomeProduto, float preco, String idProduto, int quantidade, boolean receitaMedica) {
		super();
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.receitaMedica = receitaMedica;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isReceitaMedica() {
		return receitaMedica;
	}

	public void setReceitaMedica(boolean receitaMedica) {
		this.receitaMedica = receitaMedica;
	}
	
	public void Visualizar() {
		System.out.println("nome do produto- "+this.nomeProduto);
		System.out.println("preço- "+this.preco);
		System.out.println("id do produto- "+this.idProduto);
		System.out.println("quantidade na caixa- "+this.quantidade);
		System.out.println("precisa de receita medica- "+this.receitaMedica);
	}

}
