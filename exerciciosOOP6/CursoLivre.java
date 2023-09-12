package exerciciosOOP6;

public class CursoLivre extends Curso{
	
	boolean certificado;

	public CursoLivre(String curso, String nomeAluno, String rA, String horario, float valorMensal,boolean certificado) {
		super(curso, nomeAluno, rA, horario, valorMensal);
		this.certificado = certificado;
	}

	public boolean isCertificado() {
		return certificado;
	}

	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}
	@Override
	public void Visualizar() {
		
		super.Visualizar();
		System.out.println("O curso dá certificado? " + this.certificado);
	}

}
