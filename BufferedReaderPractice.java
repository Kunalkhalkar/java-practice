/*
Question 2: Write a Java program to input all basic data types (int, float, double, char, boolean) and print their values.
*/
import java.util.*;
import java.io.*;
public class BufferedReaderPractice{
	public static void main(String...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// Syntax for buffer reader
		System.out.println("Enter the name of person");
		String name = br.readLine();
		int a = Integer.parseInt(br.readLine());
		System.out.println(name + " "+ a);
	}
}