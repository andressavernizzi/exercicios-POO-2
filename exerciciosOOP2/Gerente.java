package exerciciosOOP2;

public class Gerente extends Funcionario{
	
	String area;

	public Gerente(String nome, int idade, String id, String cargo, String horariotrabalho,String area) {
		super(nome, idade, id, cargo, horariotrabalho);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("Area de gerente: " + this.area);
	}

}
