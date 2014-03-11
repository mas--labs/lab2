package zad2;

public class Program {

	public static void main(String[] args) {

		Konto k1 = new Konto(1, 100.);
		try {
			k1.getSrodki(12.);
		} catch (NoSuchMoneyException e) {
			e.printStackTrace();
		}
		
		k1.setNumer("1112222C");
		
		
	}

}
