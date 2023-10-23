package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, un faible marchand...");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		this.gagnerArgent(victime.getArgent());
		this.parler("J'ai pris " + victime.seFaireExtorquer() + " sous à " + victime.getNom()
		+ " ce qui me fait " + this.getArgent() + " sous dans la poche. Hihi !");
	}
	
}
