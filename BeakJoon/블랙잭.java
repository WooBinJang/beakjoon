import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력 개수
		int M = sc.nextInt(); // M 값
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); // 입력 값
		}
		int[] a2 = new int[(n * (n - 1) * (n - 2)) / 6]; // 배열의 길이
		int o = 0; // 배열의 인덱스 
		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				for (int l = k + 1; l < n; l++) {
					a2[o] = a[j] + a[k] + a[l]; // 합
					o++;
				}
			}
		}
		Arrays.sort(a2); // 정렬

		for (int f = 0; f < a2.length; f++) {
			if (a2[f] == M) {
				System.out.println(a2[f]);
				break;
			} else if (a2[f] > M) {
				System.out.println(a2[f - 1]);
				break;
			} else if (a2[a2.length - 1] < M) { 
				System.out.println(a2[a2.length - 1]);
				break;

			}
		}

	}

}
