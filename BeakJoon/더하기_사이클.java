import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = a;
    	int count= 0;
    	do  { b= b % 10 *10 + (b/10 + b%10) %10;
        count++;
        	
        } while(a != b);
    	System.out.println(count);
    }
    
    }
	    
