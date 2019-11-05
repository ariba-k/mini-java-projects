public class AboutMe {
	
	public String mySchool()
	{
		String school = "Townsend Harris High School.";
			
		return school;
	}
	
	public String myName()
	{
		String name = "Ariba Khan";
    	return name;
	}
	
	public int myAge()
	{	
		int age = 16;
    	return age;
	}
	
	public static void main(String[] args)
	{
		AboutMe a = new AboutMe();
    	System.out.print("Hello! My name is " + a.myName());
    	System.out.print(" ,and I go to " + a.mySchool());
    	System.out.print(" I am " + a.myAge() + " years old.");
	}
	
}
