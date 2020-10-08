import java.util.Scanner;
public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int h , m ;
        h = sc.nextInt();
        m = sc.nextInt();
        
        if(1<= h && h <=23 && 0<=m && m<=44 ) {
            System.out.println((h-1) + " " + (m+15) );
        } else if(1<= h && h <=23 && m>=45 ) {
           System.out.println(h +" " + (m-45));       
        } else if (h ==0 && 0<=m && m<=44 ) {
            System.out.println((h+23) +" " + (m+15));     
        } else if (h ==0 && m>=45) {
            System.out.println(h +" " + (m-45));  
        }
    }
}
