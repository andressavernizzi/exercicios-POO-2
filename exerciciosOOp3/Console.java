package exerciciosOOp3;

public class Console extends Produto{
	
	int controle;

	public Console(String nomejogo, float preco, String tipo, String plataforma, String single,int controle) {
		super(nomejogo, preco, tipo, plataforma, single);
		this.controle = controle;
	}

	public int getControle() {
		return controle;
	}

	public void setControle(int controle) {
		this.controle = controle;
	}
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("Maximo de players: " + this.controle);
	}

}
