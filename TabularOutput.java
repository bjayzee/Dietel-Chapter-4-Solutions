package co.standup;

public class TabularOutput {

	public static void main(String[] args) {
	System.out.println("N      10*N      100*N       1000*N");
	int n = 1;
	while(n <= 5) {
		System.out.printf("%d%10d%10d%11d%n", n, 10*n, 100*n, 1000*n);
		n++;
	}
	}

}
