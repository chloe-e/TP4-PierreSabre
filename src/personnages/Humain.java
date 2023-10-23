package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		this.parler("Bonjour, je m'appelle " + this.nom + " et j'aime boire du " 
				+ this.boissonFavorite + ".");
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	public void parler(String texte) {
		System.out.println((this.nom) + " - " + texte);
	}
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	public void perdreArgent(int perte) {
		this.argent -= perte;
	}
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du "
				+ this.boissonFavorite);
	}
	public void boire() {
		this.parler("Mmmh, un bon verre de " + this.boissonFavorite + " ! GLOUPS !");
	}
	public void acheter(String bien,int prix) {
		if(prix<this.argent) {
			this.perdreArgent(prix);
			this.parler("J'ai " + this.argent + " sous en poche, je vais pouvoir m'acheter "
					+ bien + " à " + prix + " sous.");
		}else {
			this.parler("Je n'ai plus que " + this.argent + " sous en poche, je ne peux pas m'acheter "
					+ bien + " à " + prix + " sous.");
		}	
	}
}
