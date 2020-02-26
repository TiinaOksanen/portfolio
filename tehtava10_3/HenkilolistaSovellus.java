package tehtava10_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class HenkilolistaSovellus {
	private List<Henkilo> henkilot = new ArrayList<Henkilo>();
	DecimalFormat desi = new DecimalFormat("0.00"); 
	
	private Henkilo hlo;
	
	
	private void lisaaHenkilo() {
		Scanner lukija = new Scanner(System.in);
		Henkilo hlo = new Henkilo();
		
		System.out.print("Anna nimi: ");
		hlo.setNimi(lukija.nextLine());
		
		System.out.print("Anna osoite: ");
		hlo.setOsoite(lukija.nextLine());
		
		System.out.print("Anna pituus: ");
		hlo.setPituus(lukija.nextDouble());
		
		System.out.print("Anna paino: ");
		hlo.setPaino(lukija.nextInt());
		
		henkilot.add(hlo);
	}
	private void naytaTiedot() {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna näytettävän henkilön nimi: ");
		String nimi = lukija.nextLine();
		
		Henkilo tieto = etsiHenkilo(nimi);
		
		if (tieto != null) {
			System.out.println(" ");
			System.out.println("Nimi: " + tieto.getNimi());
			System.out.println("Osoite: " + tieto.getOsoite());
			System.out.println("Pituus: " + desi.format(tieto.getPituus()));
			System.out.println("Painoindeksi: " + desi.format(tieto.getPainoindeksi()));
		}
		else {
			System.out.print("Henkilöä ei ole");
			System.out.print(" ");

		}

	}
	
	private void muutaTiedot() {
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Anna perustietoja muutettavan henkilön nimi: ");
		String nimi = lukija.nextLine();
		
		Henkilo tieto = etsiHenkilo(nimi);
		
		if (tieto != null) {
			System.out.print("Anna nimi: ");
			String muutettava = lukija.nextLine();
			System.out.print("Anna osoite: ");
			String osoite = lukija.nextLine();
			
			tieto.setNimi(muutettava);
			tieto.setOsoite(osoite);
		}
		
		else {
			System.out.println("Henkilöä ei ole");
			return;
		}
		

	}
	
	private void muutaKoko() {
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Anna kokoa muutettavan henkilön nimi: ");
		String nimi = lukija.nextLine();
		
		Henkilo tieto = etsiHenkilo(nimi);
		
		if (tieto != null) {
			System.out.print("Anna pituus: ");
			Double pituus = lukija.nextDouble();
			System.out.print("Anna paino: ");
			int paino = lukija.nextInt();
		
			tieto.setPituus(pituus);
			tieto.setPaino(paino);
		}
		
		else {
			System.out.println("Henkilöä ei ole");
			return;
		}
		
	}
	
	
	private void naytaKaikki() {
		for(int i = 0; i < henkilot.size(); i++) {
			System.out.println(" ");
			System.out.println("Nimi: " + henkilot.get(i).getNimi());
			System.out.println("Osoite: " + henkilot.get(i).getOsoite());
			System.out.println("Pituus: " + desi.format(henkilot.get(i).getPituus()));
			System.out.println("Painoindeksi: " + desi.format(henkilot.get(i).getPainoindeksi()));
		}
		}

		
	public static void main(String[] args) {
		HenkilolistaSovellus sovellus = new HenkilolistaSovellus();

		int valinta = -1;
		Scanner lukija = new Scanner(System.in);

		do {
			System.out.println(" ");
			System.out.println("1. Lisää henkilö");
			System.out.println("2. Näytä henkilön tiedot");
			System.out.println("3. Muuta henkilön nimi ja osoite");
			System.out.println("4. Muuta henkilön koko");
			System.out.println("5. Näytä kaikki henkilöt");
			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-5): ");
			valinta = lukija.nextInt();

			switch (valinta) {
			case 1:
				sovellus.lisaaHenkilo();
				break;
			case 2:
				sovellus.naytaTiedot();
				break;
			case 3:
				sovellus.muutaTiedot();
				break;
			case 4:
				sovellus.muutaKoko();
				break;
			case 5:
				sovellus.naytaKaikki();
				break;
				
			case 0:
				break;
				
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);
		
		lukija.close();
	}
	
	private Henkilo etsiHenkilo(String nimi) {
		int i = 0;
		
		Henkilo tieto = null;
		Boolean loytyi = false;
		
		while (!loytyi && i < henkilot.size()) {
			tieto = henkilot.get(i);
			if (tieto.getNimi().equals(nimi)) {
				loytyi = true;
			}
			else {
				i++;
			}
		}
		
		if (loytyi) {
			return tieto;
		}
		else {
			return null;
		}
		
		
	}

	
	class Henkilo {
		String nimi;
		String osoite;
		double pituus;
		int paino; 
		
		public Henkilo () {
			super();
		}
	
		public Henkilo(String nimi, String osoite) {
			super();
			this.nimi = nimi;
			this.osoite = osoite;
		}
		
		public Henkilo (double pituus, int paino) {
			super();
		
			this.pituus = pituus;
			this.paino = paino;
		}
		
		public void setNimi(String nimi) {
			this.nimi = nimi;
		}
		
		public String getNimi() {
			return nimi;
		}
		
		public void setOsoite(String osoite) {
			this.osoite = osoite;
		}
		
		public String getOsoite() {
			return osoite;
		}
		
		public void setPituus(double pituus) {
			this.pituus = pituus;
		}
		
		public double getPituus() {
			return pituus;
		}
				
		public void setPaino(int paino) {
			this.paino = paino;
		}
		
		public int getPaino() {
			return paino;
		}
		
		public double getPainoindeksi() {
			double painoindeksi = paino / (pituus * pituus);
			return painoindeksi;
		}
		

		
	}
}

