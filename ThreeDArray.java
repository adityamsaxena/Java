import java.util.Scanner;
class ThreeDArray{
	public static void main(String[]args){
	int a[][][] = new int[3][4][5];
	int i,j,k;
	Scanner scan = new Scanner(System.in);
		for(i=0;i<=a.length-1;i++){
			for(j=0;j<=a[i].length-1;j++){
				for(k=0; k<=a[i][j].length-1;k++){
					System.out.println("Enter an element: ");
					a[i][j][k] = scan.nextInt();
				}
			}
		}
		for(i=0;i<=a.length-1;i++){
			for(j=0;j<=a[i].length-1;j++){
				for(k=0; k<=a[i][j].length-1;k++){
					System.out.println(a[i][j][k] + " ");
				}
					System.out.println();
			}
					System.out.println();
		}
	}
}