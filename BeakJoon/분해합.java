import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력값

		for (int i = 0; i < n; i++) {
			int a = i; 


				for (int j = i; j > 0; j /= 10) {
					a += j % 10; // 일의자리 + 십의자리 + ... 각 자릿수의 합과 입력값을 a 에 저장

				}
	
			if (a == n) {
				System.out.println(i);
				break;
			}
			if (i == n - 1) // i 가 n-1 까지 반복하였으나 위에 조건문에 맞는것이 없을경우
				System.out.println(0); // 0을 출력
		}
	}
}
