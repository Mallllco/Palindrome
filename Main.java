import java.util.Scanner;

public class Main {
	
	private static Boolean Palindromo (String word) {
		String wordLowercase = word.toLowerCase();
		Boolean palindromeCheck = false;
		
		String reverseWord = "";
		char letter;
		
		for(int i=0; i<word.length(); i++) {
			letter =  wordLowercase.charAt(i);
			reverseWord = letter + reverseWord;
		}
		
		if(wordLowercase.equals(reverseWord)) {
			palindromeCheck = true;
		}
		
		return palindromeCheck;
	}
	
	 public static void main (String[] args) {
		String word;
		Scanner input = new Scanner(System.in);
		 		
		System.out.println("Inserisci la parola: ");
		word = input.next();
		 		
		if(Palindromo(word)) {
			System.out.println("La parola è palindroma");
		}else{
		 	System.out.println("La parola non è palindroma");
		 }
		 		
		input.close();
	 }
}
