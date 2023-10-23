package histoire;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain Prof = new Humain("Prof","kombucha",54);
		Prof.acheter("une boisson", 12);
		Prof.boire();
		Prof.acheter("un jeu", 2);
		Prof.acheter("un kimono", 50);
	}

}
