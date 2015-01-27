class Voo{

	private String horaDeMov;
	private String localidade;
	private String numeroDoVoo;
	private String opAereo;

	private String aeronave;

	public Voo(String hora,String local, String numero, String nomeCia){

		setHoraDoMov(hora);
		setLocalidade(local);		
		setNumeroDoVoo(numero);
		setOpAereo(nomeCia);
	}


	// Atualizar hora do voo
	public void setHoraDoMov(String hora){

		this.horaDeMov = hora;
	}



	// Atualizar a localidade de origem do voo
	public void setLocalidade(String local){

		this.localidade = local;
	}



	// Atualizar o numero do voo
	public void setNumeroDoVoo(String num){

		this.numeroDoVoo = num;
	}


	// Atualizar nome do operador aereo
	public void setOpAereo(String nome){

		this.opAereo = nome;
	}

	
	public String getHoraDoMov(){
		return (horaDeMov);

	}


	public String getNumeroDoVoo(){
		return (numeroDoVoo);
	}


	public String getLocalidade(){
		return (localidade);
	}


	public String getOpAereo(){
		return (opAereo);
	}


		

} // Fim da classe Voo

