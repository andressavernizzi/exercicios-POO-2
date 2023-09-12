package exerciciosOOP6;
//dados aleatorios para estudo
public class TestaCurso {
	public static void main(String[] args) {
		
		CursoLivre pessoa1 = new CursoLivre("TI","Beatriz","205432","7am-1pm",0,true);
		CursoLivre pessoa2 = new CursoLivre("Rh","Pablo","174623","8am-12pm",0,true);
		Especializacao pessoa3 = new Especializacao("MBA em gestão de projetos","Pablo","342512","8am-12pm",325,true);
		Especializacao pessoa4 = new Especializacao("Psicopedagogia","Pablo","6634124","7am-1pm",127,false);
		
		pessoa1.Visualizar();
		System.out.println("\n");
		pessoa2.Visualizar();
		System.out.println("\n");
		pessoa3.Visualizar();
		System.out.println("\n");
		pessoa4.Visualizar();
	}
}
