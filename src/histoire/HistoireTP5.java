package histoire;
import personnages.Commercant;
import personnages.GrandMere;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		System.out.println("\nTest mémoire\n");
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);

		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		
		System.out.println("\nTest class traître\n");
		Samourai akimoto = new Samourai("Akimoto", "saké", 80, "Miyamoto");
		akimoto.boire("café");
		
		Traitre masako = new Traitre("Masako", "whisky", 100, "Miyamoto");
		
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		
		akimoto.faireConnaissanceAvec(masako);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		
		roro.faireConnaissanceAvec(masako);
		
		
		System.out.println("\nTest classe GrandMere\n");
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);
		
		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		
		grandMere.ragoter();	
		
	}

}
