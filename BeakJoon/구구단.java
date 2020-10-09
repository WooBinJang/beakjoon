import java.util.Scanner;
public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        
       if(n>=1){
            for(int j=1 ; j<=9 ; j++){
              int g= n*j;  
                 System.out.println(n +" * " + j + " = " + g);
            }
   
        }
    }
}
