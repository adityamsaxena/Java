import java.util.*;
public class Dashboard{
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    String s1, s2;
    System.out.println("Enter your login Id: ");
    s1 = scan.next();
    System.out.println("Enter your Password: ");
    s2 = scan.next();
    System.out.println("Join A Meeting");
    System.out.println("Please Enter 1 for 'Welcome To Naukri/Jobs' ");
    System.out.println("Please Enter 2 for 'Interview Connected' ");
    System.out.println("Please Enter 3 for 'Generate Your Interview Id' ");
    System.out.println("Please Enter 4 for 'Other Settings' ");
    int click;
    click = scan.nextInt();
    if(click==1){
        System.out.println("Welcome To Naukri/Jobs");
        int i,j,count=0;
        String jobs;
        for(i=1;i<=3;i++){
            System.out.println("Enter Naukri/Jobs");
            jobs = scan.next();
        }
    }
    if(click == 2){
        System.out.println("Your Interview is Connected...Please Wait!");
    }
    if(click==3){
    System.out.println("Generate Your Interview Id");
    System.out.println("Enter Amount ");
    double Amnt = scan.nextDouble();
    System.out.println("Rs." + Amnt);
    String name, PhNo,CdNo,CVV;
    System.out.println("Enter your full name ");
    name = scan.nextLine();
    System.out.println("Enter your phone number ");
    PhNo = scan.nextLine();
    System.out.println("Enter card number ");
    CdNo = scan.nextLine();
    System.out.println("Enter 3 digit CVV ");
    CVV = scan.next();
    System.out.println("Your transaction is being processed. ");
    System.out.println("Please wait!");
    }
    if(click==4){
    System.out.println("Other Settings");
    }
    }
}