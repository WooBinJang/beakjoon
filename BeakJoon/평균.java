import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n = sc.nextInt();
	int [] arr = new int[n];
	double sum =0.0 ;
	for(int i =0 ; i<arr.length ; i++) {
		arr[i] = sc.nextInt();
		sum += arr[i];
	}
	double max = arr[0];
	for(int i =0 ; i <arr.length ; i++) {
		if(arr[i] > max) {
			max=arr[i];
		}
	}
	System.out.println(((sum/max)*100)/n);

}
}
