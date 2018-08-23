import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KitaJavaQ5 {
	public static void main (String[] args) throws IOException{
		/*
		 * Date: August 4th
		 * Time:14min
		 */
		
//		Q5-1 
		/*
		 * l22に問題あるらしい
		 */
//		System.out.println("Q5-1" + "");
		BufferedReader br = new BufferedReader(
	            new InputStreamReader( System.in ) );
//		int result [] = new int [10];
//		for (int i = 0; i < 10; i++) {
//			int number = Integer.parseInt(br.readLine());
//			result [i] = number;
//		}
//		
//		for (int o = 0; o < 10; o++) {
//			System.out.print(" " + result[o] * 2);
//		}
		
//		Q5-2
//		System.out.println("Q5-2" + "");
//		int result2 [] = new int [10];
//		for (int j = 9; j > -1; j--) {
//			int number2 = Integer.parseInt(br.readLine());
//			result2 [j] = number2;
//		}
//		for (int o = 0; o < 10; o++) {
//			System.out.print(" " + result2[o]);
//		}
		
//		Q5-3
//		System.out.println("Q5-3" + "");
//		int result [] = new int [10];
//		for (int i = 0; i < 10; i++) {
//			result [i] = Integer.parseInt(br.readLine());
//		}
//		
//		for (int o = 0; o < 10; o++) {
//			if (result[o] % 2 == 0) {
//				System.out.print("偶数：" + result[o]);
//			} else {
//				System.out.print("奇数：" + result[o]);
//			}
//		}
		
//		解答を見ながら解いた
//		System.out.println("Q5-3" + "");
//		int result [] = new int [10];
//		for (int i = 0; i < 10; i++) {
//			result [i] = Integer.parseInt(br.readLine());
//		}
//		
//		System.out.println("偶数：");
//		for (int o = 0; o < 10; o++) {
//			if (result[o] % 2 == 0) {
//				System.out.print(result[o] + " ");
//			} 
//		}
//		System.out.println("");
//		System.out.println("奇数：");
//		for (int o = 0; o < 10; o++) {
//			if (result[o] % 2 != 0) {
//				System.out.print(result[o] + " ");
//			} 
//		}
		/*
		 * Date 2018/08/07
		 * Time 10min
		 */
		
//		Q5-4　やり直し
//		System.out.println("Q5-4" + " ");
//		int num [] = new int [10];
//		int sum = 0;
//		int count = 0;
//		for (int i = 0; i < 10; i++) {
//			num [i] = Integer.parseInt(br.readLine());
//			sum += num [i];
//			count += i;
////			下記の場合でも配列に代入されるようになっている
////			解答見て。。下をfor文の条件に入れ込む
//			if (sum > 100) {
//				break;
//			}
//		}
//		for (int result: num) {
//			System.out.println(result);
//		}
		
//		やり直し while文でやってみた
//		System.out.println("Q5-4" + " ");
//		int num [] = new int [10];
//		int sum = 0;
//		int count = 0;
//		while (sum < 100 && count < 10) {
//			num [count] = Integer.parseInt(br.readLine());
//			sum += num [count];
//			count++;
//		}
//		for (int i = 0; i < count; i++) {
//			System.out.print(num[i] + " ");
//		}
		
//		Date: 20180808
//		Q5-5 
//		int value = Integer.parseInt( br.readLine() );
//		int binary[] = new int[16];
//		// 配列 binaryに0か1を代入する
//		
//		for (int h = 15; h > 0; h--) {
//			binary[h] = value / 2;
//			if (value % 2 != 0) {
//				value = value % 2;
//			}
//			
//		}
//
//		for( int i = 0 ; i < 16 ; i++ ) {
//			System.out.print( binary[i] );
//		}
		
//		微妙に違う
//		int value = Integer.parseInt( br.readLine() );
//		int binary[] = new int[16];
//		// 配列 binaryに0か1を代入する
//		
//		for (int i = 15; i > 0; i--, value /= 2) {
//			binary[i] = value %2;
//		}
//
//		for( int i = 0 ; i < 16 ; i++ ) {
//			System.out.print( binary[i] );
//		}
		
//		Q5-6
////		次のコードに追加し、九九表を表示するプログラムを完成させなさい。
//
//		int kuku[][] = new int[9][];
//
//		// 配列 kuku に値を代入する
//
//		for( int i = 0 ; i < 9 ; i++ )
//		{
//			kuku[i] = new int [9];
//		    for( int j = 0 ; j	< 9 ; j++ ) {
//		    	kuku[i][j] = (i + 1) * (j + 1);
//		    	 System.out.printf( " %2d", kuku[i][j] );
//		    }
//		       
//		    System.out.println();
//		}
//		
////		Q5-7　167行目にミスあり
////		どうにか解決
//		System.out.println("Q5-7");
//		for( int i = 0 ; i < 9 ; i++ )
//		{
//			kuku[i] = new int [9];
//		    for( int j = 0 ; j	< 9 ; j++ ) {
//		    	kuku[i][j] = (i + 1) * (j + 1);
//		    	 System.out.printf( " %2d", kuku[i][j] );
//		    }
//		       
//		    System.out.println();
//		}
//		int h = Integer.parseInt(br.readLine());
//		int k = Integer.parseInt(br.readLine());
//		int num[][] = new int[9][9];
//		num[h][k] = (h) * (k);
//		System.out.println(num[h][k]);
		
//		Q5-8 186行目にミスあり もう一度とく
//		System.out.println("Q5-8");
//		int tenNumbers[] = new int[10];
//		int n;
//		for (n = 0; n <= 10; n++) {
//			tenNumbers[n] = Integer.parseInt(br.readLine());
//			n++;
//		}
//		System.out.println(tenNumbers[n]);
		/**
		 * 再チャレンジ
		 * 2018年8月16日
		 * 解答チェック
		 */
		System.out.println("Q5-8：10回文字を入力してください");
		int tenNumbers[] = new int[10];
		int n;
		for (n = 0; n < 10; n++) {
			tenNumbers[n] = Integer.parseInt(br.readLine());
			for (int m = 0; m < 10; m++) {
				if (n != 0 && tenNumbers[n] < tenNumbers[m]) {
					int num = tenNumbers[n];
					tenNumbers[n] = tenNumbers[m];
					tenNumbers[m] = num;
				}
			}
		}
		for (n = 0; n < 10; n++)
		System.out.print(tenNumbers[n] + " ");
	}
}
