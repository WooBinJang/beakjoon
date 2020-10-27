import java.util.Scanner;
import java.util.HashSet;
public class Main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	HashSet<Integer> h = new HashSet();
	//HashSet = 중복원소를 허용 x 
	for(int i =0 ; i <10 ; i++) {
		h.add(sc.nextInt()%42);
        // HashSet 의 값은 .add 로 값을 입력
	}
	System.out.println(h.size());
	//길이는 size로 구한다.
	}
	
}
