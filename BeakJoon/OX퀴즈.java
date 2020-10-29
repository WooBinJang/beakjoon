import java.util.Scanner;
 
public class Main {
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
    // 스캐너 추가
	int n = sc.nextInt();
    // OX 갯수 정하기
	sc.nextLine();
    // 줄넘김 기준으로 나눔
	for(int a =0 ; a<n ; a++) {
		String input = sc.nextLine();
        // OX 값입력
		int count= 0;
		int score =0;	 // for문안에 있는이유는 다시 초기화 시켜 주기위해서이다.  
		for(int i =0 ; i<input.length(); i++) {
            // OX 길이만큼 반복
			if(input.charAt(i)=='O') {
                // charAt(i) = 'O' input 변수에 있는 OX에서 O일경우 
                //charAt(i) = i번째 있는 인수 문자를 읽어냄 
				count++;
				score += count;
                // 합의 score에 값 저장
			} else {
				count= 0;
                // X 나올시 값 0으로 초기화
			}
			
		}
		System.out.println(score);
	}
		
	
}
    }

