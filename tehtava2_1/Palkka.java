package tehtava2_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Palkka {

	public static void main(String[] args) {
		int palkka;
		double veroprosentti;
		int ika;
		double eläke;

		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Anna palkka: ");
		palkka = lukija.nextInt();
		
		System.out.print("Anna veroprosentti: ");
		veroprosentti = lukija.nextDouble();
		
		System.out.print("Anna ikä: ");
		ika = lukija.nextInt();
		
		double vero = (double) (palkka * veroprosentti) / 100.0;
		double vakuutus = (double) (palkka * 0.0115);
		
		DecimalFormat desi = new DecimalFormat("0.00");
		
		System.out.println("Bruttopalkka " + palkka);
		System.out.println("Veron osuus " + desi.format(vero));
		
		if (ika < 53) {
			eläke = (double) (palkka * 0.0555);
		}
		
		else {
			eläke = (double) (palkka * 0.0705);
		}
			
		System.out.println("Työeläkevakuutusmaksun osuus " + desi.format(eläke));
		System.out.println("Työttömyysvakuutuksen osuus " + desi.format(vakuutus));
		double netto = (double) (palkka - vero - vakuutus - eläke);
	
	
		System.out.println("Käteen jää " + desi.format(netto));
		
	}

}
