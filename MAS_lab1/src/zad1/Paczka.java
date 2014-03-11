package zad1;


public class Paczka implements Comparable<Paczka> , Stackable {

	private int szerokosc;
	private int dlugosc;
	private int wysokosc;
	private int waga;

	public Paczka(int szerokosc, int dlugosc, int wysokosc, int waga) {
		this.szerokosc = szerokosc;
		this.dlugosc = dlugosc;
		this.wysokosc = wysokosc;
		this.waga = waga;
	}

	@Override
	public int compareTo(Paczka o) {
		double zapelnienie = (szerokosc * wysokosc * dlugosc) / (double) waga;
		double zapelnienieO = (o.szerokosc * o.wysokosc * o.dlugosc)
				/ (double) o.waga;
		return zapelnienie > zapelnienieO ? 1 : 0;
	}
	
	@Override
	public boolean stack(Paczka paczka) {
		if(this.szerokosc >= paczka.szerokosc && this.dlugosc >= paczka.dlugosc)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Paczka [szerokosc=" + szerokosc + ", dlugosc=" + dlugosc
				+ ", wysokosc=" + wysokosc + ", waga=" + waga + "]";
	}
	
}