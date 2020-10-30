import java.util.Scanner;

public class Main {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	
	for(int i =0 ; i <n ; i++) {
		//케이스의 갯수
		int a = sc.nextInt();
		//학생의 수
		int [] arr = new int [a];
		// 학생의수만큼의 배열을 만듬
		int sum =0;
		int avg = 0;
		int count = 0;
		// 케이스마다 값을 초기화 시켜야함으로 for 문안에 값을 넣는다.
		for(int j =0 ; j <arr.length ; j++) {
			// 학생수 만큼 반복
			arr[j] =sc.nextInt();
			// 학생수 만큼 점수를 입력.
			sum += arr[j]; 
			// 학생의 점수의 합.	
			}
			 avg =sum/a;
			 //평균
			 for(int inx = 0 ; inx <arr.length ; inx++) {
				 // 평균보다 큰 학생의 점수를 찾기위해 반복
				 if(arr[inx] >avg) {
					 // 평균보다 큰 경우 
					 count++;
					 // count +1
				 }
				 
			 }

			 System.out.printf("%.3f", 100.0 * count / a);
			 // 소수점 3자리까지  나타내는방법  , 평균보다 높은 학생 수를 %으로 나타낸 값
	         System.out.println("%");


		}
		
	
	}

}

