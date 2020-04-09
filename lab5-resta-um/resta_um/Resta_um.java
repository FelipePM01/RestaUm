package resta_um;

public class Resta_um {

	public static void main(String[] args) {
		Tabuleiro tabuleiro=new Tabuleiro();
		CSVReader csv=new CSVReader();
		csv.setDataSource("C:\\Users\\fpach\\Downloads\\comandos1.csv");
		String comandos[]=csv.requestCommands();
		System.out.println("Tabuleiro inicial:");
		tabuleiro.imprimir();
		
		for(int i=0;i<comandos.length;i++) {
			tabuleiro.mover(comandos[i].split(":")[0],comandos[i].split(":")[1]);
			System.out.println("Source: "+comandos[i].split(":")[0]);
			System.out.println("Target: "+comandos[i].split(":")[1]);
			tabuleiro.imprimir();
		}
	}

}
