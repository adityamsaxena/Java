import java.util.Scanner;
class TwoDArray{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int a[][], i, j;
		a = new int[3][4];
		for(i=0; i<=a.length-1; i++){
			for(j=0; j<=a[i].length-1; i++){
			System.out.println("Enter an element: ");
			a[i][j] = scan.nextInt();
			}
		}
		for(i=0; i<=a.length-1; i++){
			for(j=0; j<=a[i].length-1; i++){
			System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}