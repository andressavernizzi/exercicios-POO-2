package exerciciosOOp3;
//dados aleatorios para estudo
public class TestaGame {
	public static void main(String[] args) {
		
		Jogo jogo1 = new Jogo("Terraria",10.99f,"Aventura","Xbox","Multiplayer","16h");
		Jogo jogo2 = new Jogo("Resident Evil 15",252.99f,"Terror","Playstation 5","Singleplayer","8h");
		
		Console jogo3 = new Console("Diablo",12.00f,"RPG","Xbox","Singleplayer",1);
		Console jogo4 = new Console("Viva piñata",24.00f,"Corrida","Xbox 360","Multiplayer",4);
		
		jogo1.Visualizar();
		System.out.println("\n");
		jogo2.Visualizar();
		System.out.println("\n");
		jogo3.Visualizar();
		System.out.println("\n");
		jogo4.Visualizar();
	}

}
