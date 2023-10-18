import java.util.Scanner;
class DemoInput{
	public static void main(String[]args){
	int a,b,c;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of a: ");
	 a = scan.nextInt();
	System.out.println("Enter the value of b: ");
	 b = scan.nextInt();
	 c = a + b;
	System.out.println("Your Addition is: " + c);
	}
}