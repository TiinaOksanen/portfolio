package tehtava6_3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Sairaspaivaraha {
	
	
	public Sairaspaivaraha() {
		DecimalFormat desi = new DecimalFormat("0.00");
		double tulot = kysyVuositulo();
		double paivaraha = laskePaivaraha(tulot);
		System.out.print("Vuosituloilla " + desi.format(tulot) + " sairaspäiväraha on " + desi.format(paivaraha) + " euroa/päivä.");
	}

	public static double kysyVuositulo() {
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Anna vuositulosi: ");
		return lukija.nextDouble();
	}
	
	private double laskePaivaraha(double tulot) {
		double raha;
		
		if (tulot <= 1399) {
			raha = 0.0;
		
		}
		
		else if (tulot > 1399 && tulot <= 36419) {
			raha = (double) 0.7 * tulot / 300.0;
			
		}
		
		else if (tulot >= 36420 && tulot <= 56032) {
			raha = (double) 84.98 + 0.4 * (tulot - 36419) / 300.0;
			
		}
		
		else {
			raha = (double) 111.13 + 0.25 * (tulot - 56032) / 300.0;
			
		}
		return raha;
		
	}
	
	public static void main(String[] args) {
		new Sairaspaivaraha();
	

	}

}