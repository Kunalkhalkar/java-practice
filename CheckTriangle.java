/*Question 3: Write a Java program to check whether a triangle is equilateral, isosceles or scalene.

*/

import java.io.*;
public class checkTriangle{
	public static void main(String ...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first side of triangle");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the second side of triangle");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the third side of triangle");
		int c = Integer.parseInt(br.readLine());
		
		if(a==b && b== c){
			System.out.println("Triangle is equilateral");
		}
		else if(a == b || a == c || b == c){
			System.out.println("Triangle is Isosceles");
		}
		else{
			System.out.println("Trianle is Scalene");
		}
	}
}