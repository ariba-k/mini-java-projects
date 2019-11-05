
public class Precedent {
	
	public static String whatsBefore(String sent1, String sent2) {
		
		int index = sent1.indexOf(sent1);
		String newSent = sent2.substring(0, index);
		
		return newSent;
		
	}

}
