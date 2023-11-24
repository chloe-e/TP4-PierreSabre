package personnages;

import java.util.Random;

public class GrandMere extends Humain{
	private static final int nbMaxConnaissances = 5;

	public GrandMere(String nom, int argent) {
		super(nom, "tisane" , argent);
	}
	
	@Override
	protected void memoriser(Humain humain) {
		int addInd = this.getAddInd();
		
		if(this.nbConnaissance < GrandMere.nbMaxConnaissances) {
			this.memoire[addInd] = humain;
			this.nbConnaissance++;
			this.setAddInd((addInd + 1) % GrandMere.nbMaxConnaissances);
		}
		else {
			this.parler("Oh ma tête ! Je ne peux plus retenir"
					+ " le nom d'une personne supplémentaire !");
		}
	}
	
	private String humainHasard() {
		TypeHumain[] types = TypeHumain.values();
		Random rand = new Random();
		String type = types[rand.nextInt(types.length)].toString();
		return type;
	}
	
	public void ragoter() {
		Humain current;
		for(int i = 0; i<this.nbConnaissance; i++) {
			current = this.memoire[i];

			if (current instanceof Traitre){
				parler("Je crois que " + current.getNom() + 
						" est un traître. Petit chenapan !");
			}
			else {
				parler("Je crois que " + current.getNom() + " est un "
					+ humainHasard() + ".");
			}
		}
	}
	
	private enum TypeHumain {
		HABITANT("habitant"), COMMERCANT("commerçant"), RONIN("ronin"),
		SAMOURAI("samouraï");
		
		private String nom;
		
		private TypeHumain(String nom) {
			this.nom = nom;
		}
		
		public String toString() {
			return nom;
		}
		
	}
}
