package org.generation.italy.model;

public class Gatto extends AnimaleDomestico {
	
	boolean eteroCromiaOcchi;

	public Gatto(String razza, String nome, boolean eteroCromiaOcchi) {
		super(razza, nome);
		this.eteroCromiaOcchi = eteroCromiaOcchi;
	}
	
	public void FaiFusa() {
		System.out.println("prrprrprr");
	}
	
	@Override
	public String faiVerso() {
		return "miao miao";
	}

	@Override
	public String mangia() {
		return "Mangio crocchette di pesce";
	}

	@Override
	public String toString() {		//sovrascrivo il toString() di Object
		return "Gatto - Razza: " + razza + ", Nome: " + nome + ", Eterocromia: "+ eteroCromiaOcchi;
	}

	public boolean isEteroCromiaOcchi() {
		return eteroCromiaOcchi;
	}
		
	
	

}
