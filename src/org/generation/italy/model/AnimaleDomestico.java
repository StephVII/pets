package org.generation.italy.model;

public class AnimaleDomestico {
	
	protected String razza, nome;
	
//Costruttore
	public AnimaleDomestico(String razza, String nome) {
		super();
		this.razza = razza;
		this.nome = nome;
	}

//Metodi della classe
	public String faiVerso() {
		return "emetto un verso.";
	}
	
	public String mangia() {
		return "mangio del cibo.";
	}
	
	public String mangia(String cibo) {  //overload, lo stesso metodo mangia() ha due funzioni diverse
		return "mangio "+cibo;
	}

	@Override
	public String toString() {		//sovrascrivo il toString() di Object
		return "Animale Domestico - sRazza: " + razza + ", Nome: " + nome;
	}

	
//Getters e Setters
	public String getRazza() {
		return razza;
	}


	public String getNome() {
		return nome;
	}
	
	
	
	
	

}
