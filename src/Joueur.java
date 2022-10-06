

public class Joueur{
	private String nom; 
	private int points;
	private Carte[] deck; 
	
	public Joueur(String nom){
		this.nom = nom;
		this.points = 0;
		this.deck;
		}
	
	public int compteur() {
		return this.points; 
	}
	
	
	public bool getPaquet() {
		Joueur a = new Joueur("a");
		if(this.deck.length >0)
		return true;
		//Verifie le nombre de carte dans la main du jouer
	}
	
	public void jouer() {
		//Le joueur joue 1 carte
	}
	
	public void ramasser() {
		//Le joueur gagne et ajoute une carte à sa main
	}
}

