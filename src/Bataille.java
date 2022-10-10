import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bataille {
	public static void main(String[] args) {
		
		Joueur Joueur1 = new Joueur("Salim");
		
		Joueur Joueur2 = new Joueur("Anissa");
		
		public static ArrayList<Carte> Deck() {
	        ArrayList<Carte> cartes = new ArrayList<>();
	        for (int i = 2; i <= 14; i++) {
	            for (int j = 1; j <= 4; j++) {
	                cartes.add(new Carte(i, j));
	            }
	        }
			return cartes; 
		}
		
		Collections.shuffle(Deck)
		
		Deck()
			
		while(Joueur1.getPaquet() && Joueur2.getPaquet()) {
		
			
		
			
			
//		System.out.println( + " a gagné la partie");
		}
	}

	private static void Deck() {
		// TODO Auto-generated method stub
		
	}
}
