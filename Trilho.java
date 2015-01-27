class Trilho{


	private Voo vooDeChegada;
	private Voo vooDePartida;

	private String prefixoAero;



	public Trilho(Voo voo1,Voo voo2, String prefixo){

		this.vooDeChegada = voo1;
		this.vooDePartida = voo2;
		this.prefixoAero = prefixo;

	}


	
	void show(){

		System.out.println("======================================= ");
		System.out.println("|       Informacoes do Trilho         | ");
		System.out.println("======================================= ");
		System.out.println("Nome do op aereo: " + vooDeChegada.getOpAereo());
		System.out.println("Numero voo chegada: " + vooDeChegada.getNumeroDoVoo());
		System.out.println("Hora de Chegada " + vooDeChegada.getHoraDoMov());
		System.out.println("Numero voo partida " + vooDePartida.getNumeroDoVoo());
		System.out.println("Hora da Partida " + vooDePartida.getHoraDoMov());
		System.out.println("======================================= ");
		System.out.println("");
	}


}
