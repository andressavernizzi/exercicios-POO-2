package exerciciosOOP;
//dados aleatorios para estudo
public class TestaCliente {
	public static void main(String[] args) {
		PessoaFisica Sarah = new PessoaFisica("Sarah",41,"10/06/1992","593.591.295-60","19.233.412/5","F");
		PessoaFisica Levi = new PessoaFisica("Levi",24,"14/01/2002","895.234.235-23","24.563.875/7","M");
		
		PessoaJuridica Marco = new PessoaJuridica("Marco",52,"23/05/1840","123.345.234-11","13.423.415/6","Sucos Naturais");
		PessoaJuridica Suzan = new PessoaJuridica("Suzan",22,"29/02/2004","998.654.765-34","32.245.634/7","Tsuru");
		
		Sarah.Visualizar();
		System.out.println("\n");
		Levi.Visualizar();
		System.out.println("\n");
		Marco.Visualizar();
		System.out.println("\n");
		Suzan.Visualizar();
	}

}
