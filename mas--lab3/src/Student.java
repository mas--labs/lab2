import java.util.Date;

/** Klasa dziedzicz¹ca po klasie Person - do pokazania PRZES£ONIÊCIA */
@SuppressWarnings("serial")
public class Student extends Person {
	
	private String index;

	public Student(String firstName, String surname, Address address,
			Date birthdate, String index) {
		super(firstName, surname, address, birthdate);
		if(index == null) throw new NullPointerException();
		this.index = index;
	}
	
	/** Przes³oniêta metoda przedstawiania siê */
	@Override
	public void introduceYourself() {
		System.out.println("Dzien dobry nazywam sie " + getFirstName() 
				+ " i  jestem studentem");
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tStudent [index=" + index + "]";
	}
	
}
