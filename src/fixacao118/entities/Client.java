package fixacao118.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private String name;
	private String email;
	private Date birthDate;
	
	public Client(String name, String email, String birthDate) throws ParseException {
		this.name = name;
		this.email = email;
		setBirthDate(birthDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		this.birthDate = sdf.parse(birthDate);
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Client: ");
		sb.append(name);
		sb.append(" (");
		sb.append(birthDate);	//TODO correct date format
		sb.append(") - ");
		sb.append(email);
		
		return sb.toString();
		
	}

}
