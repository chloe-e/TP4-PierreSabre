package personnages;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String nom, String boissonFavorite, int argent, String seigneur) {
		super(nom, boissonFavorite, argent);
		this.seigneur = seigneur;
		System.out.println("\nOK\n");
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur " + this.seigneur + ".");
	}
	public void boire(String boisson) {
		this.parler("Tiens je vais prendre du " + boisson + ".");
	}
}
