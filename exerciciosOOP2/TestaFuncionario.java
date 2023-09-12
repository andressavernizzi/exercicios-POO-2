package exerciciosOOP2;
//dados aleatorios para estudo
public class TestaFuncionario {
	
	public static void main(String[] args) {
		Funcionario Sarah = new Funcionario("Sarah",41,"112","gerente","7am-5pm");
		Funcionario Levi = new Funcionario("Levi",24,"245","caixa","7am-5pm");
		
		Gerente Suzan = new Gerente("Suzan",50,"109","gerente","1pm-9pm","gerente de vendas");
		Gerente Pedro = new Gerente("Pedro",33,"542","gerente","1pm-9pm","gerente de comunicação");
		
		Vendedor Matias = new Vendedor("Pedro",21,"654","Vendedor","1pm-9pm",true);
		Vendedor John = new Vendedor("John",18,"785","Vendedor","1pm-9pm",false);
		
		Sarah.Visualizar();
		System.out.println("\n");
		Levi.Visualizar();
		System.out.println("\n");
		Suzan.Visualizar();
		System.out.println("\n");
		Pedro.Visualizar();
		System.out.println("\n");
		Matias.Visualizar();
		System.out.println("\n");
		John.Visualizar();
	}
	

}
