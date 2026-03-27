/*
Question 5: Write a Java program to enter the radius of a circle and calculate its diameter, area, and circumference.
*/
import java.io.*;
public class Circumference{
	public static void main(String ...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius of circle");
		
		double radius = Double.parseDouble(br.readLine());
		double diameter = 2 * radius;
		double area = 3.14 * radius * radius;
		double circumference = 2 * 3.14 * radius;
		
		System.out.println("Area is :" + area);
		System.out.println("Diameter is :" + diameter);
		System.out.println("circumference is :" + circumference);
	}
}