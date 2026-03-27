/*Question 7: Write a Java program to input cost price and selling price of a product and check profit or loss.
*/
import java.io.*;

public class SellingPrice{
	public static void main(String ...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Cost price");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the selling price");
		int b= Integer.parseInt(br.readLine());
		
		if(b - a <= 0){
			System.out.println("you are in loss of : RS."+(b-a));
		}
		else{
			System.out.println("you are in profit of : RS."+ (b - a));
		}
	}
}