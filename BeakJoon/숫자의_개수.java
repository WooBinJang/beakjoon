import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int d = a * b * c;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
        int e = 1000000000;
		for (int i = 10; i <= e ; i *= 10) {
			if (d>=(i/10)&&(d % i) / (i / 10) == 0) {
				count0++;
			} else if ((d % i) / (i / 10) == 1) {
				count1++;
			} else if ((d % i) / (i / 10) == 2) {
				count2++;
			} else if ((d % i) / (i / 10) == 3) {
				count3++;
			} else if ((d % i) / (i / 10) == 4) {
				count4++;
			} else if ((d % i) / (i / 10) == 5) {
				count5++;
			} else if ((d % i) / (i / 10) == 6) {
				count6++;
			} else if ((d % i) / (i / 10) == 7) {
				count7++;
			} else if ((d % i) / (i / 10) == 8) {
				count8++;
			} else if ((d % i) / (i / 10) == 9) {
				count9++;
			}
		}

		System.out.println(count0);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		System.out.println(count6);
		System.out.println(count7);
		System.out.println(count8);
		System.out.println(count9);

	}
}
