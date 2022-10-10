import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Bataille {
	public static void main(String[] args) {
		ArrayList<Carte> deck; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Joueur 1 : veuillez entrer votre nom :");
		String joueur1 = sc.nextLine();
		Joueur Joueur1 = new Joueur(joueur1);
		System.out.println("Joueur 2 : veuillez entrer votre nom :");
		String joueur2 = sc.nextLine();
		Joueur Joueur2 = new Joueur(joueur2);
		
		Collections.shuffle(Deck)
			
		while(Joueur1.getPaquet() && Joueur2.getPaquet()) {
		
			
		
			
			
//		System.out.println( + " a gagné la partie");
		}
	}

	private static void Deck() {
		// TODO Auto-generated method stub
		
	}
}
