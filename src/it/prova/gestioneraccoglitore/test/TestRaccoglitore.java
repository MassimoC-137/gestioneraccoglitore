package it.prova.gestioneraccoglitore.test;

import it.prova.gestioneraccoglitore.model.Foglio;
import it.prova.gestioneraccoglitore.model.Raccoglitore;

public class TestRaccoglitore {

	public static void main(String[] args) {

		Foglio paper1 = new Foglio("ottima", "spessa"); 
		Foglio paper2 = new Foglio("buona", "meno spessa"); 
		Foglio paper3 = new Foglio("ottima", "spessa");  
		Foglio paper4 = new Foglio("decente", "velina");  
		Foglio paper5 = new Foglio("scarsa", "igenica");
		
		Foglio[] arrayFogli1 = {paper1, paper3};
		Foglio[] arrayFogli2 = {paper1, paper3, paper5};
		
		
		Raccoglitore rac1 = new Raccoglitore("blu", 2, arrayFogli1); 
		Raccoglitore rac2 = new Raccoglitore("rossi", 1, arrayFogli2); 
		Raccoglitore rac3 = new Raccoglitore(); 
		Raccoglitore rac4 = new Raccoglitore(); 
		Raccoglitore rac5 = new Raccoglitore(); 

//		rac1.addToFogli(paper2);
//		
		rac2.removeFromFogli(2);
		
		
	}

}
