package histoire;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain prof = new Humain("Prof","kombucha",54);
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		Commercant marco = new Commercant("Marco",100);
		marco.seFaireExtorquer();
		marco.recevoirArgent(15);
		marco.boire();
		
		Yakuza yaku = new Yakuza("Yaku le Noir", "whisky", 30, "Warsong");
		yaku.extorquer(marco);
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.donner(marco);
		
		roro.provoquer(yaku);
	}

}
