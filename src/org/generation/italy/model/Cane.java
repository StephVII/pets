package org.generation.italy.model;

public class Cane extends AnimaleDomestico {
	
	boolean museruolaObbligatoria;

	public Cane(String razza, String nome, boolean museruolaObbligatoria) {
		super(razza, nome);
		this.museruolaObbligatoria = museruolaObbligatoria;
	}
	
@Override
public String faiVerso() {
	return "bau bau";
}

@Override
public String mangia() {
	return "Mangio crocchette con carne";
}

@Override
public String toString() {		//sovrascrivo il toString() di Object
	return "Cane - Razza: " + razza + ", Nome: " + nome + ", Museruola: "+ museruolaObbligatoria;
}

public boolean isMuseruolaObbligatoria() {
	return museruolaObbligatoria;
}	


}
