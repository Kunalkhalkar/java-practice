/*
Question 3: Write a Java program to enter two numbers and perform addition, subtraction, multiplication, division, and modulus.

*/
import java.io.*;

public class ArithmaticOPS{
	public static void main(String...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the number");
		int b = Integer.parseInt(br.readLine());
		
		
		System.out.println("addition is : "+ (a+b) + "Substraction is : "+ (a-b) + "multiplication is : " + (a*b) + "division is : "+ (a / b) + "Modulus : " +(a % b));
	}
}