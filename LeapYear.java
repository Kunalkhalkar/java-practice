/*
Question 8: Write a Java program to check whether a year is a leap year or not.
*/
import java.io.*;

public class LeapYear{
	public static void main(String...x) throws Exception{
		System.out.println("Enter the year");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		if(year % 4 == 0){
			System.out.println("year is Leap");
		}
		else{
			System.out.println("Year is Not Leap");
		}
		
	}
}