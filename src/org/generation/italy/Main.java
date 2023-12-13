package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

import org.generation.italy.model.AnimaleDomestico;
import org.generation.italy.model.Cane;
import org.generation.italy.model.Gatto;

public class Main {

	public static void main(String[] args) {
		
		String risposta;
		Scanner sc = new Scanner(System.in);
		HashMap<String,AnimaleDomestico> elenco_animali = new HashMap<String,AnimaleDomestico>();
		
		elenco_animali.put("Calico", new Gatto ("Calico", "Calico", true));
		elenco_animali.put("Tonelico", new Gatto ("Domestic Shorthair", "Tonelico", true));
		elenco_animali.put("Aulico", new Gatto ("Europeo", "Aulico", false));
		elenco_animali.put("Giuseppe", new Cane ("San Bernardo", "Giuseppe", true));
		elenco_animali.put("Merlino", new Cane ("Samoyedo", "Merlino", false));
		elenco_animali.put("Morgana", new Cane ("Husky", "Morgana", false));
		elenco_animali.put("Achille", new AnimaleDomestico ("Pesce Volante", "Achille"));
		
		for(String animale:elenco_animali.keySet()) {
			System.out.println(elenco_animali.get(animale).toString());
			
			System.out.println("Verso: " + elenco_animali.get(animale).faiVerso());
			System.out.println(elenco_animali.get(animale).mangia());
			System.out.println();
		}
		
		System.out.print("Inserisci il nome di un animale: ");
		risposta = sc.nextLine();
		
		if(elenco_animali.containsKey(risposta)) {
			AnimaleDomestico A = elenco_animali.get(risposta);
			
			if(A instanceof Cane) //se A è un cane
				System.out.println("Museruola: " + ((Cane) A).isMuseruolaObbligatoria());
			
			else if(A instanceof Gatto) //se A è un cane
				System.out.println("Eterocromia: " + ((Gatto) A).isEteroCromiaOcchi());
			System.out.println(A.faiVerso());
			System.out.println(A.mangia());
			
		}
		
		//AnimaleDomestico A1 = new AnimaleDomestico("Domestic Shorthair", "Tonelico");
		//System.out.println(A1.toString());
		//System.out.println(A1.faiVerso());
		//System.out.println(A1.mangia());

		//Cane C1 = new Cane("Beagle","Achille",false);
		//System.out.println(C1.toString());
		//System.out.println(C1.faiVerso());
		//System.out.println(C1.mangia());

		//Gatto G1 = new Gatto ("Calico", "Calico", true);
		//System.out.println(G1.toString());
		//System.out.println(G1.faiVerso());
		//System.out.println(G1.mangia());
		
	}

}
