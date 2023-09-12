package exerciciosOOP;

public class Cliente {
	
	String nome;
	int idade;
	String datanasc;
	String cpf;
	String rg;
	
	public Cliente(String nome, int idade, String datanasc, String cpf, String rg) {
		this.nome = nome;
		this.idade = idade;
		this.datanasc = datanasc;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void Visualizar() {
		System.out.println("nome- "+this.nome);
		System.out.println("idade- "+this.idade);
		System.out.println("data de nascimento- "+this.datanasc);
		System.out.println("cpf- "+this.cpf);
		System.out.println("rg- "+this.rg);
	}
	
	

}
