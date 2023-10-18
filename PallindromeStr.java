import java.util.*;
public class PallindromeStr{
	public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	String s;
	int i,j;
	System.out.println("Enter the String: ");
	s = scan.next();
	int m = s.length();
	char org[] = new char[m];
	char rev[] = new char[m];

		for(i=0; i<=m-1; i++){
			org[i] = s.charAt(i);
		}
			i = s.length() - 1;
			j=0;
			while(i>=0){
				rev[j] = org[i];
				i--;
				j++;
			}
		/*	boolean status;
			status = Arrays.equals(org,rev);
				if(status==true){
					System.out.println("String is pallindrome");
				}else{
					System.out.println("String is not pallindrome");
					}*/
					System.out.println(rev);
	}
}
