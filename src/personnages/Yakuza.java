package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	public int getReputation() {
		return this.reputation;
	}
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, un faible marchand...");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		this.gagnerArgent(victime.getArgent());
		this.parler("J'ai pris " + victime.seFaireExtorquer() + " sous à " + victime.getNom()
		+ " ce qui me fait " + this.getArgent() + " sous dans la poche. Hihi !");
	}
	public int perdre() {
		int sommePerdue = this.getArgent();
		this.perdreArgent(this.getArgent());
		if (this.reputation>0) {
			this.reputation -=1;
		}
		parler("J’ai perdu mon duel et mes " + sommePerdue + " sous, snif... "
				+ "J'ai déshonoré le clan de " + this.clan);
		return sommePerdue;
	}
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation += 1;

		parler("Ce ronin pensait vraiment battre " + this.getNom()
				+ " du clan de Warsong ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
}
