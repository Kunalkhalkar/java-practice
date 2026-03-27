/*Question 9: Write a java program to input any alphabet and check whether it is vowel or consonant.
*/
import java.io.*;
public class VowelOrConsonent{
	public static void main(String ...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the charactor");
		char ch = br.readLine().charAt(0);
		
		if(ch == 'a'|| ch == 'e' || ch == 'i' ||ch == 'o'||ch == 'u'){
			System.out.println("Charactor is vowel");
		}
		else{
			System.out.println("Charactor is consonent");
		}
	}
}