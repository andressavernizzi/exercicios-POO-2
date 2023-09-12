package exerciciosOOP2;

public class Vendedor extends Funcionario{
	
	boolean metas;

	public Vendedor(String nome, int idade, String id, String cargo, String horariotrabalho,boolean metas) {
		super(nome, idade, id, cargo, horariotrabalho);
		this.metas = metas;
	}

	public boolean isMetas() {
		return metas;
	}

	public void setMetas(boolean metas) {
		this.metas = metas;
	}
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("As metas foram atingidas? " + this.metas);
	}

}
