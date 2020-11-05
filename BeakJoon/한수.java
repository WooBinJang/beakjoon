import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count	 = 0;
		if (n < 100) {
			for (int i = 1; i <= n; i++) {
				count++;
			}
		} else if (n >= 100 && n <= 1000) {
			for (int i = 100; i <= n; i++) {
				int a = i / 100; // 백의 자리
				int b = (i % 100) / 10; // 십의 자리
				int c = i % 10; // 일의 자리
				int d = b-a;
				int e = c-b;
				if (d == e) {
					count++;
				}
			}
			count += 99;

		}
		System.out.println(count);
	}

}
