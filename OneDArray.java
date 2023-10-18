import java.util.Scanner;
class OneDArray{
	public static void main(String[]args){
	int a[],i;
	a = new int[10];
	Scanner scan = new Scanner(System.in);
	for(i=0; i<=a.length-1; i++){
		System.out.println("Enter an element: ");
		a[i] = scan.nextInt();
	}
	for(i=0; i<=a.length-1; i++){
		System.out.println(a[i]);
	}
	}
}