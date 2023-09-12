package exerciciosOOp3;

public class Jogo extends Produto{
	
	String tempo;

	public Jogo(String nomejogo, float preco, String tipo, String plataforma, String single,String tempo) {
		super(nomejogo, preco, tipo, plataforma, single);
		this.tempo = tempo;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("Tempo médio de jogo: " + this.tempo);
	}

}
