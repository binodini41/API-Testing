package restassuredTestpackage;
import org.apache.commons.lang3.RandomStringUtils;
public class Restutils {

	
	
	public static String getFirstName(){
		
		String generatedString= RandomStringUtils.randomAlphabetic(1);
		
		return ("Telsa"+ generatedString);
		
	}
	
	public static String getLastName(){
		
		String generatedString= RandomStringUtils.randomAlphabetic(1);
		
		return ("Sah"+ generatedString);
		
	}
	
	public static String getUserName(){
		
		String generatedString= RandomStringUtils.randomAlphabetic(1);
		
		return ("bin"+ generatedString);
		
	}
	
	
	public static String getPassword(){
		
		String generatedString= RandomStringUtils.randomAlphabetic(1);
		
		return ("test"+ generatedString);
		
	}
	
	public static String getEmail(){
		
		String generatedString= RandomStringUtils.randomAlphabetic(1);
		
		return ("test@xyz.com"+ generatedString);
		
	}
/*public static String getSalary(){
		
		String generatedSal= RandomStringUtils.randomNumeric(1);
		
		return ("1"+ generatedSal);
		
	}

public static String getAge(){
	
	String generatedAge= RandomStringUtils.randomNumeric(1);
	
	return ("1"+ generatedAge);
	
}*/
}
