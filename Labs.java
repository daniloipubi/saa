import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Labs{

	public static void main(String[] args){

	/*
		Voo voo1 = new Voo("17:40","PNZ","3450", "TAM");
		Voo voo2 = new Voo("18:20","PNZ","3080","TAM");


		Trilho trilho1 = new Trilho(voo1,voo2,"PR-MYA");

		trilho1.show();

	*/




	String celula[] = new String[10];
	int cont = 0;

	Voo vooChegada;

	try{

		File meuArquivoCVS = new File("/home/danilo/projetos/saa/voos.csv");
		Scanner leitor = new Scanner(meuArquivoCVS).useDelimiter("\\,");

		while(leitor.hasNext()){
		
			celula[cont] = leitor.next();
			cont++;
		
			if (cont == 10 ){

				if(celula[6].equals("SBRF")){
				
					vooChegada = new Voo(celula[8],celula[5],celula[1],celula[0]);
					
					System.out.println("=============================================== ");
					System.out.println("OPerador: " + vooChegada.getOpAereo());
					System.out.println("Numero do voo: " + vooChegada.getNumeroDoVoo());
					System.out.println("Origem " + vooChegada.getLocalidade());
					System.out.println("Horario: " + vooChegada.getHoraDoMov());
					System.out.println("=============================================== ");
					System.out.println("");
					
				}
			
				cont = 0;

			}//fim IF
		
		}//fim while

	

	}catch(FileNotFoundException e){}


	}//Fim do main()
	

}//Fim Labs()





