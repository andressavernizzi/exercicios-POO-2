package exerciciosOOP;

public class PessoaFisica extends Cliente {
	
	private String sex;
	
	public PessoaFisica(String nome,int idade,String datanasc,String cpf,String rg,String sex) {
		super(nome,idade,datanasc,cpf,rg);
		this.sex = sex;
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("Sexo: " + this.sex);
	}

}
