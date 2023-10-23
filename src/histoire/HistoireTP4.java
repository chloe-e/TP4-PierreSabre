package histoire;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain Prof = new Humain("Prof","kombucha",54);
		Prof.acheter("une boisson", 12);
		Prof.boire();
		Prof.acheter("un jeu", 2);
		Prof.acheter("un kimono", 50);
		
		Commercant Marco = new Commercant("Marco",100);
		Marco.seFaireExtorquer();
		Marco.recevoirArgent(15);
		Marco.boire();
		
		Yakuza Yaku = new Yakuza("Yaku le Noir", "whisky", 30, "Warsong");
		Yaku.extorquer(Marco);
	}

}
