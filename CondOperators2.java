/*conditional operators '?', ':'.
syntax { condition1 ? expression1 : expression2 } -- if condition1 is true then expression1 is returned and if condition1 is false then expression2 will be returned*/

public class CondOperators2{
	
	public static void main(String x[]){
	System.out.println("--------------------------------------------------------");	
	System.out.println("this program uses to used conditional operator");
	System.out.println("--------------------------------------------------------");

	int a=10, b=20;

	String str = a>b ? "a is greater" : "b is greater";

	System.out.println(str);
	
	int c = Integer.parseInt(x[0]);
	int d = Integer.parseInt(x[1]);
	String exp = c<d ? "d is greater" : "c is greater";
	System.out.println(exp);
	}
}
