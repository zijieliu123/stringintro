package snippet;

public class introtostring {
	
	public void half(String str) {
	
		System.out.println(str.substring(str.length()/2));
		
	}
	
	public void concatenate(String a, String b) {
		
		String str2 = "";
		
		str2 = a.substring(1) + b.substring(1);
		
	}
	
	public void contains(String bigWord, String littleWord) {
		
		if (bigWord.indexOf(littleWord) != -1)
			System.out.println("yes");
		
		else
			System.out.println("no");
		
	}
	
	public void adverb(String word) {
		
		if (word.charAt(word.length()-2).equals("ly")) {
			System.out.println("yes");
		}
		
		else {
			System.out.println("no");
		}
	}
	
	
}

