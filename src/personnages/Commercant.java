package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé" , argent);
	}
	
	public int seFaireExtorquer() {
		int sommePerdue = this.getArgent();
		this.perdreArgent(this.getArgent());
		this.parler("J'ai tout perdu ! Le monde est trop injuste...");
		return sommePerdue;
	}
	public void recevoirArgent(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent + " ! Je te remercie, généreux donateur !");
	}
}
