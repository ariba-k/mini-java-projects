import java.util.Scanner;

public class EmailGenerator {
	static String makeUserName(String firstName,String lastName)
	  {
	      String firstLetter = firstName.substring(0,1);
	      String user = (firstLetter+ lastName);
	      return user.toLowerCase();
	  }
	  
	  static String makeEmail(String username, String domain)
	  {
		  String email = username + "@" + domain;
	      return email;
	       
	  }
	  public static void main(String[] args)
	  {
	      Scanner input = new Scanner(System.in);
	      
	      System.out.println("Enter your first name:");
	      String firstName = input.nextLine();
	      
	      System.out.println("Enter your last name:");
	      String lastName = input.nextLine();
	      
	      input.close();
	      
	      
	      String username = makeUserName(firstName,lastName);
	      String domain = "TownsendHarris.edu";
	      
	      System.out.println("The user's e-mail is: "+ makeEmail(username,domain));
	              
	  }

}
