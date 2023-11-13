package personnages;

public class Traitre extends Samourai {
	private int nivTraitrise = 0;

	public Traitre(String nom, String boissonFavorite, int argent, String seigneur) {
		super(nom, boissonFavorite, argent, seigneur);
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon niveau de tra�trise est : " + this.nivTraitrise + ".");
	}
	
	public void ranconner(Commercant commercant) {
		if (this.nivTraitrise < 3) {
			int argentRenconner = commercant.getArgent()*2/10;
			commercant.perdreArgent(argentRenconner);
			this.gagnerArgent(argentRenconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer !"
					+ "Donne-moi 2 sous ou gare � toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		}
		else {
			parler("Mince je ne peux plus ran�onner personne sinon un samoura� risque de "
					+ "me d�masquer !");
		}
	}
	
//	public void faireLeGentil() {
//		if(this.nbConnaissance < 1) {
//			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.")
//		}
//		else {
//			int
//		}
//			
//	}
}
