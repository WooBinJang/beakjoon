import java.util.*;
public class Main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	
	int [] arr = new int [9];
	for( int i =0 ; i<arr.length ; i++ ) {
		int n = sc.nextInt();
		arr[i] = n;
	}
	int max = arr[0] ;

	for ( int i =0 ; i < arr.length ; i++) {

		if (arr[i] > max) {		
		
			max = arr[i];
			
		}
	}
	System.out.println(max);
	
	for( int j =0 ; j < arr.length ; j++) {
		if(arr[j] == max) {
			System.out.println(j+1);
		}
	}

	
}
}
