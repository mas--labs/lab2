import java.io.IOException;

import tools.Extension;
import tools.MyCalendar;

/** Klasa Testuj¹ca dzia³anie */
public class MainApp {

	public static void main(String[] args) {

		/** Tworzenie obiektów */

		Person p1 = new Person("Jan", "Kowal", 
				new Address("Poland", "Warsaw", "Koszykowa", "22-11"), 
				MyCalendar.getBirthDate(11, 9, 1970));
		p1.addNumber("22:9011213");
		p1.addNumber("33:56096");

		Person p2 = new Person("Jack", "Smith", 
				new Address("USA", "New York", "Wall street", "424141"), 
				MyCalendar.getBirthDate(5, 12, 1985));
		p2.addNumber("11:848281");

		Student s1 = new Student("Adam", "Nowak", 
				new Address("Poland", "Krakow", "Cicha", "31-119"), 
				MyCalendar.getBirthDate(5, 8, 1990),
				"s1011");
		s1.setSecondName("Pawel");

		/** Zapisanie ekstensji do pliku */
		save();

		/** .. lub odczytanie ekstensji z pliku */
//		 read();
		
		/** Wypisanie ekstensji */
		for (Class<?> c : Extension.getSavedClass()) {
			System.out.println(" --------- EKSTENSJA KLASY: "
												+ c.getSimpleName() + " ----------------");
			System.out.println(Extension.getExtensionOf(c));
		}

		/** Metoda klasowa */
		System.out.println(" ----------- Najstarsza osoba w calej ekstensji -------------");
		System.out.println(Person.getTheOldest());
		
		/** Atrybut Klasowy */
		System.out.println("------------ Planeta zamieszkania ---------------------------");
		System.out.println(p1.getFirstName() + " zyje na planiecie " + Person.origin);
		
		/** Przes³oniêcie */
		System.out.println("----------- Przedstawianie sie -----------------------------");
		p1.introduceYourself();
		s1.introduceYourself();
		
		/** Przeci¹¿enie */
		System.out.println("---------- Przedstawianie innych ------------------------------");
		p1.introduceYourFriend(s1);
		p1.introduceYourFriend(s1, "najlepszy");
		
	}

	public static void save() {
		try {
			Extension.writeExtendsion(Extension.filePath);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void read() {
		try {
			Extension.readExtension(Extension.filePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(2);
		}
	}

}
