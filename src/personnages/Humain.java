package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected Humain[] memoire = new Humain[NBMAXCONNAISANCES];
	protected int nbConnaissance = 0;
	private int addInd = 0;
	private static final int NBMAXCONNAISANCES = 30;

	public Humain(String nom, String boissonFavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		this.direBonjour();
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void setAddInd(int addInd) {
		this.addInd = addInd;
	}

	public int getAddInd() {
		return addInd;
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
		this.parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFavorite + ".");
	}
	
	private void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}

	public void boire() {
		this.parler("Mmmh, un bon verre de " + this.boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix < this.argent) {
			this.perdreArgent(prix);
			this.parler("J'ai " + this.argent + " sous en poche, je vais pouvoir m'acheter " + bien + " � " + prix
					+ " sous.");
		} else {
			this.parler("Je n'ai plus que " + this.argent + " sous en poche, je ne peux pas m'acheter " + bien + " � "
					+ prix + " sous.");
		}
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		this.direBonjour();
		humain.repondre(this);
		this.memoriser(humain);
	}
	
	protected void memoriser(Humain humain) {
		this.memoire[this.addInd] = humain;
		if(this.nbConnaissance < Humain.NBMAXCONNAISANCES) {
			this.nbConnaissance++;
		}
		this.addInd = (this.addInd + 1) % Humain.NBMAXCONNAISANCES;
	}
	
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont :");
		for(int i=0; i<this.nbConnaissance; i++) {
			System.out.print(this.memoire[i].getNom() + 
					(i==this.nbConnaissance-1?"\n":","));
		}
	}
}
