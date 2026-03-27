/*
Question 10: Write a java program to input any character and check whether it is alphabet, digit or special character.
*/
import java.io.*;

public class CheckChar{
	public static void main(String ...x) throws Exception{
		System.out.println("Enter the Charactor");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch = br.readLine().charAt(0);
		if(ch >='0' && ch <= '9'){
			System.out.println("charactor is digit");
		}
		else if(ch >='a' && ch<= 'z' || ch >= 'A' && ch <= 'Z'){
			System.out.println("Character is alphabet");
		}
		else{
			System.out.println("Character is Special character");
		}
	}
}