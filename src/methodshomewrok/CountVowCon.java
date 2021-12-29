package methodshomewrok;
import java.util.Scanner;

public class CountVowCon {
	private static Scanner sc;
	
	public static void main(String[] args) {
		String vowConsStr;
		
		sc= new Scanner(System.in);

		System.out.print(" Enter Vowel, Consonant String =  ");
		vowConsStr = sc.nextLine();
		
		VowOrCons(vowConsStr.toLowerCase());
	}
	public static void VowOrCons (String vowConsStr)
	{
		int i, vowels, consonants;
		vowels = consonants = 0;
		char ch;
		
		for(i = 0; i < vowConsStr.length(); i++)
		{
			ch = vowConsStr.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowels++;
			}
			else if(ch >= 'a' && ch <= 'z') 
			{
				consonants++;
			}
		}		
		System.out.println("\nNumber of Vowel Characters = " + vowels);
		System.out.println("Number of Consonant Characters = " + consonants);

	}
}