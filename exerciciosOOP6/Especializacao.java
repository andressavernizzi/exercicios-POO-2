package exerciciosOOP6;

public class Especializacao extends Curso{
	
	boolean mba;

	public Especializacao(String curso, String nomeAluno, String rA, String horario, float valorMensal,boolean mba) {
		super(curso, nomeAluno, rA, horario, valorMensal);
		this.mba = mba;
	}

	public boolean isMba() {
		return mba;
	}

	public void setMba(boolean mba) {
		this.mba = mba;
	}
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("É MBA? " + this.mba);
	}

}
