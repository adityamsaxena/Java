import java.util.*;
class CharCnt{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s;
        char ch;
        System.out.println("Enter the string: ");
        s = scan.next();
        System.out.println("Enter the char: ");
        
	try{
        	ch = (char)System.in.read();
        	int m,i;
        	m = s.length();
        	int count = 0;
        		for(i=0; i<=m-1;i++){
            			if(s.charAt(i) == ch){
               		       		 count++;
            			}
        		}
                System.out.println(count);
                if(count == 0){
                System.out.println("Not Present in your String!");
            	}
           }
            catch(Exception e){
            System.out.println();
        }
    }
}
