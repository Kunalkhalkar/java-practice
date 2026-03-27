/*
Question 4: Write a Java program to check whether a number is positive, negative or zero.
*/
import java.io.*;

public class CheckNum{
	public static void main(String...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int a = Integer.parseInt(br.readLine());
		
		if(a < 0){
			System.out.println("number is negative");
		}
		else if (a > 0){
			System.out.println("Number is positive");
		}
		else{
			System.out.println("you erntered zero");
		}
	}
}