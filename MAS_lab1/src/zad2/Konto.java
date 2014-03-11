package zad2;

public class Konto {

	private int numer;
	private double saldo;
	
	public Konto(int numer, double saldo) {
		this.numer = numer;
		this.saldo = saldo;
	}

	public void getSrodki(double value) throws NoSuchMoneyException {
		if(value > saldo) 
			throw new NoSuchMoneyException(ileZabraklo(value));
		saldo -= value;
	}
	
	public void setNumer(String str) {
		try {
			if(str.length()!=8)
				throw new NumberFormatException();
			
			String checkSum = str.substring(7);			
			
			String numerStr = str.substring(0, 7);
			Integer.decode(numerStr);
			
			int checkSumCount = 0;
			
			int[] weights = new int [] {7, 1, 3, 9, 7, 11, 3 };
			char[] numerCha = numerStr.toCharArray();
			for (int i = 0; i < numerCha.length; i++) {
				checkSumCount += numerCha[i] * weights[i];
			}
			
//			checkSum = checkSum % 10;
			
			
		} finally {
			saldo = 0;
		}
		
	}
	
	private double ileZabraklo(double value) {
		return Math.abs(saldo-value);
	}
	
}
