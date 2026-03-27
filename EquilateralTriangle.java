/**
Question 2: Write a Java program to check whether a triangle is valid or not.
Input:
*/
import java.io.*;
public class EquilateralTriangel{
	public static void main(String ...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the one side of Triangle");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the second side of Triangle");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the third side of Triangle");
		int c = Integer.parseInt(br.readLine());
		
		if(a + b + c == 180){
			System.out.println("is a Triangle");
		}
		else{
			System.out.println("Not a Triangle");
		}
	}
}
