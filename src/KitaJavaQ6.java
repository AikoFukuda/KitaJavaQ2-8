import java.io.*;
/**
 * Date 20180817
 * Time 20min
*/
public class KitaJavaQ6 {
	public static void main (String[] args) throws IOException {
		
//		System.out.println("Q6-1");
//		System.out.println("7の累乗は" + number(7));
//		
//		System.out.println("Q6-2");
//		System.out.println("2つの数の平均値は" + average(8, 3));
//		
//		System.out.println("Q6-3");
//		System.out.println("大きい数は" + biggestNum(1, 4));
//		
//		System.out.println("Q6-4");
//		System.out.println(3);
//		triangle(3);
//		System.out.println(4);
//		triangle(4);
//		System.out.println(5);
//		triangle(5);
//		
//		System.out.println("Q6-5");
//		System.out.println(5);
//		makeTriangle(5, 'a');
//
//		System.out.println(6);
//		makeTriangle(6, 'b');
//
//		System.out.println(7);
//		makeTriangle(7, 'c');
//		
//		System.out.println("Q6-6");
//		kuku(8);
		
		System.out.println("Q6-7");
		sosu(11);
		for(int s = 10000; s < 10100; s++) {
			if(sosu(s)) {
				System.out.print(s + " ");
			}
		}
		System.out.println("");
		
		System.out.println("Q6-8");
		for (int n = 11; n < 20; n++) {
			System.out.println(fibo(n) + "");
		}
		
	}
	static int number(int n){
		return n * n;
	}
	
	static int average(int a, int b) {
		return (a + b)/2;
	}
	
	static int biggestNum (int x, int y) {
		int z = 0;
		if ( x > y) {
			z = x;
		} else if (x < y) {
			z = y;
		}
		return z;
	}
	/**
	 * date: 20180820
	 * 
	 */
	
	// Q6-4
	static void triangle(int t) {
		for (int num = 1; num <= t; num++) {
			for(int d = 1; d <= num; d++) {
				System.out.print("$");
			}
		System.out.println(" ");
		}
	}
	
	//Q6-5
	static void makeTriangle(int m, char letters) {
		for (int num = 1; num <= m; num++) {
			for(int d = 1; d <= num; d++) {
				System.out.print(letters);
			}
		System.out.println(" ");
		}
	}

	//Q6-6
	static void kuku(int k) {
		for (int n = 1; n < 10; n++) {
			System.out.println(k * n);
		}
	}
	
	//Q6-7
	static boolean sosu(int s) {
		for (int check = 2; check <= s; check++) {
			if (s % check == 0 && check < s) {
//				System.out.println(s + "は素数ではありません");
				return false;
			} else if (s % check == 0 && check == s) {
//				System.out.println(s + "は素数です");
				return true;
			}
		}
		return true;
	}
	
	// Q6-8
	static void fibonacci(int f) {
		int first = 0;
		int second = 1;
		int third = 0;
		f = 0;
		while(f == 20) {
			first = second;
			second = third;
			third = first + second;
			f++;
			if (f > 11 && f < 20) {
				System.out.println(third);
			}
		}
	}
	// うまくいかず。解答を参考に解いてみる
	static int fibo(int ff) {
		if (ff == 0) {
			return 0;
		} else if (ff == 1) {
			return 1;
		} else {
			//　1つ前と2つ前を合わせてできる数が現在の数
			// 例えば11の場合、11の項の1つ前と2つ前を足すことになる
			// このreturnでまた新たなフィボナッチの数を探しに行って最終的には0.1に戻る
			return fibo(ff-2) + fibo(ff-1);
		}
	}
}
