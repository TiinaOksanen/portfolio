package tehtava2_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Palkka {

	public static void main(String[] args) {
		int palkka;
		double veroprosentti;
		int ika;
		double el�ke;

		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Anna palkka: ");
		palkka = lukija.nextInt();
		
		System.out.print("Anna veroprosentti: ");
		veroprosentti = lukija.nextDouble();
		
		System.out.print("Anna ik�: ");
		ika = lukija.nextInt();
		
		double vero = (double) (palkka * veroprosentti) / 100.0;
		double vakuutus = (double) (palkka * 0.0115);
		
		DecimalFormat desi = new DecimalFormat("0.00");
		
		System.out.println("Bruttopalkka " + palkka);
		System.out.println("Veron osuus " + desi.format(vero));
		
		if (ika < 53) {
			el�ke = (double) (palkka * 0.0555);
		}
		
		else {
			el�ke = (double) (palkka * 0.0705);
		}
			
		System.out.println("Ty�el�kevakuutusmaksun osuus " + desi.format(el�ke));
		System.out.println("Ty�tt�myysvakuutuksen osuus " + desi.format(vakuutus));
		double netto = (double) (palkka - vero - vakuutus - el�ke);
	
	
		System.out.println("K�teen j�� " + desi.format(netto));
		
	}

}
