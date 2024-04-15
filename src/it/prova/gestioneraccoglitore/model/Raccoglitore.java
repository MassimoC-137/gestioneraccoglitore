package it.prova.gestioneraccoglitore.model;

public class Raccoglitore {

	private String colore; 
	private int spessore; 
	private Foglio[] fogli; 
	
	public Raccoglitore() {
		
	}
	
	public Raccoglitore(String colore, int spessore, Foglio[] fogli) {
		
		this.colore = colore; 
		this.spessore = spessore; 
		this.fogli = fogli; 
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore; 
	}
	
	public int getSpessore() {
		return spessore; 
	}
	
	public void setSpessore(int spessore) {
		this.spessore = spessore; 
	}
	
	public Foglio[] getFogli() {
		return fogli; 
	}
	
	public void setFogli(Foglio[] fogli) {
		this.fogli = fogli; 
	}
	
	public void addToFogli(Foglio foglioDaAggiungere) {
		
		Foglio[] temp = new Foglio[fogli.length + 1]; 
		for (int i = 0; i < this.fogli.length; i++) {
			temp[i] = fogli[i];
		}
		temp[temp.length -1] = foglioDaAggiungere; 
		this.fogli = temp; 
		
		for (int i = 0; i < temp.length; i ++) {
			System.out.println(temp[i].getTipologia());
		}
	}
	
	public void removeFromFogli(int indexToRemove) {
		
		int newIndex = 0; 
		Foglio[] temp = new Foglio[this.fogli.length -1]; 
		for (int i = 0; i < this.fogli.length; i++) {
			if (i != indexToRemove) {
				temp[newIndex] = this.fogli[i];
				newIndex ++;
			}
		}
		for (int i = 0; i < temp.length; i ++) {
			System.out.println(temp[i].getTipologia());
		}
	}
	
	
}













