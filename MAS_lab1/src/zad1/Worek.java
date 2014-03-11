package zad1;

public class Worek implements Comparable<Worek>{

	private int waga;
	private int srednica;
	private int wysokosc;
	
	public Worek(int waga, int srednica, int wysokosc) {
		this.waga = waga;
		this.srednica = srednica;
		this.wysokosc = wysokosc;
	}

	@Override
	public int compareTo(Worek o) {
		double zapelenie = (Math.PI * Math.pow(srednica, 2) * wysokosc) / (double) waga;
		double zapelnienieO = (Math.PI * Math.pow(o.srednica, 2) * o.wysokosc) / (double) o.waga;
		return zapelenie > zapelnienieO? 1 : 0;
	}

	@Override
	public String toString() {
		return "Worek [waga=" + waga + ", srednica=" + srednica + ", wysokosc="
				+ wysokosc + "]";
	}
	
//	@Override
//	public boolean stack(Paczka paczka) {
//		if(this.srednica > paczka.getSrednica)
//		
//		return false;
//	}
	
}
