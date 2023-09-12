package exerciciosOOP5;
//dados aleatorios para estudo
public class TestaIngresso {
	public static void main(String[] args) {
		
		Vip pessoa1 = new Vip("Metallica",130.50f,"p-52",true,1,true);
		Vip pessoa2 = new Vip("BTS",245.80f,"q-16/q-17",false,2,false);
		MeiaEntrada pessoa3 = new MeiaEntrada("Ghost",45.50f,"a-23",true,1,true);
		MeiaEntrada pessoa4 = new MeiaEntrada("Mamamia",123.80f,"t-22/t-21",false,2,false);
		
		pessoa1.Visualizar();
		System.out.println("\n");
		pessoa2.Visualizar();
		System.out.println("\n");
		pessoa3.Visualizar();
		System.out.println("\n");
		pessoa4.Visualizar();
	}

}
