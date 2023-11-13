package personnages;

public class Ronin extends Humain{
	int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = Math.abs(10*this.getArgent()/100);
		if (don>0) {
			this.parler(beneficiaire.getNom() + ", prend ces " + don + " sous.");
			beneficiaire.recevoirArgent(don);
			this.perdreArgent(don);
		}else {
			parler("Désolé je ne peux rien te donner...");
		}
	}
	public void provoquer(Yakuza adversaire) {
		int force = this.honneur * 2;
		if(force >= adversaire.getReputation()) {
			this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce "
					+ "que tu as fait à ce pauvre marchand!");
			this.parler("Je t’ai eu petit yakusa!");
			this.gagnerArgent(adversaire.perdre());
			this.honneur+=1;
		}else {
			if(honneur > 0) {
				this.honneur-=1;
			}
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup");
			adversaire.gagner(this.getArgent());
			this.perdreArgent(this.getArgent());
		}
	}
}

