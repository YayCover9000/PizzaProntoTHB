package de.thb.dim.pizzaPronto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class CustomerVO {
	
	private String UElastName;
	private String UEfirstName;
	private String UEgender;
	private LocalDate UEdateOfBirth;
//	private static LocalDate today = LocalDate.of(2023, 3, 30);
//	private static LocalDate dob = LocalDate.of(1998, 5, 24);
//	private int UEid;
//	static int nextID = 0;
	
	
	
	public static void main (String [] args) {
		
	}
	
	
	public CustomerVO() {
		this(null,  null,  null, null);
	}
	
	
	
	public CustomerVO (String lastName, String firstName, String gender, LocalDate dob) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setGender(gender);
		this.setDateOfBirth(dob);
		
//		this.UEid = nextID++;
		
		/*
		UElastName = lastName;
		UEfirstName = firstName;
		this.UElastName = lastName;
		this.UEfirstName = firstName;
		*/
	}
	
	public CustomerVO (String lastName, String firstName, LocalDate dob) {
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setDateOfBirth(dob);
		
//		this.UEid = nextID++;
	}
	
	public void setLastName (String lastName) {
		UElastName = lastName;
	}
	
	public String getLastName () {
		return UElastName;
	}
	
	public void setFirstName (String firstName) {
		UEfirstName = firstName;
	}
	
	public String getFirstName () {
		return UEfirstName;
	}
	
	public void setGender (String gender) {
		UEgender = gender;
	}
	
	public String getGender () {
		return UEgender;
	}

	public LocalDate getDateOfBirth () {
		return UEdateOfBirth;
	}

	public void setDateOfBirth (LocalDate date) {
//		if (UEdateOfBirth != null) {
//			if ( Period.between (UEdateOfBirth, LocalDate.now()).getYears() >= 17) {
//				this.UEdateOfBirth = date;
//			}
//		}
		UEdateOfBirth = date;
	}
	
	public String dobToString () {
		if (UEdateOfBirth != null) {
			return UEdateOfBirth.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
		}
		return null;
	}
	
	

}
