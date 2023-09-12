package exerciciosOOp3;

public class Produto {

	String nomejogo;
	float preco;
	String tipo;
	String plataforma;
	String single;
	
	public Produto(String nomejogo, float preco, String tipo, String plataforma, String single) {
		super();
		this.nomejogo = nomejogo;
		this.preco = preco;
		this.tipo = tipo;
		this.plataforma = plataforma;
		this.single = single;
	}

	public String getNomejogo() {
		return nomejogo;
	}

	public void setNomejogo(String nomejogo) {
		this.nomejogo = nomejogo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getSingle() {
		return plataforma;
	}

	public void setSingle(String single) {
		this.single = single;
	}
	public void Visualizar() {
		System.out.println("nome- "+this.nomejogo);
		System.out.println("valor- "+this.preco);
		System.out.println("jogo de- "+this.tipo);
		System.out.println("plataforma- "+this.plataforma);
		System.out.println("singleplayer ou multiplayer- "+this.single);
	}
	
}
