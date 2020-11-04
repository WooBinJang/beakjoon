public class Main {
	static int dn(int n) {
		int dn = n;
		while (n > 0) {
			dn += n % 10;
			n /= 10;
		}
		return dn;
	}

	public static void main(String[] args) {
		boolean[] a = new boolean[10001]; 
		for (int i = 0; i < 10000; i++) {
			int f = dn(i);
			if (f <= 10000) {  //10000보다 작거나 같은 셀프 넘버
				a[f] = true; // boolean의 default 값은 false
			}
		}

		for (int j = 0; j < a.length; j++) {
			if (!a[j]) {
				System.out.println(j);
			}
		}
	}

}
