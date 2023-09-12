package exerciciosOOP6;

public class Curso {
	
	String curso;
	String nomeAluno;
	String ra;
	String horario;
	float valorMensal;
	public Curso(String curso, String nomeAluno, String rA, String horario, float valorMensal) {
		super();
		this.curso = curso;
		this.nomeAluno = nomeAluno;
		ra = rA;
		this.horario = horario;
		this.valorMensal = valorMensal;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getRA() {
		return ra;
	}
	public void setRA(String rA) {
		ra = rA;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public float getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(float valorMensal) {
		this.valorMensal = valorMensal;
	}
	
	public void Visualizar() {
		System.out.println("curso- "+this.curso);
		System.out.println("aluno(a)- "+this.nomeAluno);
		System.out.println("RA- "+this.ra);
		System.out.println("horario do curso- "+this.horario);
		System.out.println("valor mensal- "+this.valorMensal);
	}

}
