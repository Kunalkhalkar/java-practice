/*
Question 5: Write a Java program to check whether a number is divisible by 5 and 11 or not.
*/
import java.io.*;
public class CheckDivisible{
	public static void main(String...x) throws Exception{
		System.out.println("Enter the number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		if(a % 5 == 0 && a % 11 ==0){
			System.out.println("Number is Divisible by 5 and 11");
		}
		else{
			System.out.println("not divisible by both");
		}
		
	}
}