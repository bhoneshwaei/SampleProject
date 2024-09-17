
//1. Check whether a character is a vowel or consonant.
package project1;

public class consontORvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ='u';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println(ch+" is a vowel.");
		}
		else if(Character.isLetter(ch))
		{
			System.out.println(ch +" is Consonat.");
		}else 
		{
			System.out.println(ch +" is not a letter");
		}
	
	}

}
