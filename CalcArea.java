/*
Question 4: Write a Java program to enter length and breadth of a rectangle and calculate its area.
*/
import java.io.*;
public class CalcArea{
	public static void main(String...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of rectangle");
		int length = Integer.parseInt(br.readLine());
		int breadth = Integer.parseInt(br.readLine());
		
		double area = 2 * length * breadth;
		System.out.println("Area of Rectanle is : " + area);
	}
}