package Lecture22;

public class TimeComplexity {
	public static void main(String[] args) {

//---------------------------------------------------------------------
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
//---------------------------------------------------------------------
		int n = 1000;
		for (int i = 0; i < n; i++) {
			System.out.println("hey");
		}
//---------------------------------------------------------------------
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			i++;
		}
//---------------------------------------------------------------------
		while (i < n) {
			System.out.println("Hey");
			i *= 2;
		}
//---------------------------------------------------------------------
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
		}
//---------------------------------------------------------------------
		while (i <= n) {
			System.out.println("Hey");
			i += 2;
			i += 3;
		}
//---------------------------------------------------------------------
		while (i <= n) {
			System.out.println("Hey");
			i *= 2;
			i *= 3;
		}
//---------------------------------------------------------------------
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			n /= 3;
		}
//---------------------------------------------------------------------
		int k=5;
		while (i <= n) {
			System.out.println("Hey");
			i += k;
		}
//---------------------------------------------------------------------
		while (i <= n) {
			System.out.println("Hey");
			i *= k;
		}
//---------------------------------------------------------------------
		while (n > 0) {
			System.out.println("Hey");
			n = n - 1;
		}
//---------------------------------------------------------------------
		while (n > 0) {
			System.out.println("Hey");
			n = n - 2;
			n = n - 3;
		}
//---------------------------------------------------------------------
		while (n > 0) {
			n = n - k;
		}
//---------------------------------------------------------------------
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
			}
		}
//---------------------------------------------------------------------
		//HW
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
		}
//---------------------------------------------------------------------
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k1 = 1; k1 <= 1000; k1++) {				}
			}
		}
//---------------------------------------------------------------------
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (int k1 = 1; k1 <= n / 2; k1++) {
					System.out.println("hey");
				}
			}
		}
//---------------------------------------------------------------------
		for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
		}
//---------------------------------------------------------------------
		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (int k1 = 1; k1 <= n; k1 = k * 2) {
					System.out.println("hey");
				}
			}
		}
//---------------------------------------------------------------------
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
			}
		}
//---------------------------------------------------------------------
		
	}
}
