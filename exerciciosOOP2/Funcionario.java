package exerciciosOOP2;

public class Funcionario {
	
	String nome;
	int idade;
	String id;
	String cargo;
	String horariotrabalho;
	
	public Funcionario(String nome, int idade, String id, String cargo, String horariotrabalho) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.id = id;
		this.cargo = cargo;
		this.horariotrabalho = horariotrabalho;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getHorariotrabalho() {
		return horariotrabalho;
	}

	public void setHorariotrabalho(String horariotrabalho) {
		this.horariotrabalho = horariotrabalho;
	}
	
	public void Visualizar() {
		System.out.println("nome- "+this.nome);
		System.out.println("idade- "+this.idade);
		System.out.println("id funcionario- "+this.id);
		System.out.println("cargo- "+this.cargo);
		System.out.println("horario de trabalho- "+this.horariotrabalho);
	}
}
