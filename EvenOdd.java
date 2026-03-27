/*
Question 1: Write a Java program to check whether a number is even or odd.
*/
import java.io.*;
public class EvenOdd{
	public static void main(String ...x) throws Exception{ // BufferedReader throws a Exception i.e(IOException())
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Syntax for buffered reader
		System.out.println("Enter the number to check even or odd");
		int a = Integer.parseInt(br.readLine());
		
		if(a % 2 == 0){
			System.out.println("number is even");
		}
		else{
			System.out.println("Number is odd");
		}
		
	}
}