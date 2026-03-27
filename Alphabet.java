/*
Question 6: Write a Java program to check whether a character is alphabetic or not.
*/
import java.io.*;

public class Alphabet{
	public static void main(String ...x) throws Exception{
		System.out.println("Enter the charactor");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char a = (br.readLine()).charAt(0);
		
		if(a >=65 && a <= 90 || a>=97 && a<= 122){
			System.out.println("character is Alphabetic");
		}
		else
			System.out.println("character is NOT Alphabetic");
			
	}
}