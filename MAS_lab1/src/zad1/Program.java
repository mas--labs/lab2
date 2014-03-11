package zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
	
	public static void main(String[]s) {
	
		Paczka p1 = new Paczka(30, 20, 10, 10);
		Paczka p2 = new Paczka(50, 40, 5,  100);
		Paczka p3 = new Paczka(10, 10, 10, 400);
		
		System.out.println("Porownanie paczek " + p1 + " i " + p2);
		System.out.println( "Wieksza paczka " + (p1.compareTo(p2) > 0?  p1: p2) );
		
		
		List<Paczka> list = new ArrayList<Paczka>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Collections.sort(list);
		System.out.println("Posortowana:\t" + list);
		
		System.out.println("Najmniejsza:\t" + Collections.min(list));
	
	
	}
		
}