import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[]args){
       int sum, digit, n;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the n: ");
       n = scan.nextInt();
       sum=0;
       while(n!=0){
           digit= n%10;
           sum = sum + digit;
           n = n/10;
           }
           System.out.println(sum);
}
}