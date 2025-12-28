// package HomeWork_11Dec;

// public class A {
// 	int b = 20;
// 	void m1() {
// 		int c = 78;
// 		System.out.println(b);
// 	}
// 	void m2() {
// 		System.out.println(b);

// 		System.out.println(c);
// 	}
// }


//sollution:
package HomeWork_11Dec;

public class A {
	int b = 20;
	void m1() {
		int c = 78;
		System.out.println(b);
		m2(c);
	}
	void m2(int c) {
		System.out.println(b);

		System.out.println(c);
	}
}