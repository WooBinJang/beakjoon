import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        int a;
        int b;
        
        while (true) {
        	a=sc.nextInt();
        	b=sc.nextInt();
        	 int sum = a+b;
        	 if(sum ==0) {
        		 break;
        	 }
        	System.out.println(sum);
        	
        }
        
        
        }
    }

