import java.util.ArrayList;

public class Joueur{
	private String nom; 
	private int points;
	private ArrayList<Carte> deck; 
	
	public Joueur(String nom){
		this.nom = nom;
		this.points = 0;
		this.deck = new ArrayList<Carte>;
		}
	
	public int compteur() {
		return this.points; 
	}
	     
	public boolean getPaquet() {
		Joueur a = new Joueur("a");
		boolean b = false;
		if(this.deck.size() >0) {
			b = true;
		}
		return b;
		//Verifie le nombre de carte dans la main du jouer
	}
	
	public void jouer() {
		//Le joueur joue 1 carte
	}
	
	public void ramasser() {
		//Le joueur gagne et ajoute une carte à sa main
	}
}

