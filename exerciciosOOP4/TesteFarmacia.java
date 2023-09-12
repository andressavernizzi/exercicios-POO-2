package exerciciosOOP4;
//dados aleatorios para estudo
public class TesteFarmacia {
	public static void main(String[] args) {
		
		Medicamento tramal = new Medicamento("Tramal",72.90f,"193",20,true,true);
		Medicamento epocler = new Medicamento("Epocler",2.90f,"57",1,false,false);
		
		Perfumaria escova = new Perfumaria("Escova",10.00f,"12",1,false,false);
		Perfumaria shampoo = new Perfumaria("Shampoo abelhinha",15.00f,"23",1,false,true);
		
		tramal.Visualizar();
		System.out.println("\n");
		epocler.Visualizar();
		System.out.println("\n");
		escova.Visualizar();
		System.out.println("\n");
		shampoo.Visualizar();
	}

}
