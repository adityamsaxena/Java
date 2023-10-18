import java.util.Scanner;
class ArmstrongNo{
public static void main(String[]args){
	int digit, sum, n1, n;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the n: ");
	n = scan.nextInt();
	sum=0;
	n1 = n;
	while(n!=0){
	digit = n%10;
	sum = sum + (digit*digit*digit);
	n = n/10;
	}
	if(n1 == sum){
		System.out.println("It is an Armstrong no.");
	}else{
		System.out.println("It is not an Armstrong no.");
	}
     }
}