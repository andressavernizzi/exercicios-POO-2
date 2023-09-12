package exerciciosOOP;

public class PessoaJuridica extends Cliente{
	
	String empresa;

	public PessoaJuridica(String nome, int idade, String datanasc, String cpf, String rg,String empresa) {
		super(nome, idade, datanasc, cpf, rg);
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("Nome da empresa: " + this.empresa);
	}

}
