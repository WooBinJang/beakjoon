
import java.util.Scanner;

public class Test {
    long sum(int[] a) {
    	long ans = 0;
        for(int i =0 ; i<a.length; i++) {
        	ans += a[i]; 
        	// 배열의 합을 구하는 함수 생성
    }  return ans;
    }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 스캐너 호출
	int n = sc.nextInt();
	// 배열의 길이 설정 해줄 입력값 호출
	int [] arr = new int [n];
	// 배열의 길이 설정
	for(int j=0; j<n ; j++) {
		arr[j] = sc.nextInt();
	}	// 배열의 들어가는 값 입력
		Test t = new Test();
		//함수 호출
		System.out.println(t.sum(arr));
		// arr 배열의 합을 출력
	}
}

