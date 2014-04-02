import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Person extends Plus {
	
	private String firstName;
	
	private String secondName;		// atrybut opcjonalny
	
	private String surname;
	
	private Address address;	// atrybut z³o¿ony
	
	private Set<PhoneNumber>numbers = new HashSet<>(); // atrybut powtarzalny
	
	private Date birthdate;
	
	private int age;	// atrybut pochodny
	
	
	public Person(String firstName, String surname, Address address,
			Date birthdate) {
		this.firstName = firstName;
		this.surname = surname;
		this.address = address;
		this.birthdate = birthdate;
	}
	
	public void addNumber(PhoneNumber pn) {
		if(pn == null) throw new NullPointerException();
		numbers.add(pn);
	}
	
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		Calendar now = Calendar.getInstance();
		Calendar birthdayCal = Calendar.getInstance();
		birthdayCal.setTime(birthdate);
		return age = now.get(Calendar.YEAR) - birthdayCal.get(Calendar.YEAR);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", secondName=" + secondName
				+ ", surname=" + surname + ", address=" + address
				+ ", numbers=" + numbers + ", birthdate=" + birthdate
				+ ", age=" + age + "]";
	}
	
}
