package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int nivTraitrise = 0;

	public Traitre(String nom, String boissonFavorite, int argent, String seigneur) {
		super(nom, boissonFavorite, argent, seigneur);
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon niveau de traîtrise est : " + this.nivTraitrise + ".");
	}
	
	public void ranconner(Commercant commercant) {
		if (this.nivTraitrise < 3) {
			int argentRenconner = commercant.getArgent()*1/5;
			commercant.perdreArgent(argentRenconner);
			this.gagnerArgent(argentRenconner);
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer !"
					+ "Donne-moi " + argentRenconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
			this.nivTraitrise++;
		}
		else {
			this.parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de "
					+ "me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if(this.nbConnaissance < 1) {
			this.parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}
		else {
			int don = this.getArgent() * 1/20;
			Random rand = new Random();
			int amiIndex = rand.nextInt(this.nbConnaissance);
			Humain ami = this.memoire[amiIndex];
			
			this.parler("Il faut absolument remonter ma côte de confiance. Je vais faire ami ami"
					+ " avec " + ami.getNom());
			this.parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			ami.parler("Merci " + this.getNom() + ". Vous êtes quelqu'un de bien.");
			this.perdreArgent(don);
			if (this.nivTraitrise > 0) {
				this.nivTraitrise--;
			}
		}
			
	}
}
