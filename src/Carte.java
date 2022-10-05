
public class Carte {
	private int[] valeurs = new int[14];
	private String[] couleurs = {"Coeur","carreau","trèfle","pique"};
	private int valeur;
	private String couleur;
	
	public Carte(int[] valeur , String[] couleur) {
		this.valeurs = valeur;
		this.couleurs = couleur;
	}
	
	public int getValeur() {	
		return valeur;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public String toString(){
		return valeur + " de "+ couleur;
		}
	
}
