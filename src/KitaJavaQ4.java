import java.io.*;

/*
 * Date 2018/07/30
 * Time 53min 1~10
 * 時間がかかった問題：4-7, 4-8
 * 理由：最大値の求め方と累乗の求め方、短く書けないものかと思った
 */
public class KitaJavaQ4 {
	public static void main (String[] args) throws IOException {
//		Q4-1
//		for (int i=0; i<10; i++) {
//			System.out.println("SPAM");
//		}
		
//		Q4-2
//		for (int t = 1; t < 10; t++) {
//			System.out.println(3 * t);
//		}
		
//		Q4-3
//		for (int s = 1; s < 9; s++) {
////			戻り値が.0になる
//			System.out.println(Math.pow(2, s));
//		}
		
//		Q4-4
//		int sum = 7;
//		for (int se = 6; se > 0; se--) {
//			sum *= se;
//		}
//		System.out.println("7の階乗は" + sum);
		
//		Q4-5
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
//		int averageSum = 0;
//		
//		for (int ave = 0; ave < 10; ave++) {
//			System.out.println("数字を入力してね");
//			int number = Integer.parseInt(br.readLine());
//			averageSum += number;
//		}
//		System.out.println("平均は" + averageSum/10);
		
//		Q4-6
//		int lose = 0;
//		int win = 0;
//		for (int g = 0; g < 10; g++) {
//			System.out.println("0か1を入力してね");
//			int game = Integer.parseInt(br.readLine());
//			if (game == 0) {
//				lose += 1;
//			} else if (game == 1) {
//				win  += 1;
//			}
//		}
//		System.out.println("勝ち" + win + "件、負け" + lose + "件");
		
//		Q4-7
//		int kyojin = 0;
//		int hanshin = 0;
//		for (int g = 1; g < 9; g++) {
//			System.out.print(g + "回表、巨人の得点は？");
//			int giants = Integer.parseInt(br.readLine());
//			kyojin += giants;
//			System.out.print(g + "回裏、阪神の得点は？");
//			int tigers = Integer.parseInt(br.readLine());
//			hanshin += tigers;
//		}
//		System.out.println("巨人：" + kyojin + "点、阪神：" + hanshin + "点");
//		if (hanshin > kyojin) {
//			System.out.println("阪神の勝ち");
//		} else if (kyojin > hanshin) {
//			System.out.println("巨人の勝ち");
//		} else {
//			System.out.println("ひきわけ");
//		}
		
//		Q4-8
//		for (int num = 0; num < 10; num++) {
//			System.out.println("入力してね");
//			int number = Integer.parseInt(br.readLine());
//			int max = Math.max(max, number);
//		}
//		System.out.println("最大値は" + max);
		
//		Q4-9
		int max = 0;
		int min = 10;
		for (int num = 0; num < 10; num++) {
			System.out.println("入力してね");
			int number = Integer.parseInt(br.readLine());
			max = Math.max(max, number);
			min = Math.min(min, number);
		}
		System.out.println("最大値は" + max + "最小値は" + min);
//		Q4-10
//		int num = Integer.parseInt(br.readLine());
//		for (int n = 0; n < num; n++) {
//			System.out.print("*");
//		}
		
		/*
		 * Date: 2018/07/31
		 * Time:　10min 30sec
		 */
		
//		Q4-11 考える
/*
 * 		個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。
 * 		数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
 * 
 * 		途中までしかできん
 */
		
//		int insert = Integer.parseInt(br.readLine());
//		for (int i = 0; i < insert; i++) {
//			if (i > 9) {
//				System.out.print(i-10);
//			} else {
//				System.out.print(i);
//			}
//		}
//		解答見て
//		int insert = Integer.parseInt(br.readLine());
//		for (int i = 0; i < insert; i++) {
//			System.out.print(i % 10);
//		}
		
//		Q4-12
//		int sum = 100;
//		for (int n = 0;  sum > 1; n++) {
//			System.out.println("入力してね");
//			int num = Integer.parseInt(br.readLine());
//			sum -= num;
//		}
//		System.out.println(100 - sum);
		
//		Q4-13 //わからん
/*
 * ストライク・カウントを数えるプログラムを作成しなさい。

*	１球ごとにストライクかボールかを入力する。
*	３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
 */
		
//		int strike = 0;
//		int ball = 0;
//		System.out.println(100);
//		for (int b = 0; strike > 3; b++) {
//			System.out.println("ストライク=1 or ボール=2 ？");
//			int baseball = Integer.parseInt(br.readLine());
//			if (baseball == 1) {
//				strike += 1;
//			} else if (baseball == 2) {
//				ball += 1;
//			}
//			if (strike == 3) {
//				break;
//			} else if (ball == 3) {
//				break;
//			}
//		}
//		もう一度考えて見た
//		int strike = 3;
//		int ball = 4;
		
//		答え見て解き直し
//		int strike = 0;
//		int ball = 0;
//		while (strike < 3 && ball < 4) {
//			System.out.println("ストライク=1 or ボール=2 ？");
//			int baseball = Integer.parseInt(br.readLine());
//			if (baseball == 1) {
//				strike += 1;
//			} else if (baseball == 2) {
//				ball+= 1;
//			}
//		}
//		System.out.println("ストライク=" + strike + " ボール" + ball);
		
		
//		Q4-14 //上の問題と連携
		/*
		 * １球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
			ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
			３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
		 */
//		int strike = 0;
//		int ball = 0;
//		int faul = 0;
//		while (strike < 3 && ball < 4) {
//			System.out.println("ストライク=1 or ボール=2 ？");
//			int baseball = Integer.parseInt(br.readLine());
//			if (baseball == 1) {
//				strike += 1;
//			} else if (baseball == 2) {
//				ball+= 1;
//			} else if (baseball == 3 && strike < 2) {
//				strike += 1;
////			} else if (baseball == 3 && strike < 3) {
////				faul += 1;
//			}
//		}
//		System.out.println("ストライク=" + strike + " ボール" + ball);
		
//		Q4-15 // 素数の判定方法がわからない
//		int number = Integer.parseInt(br.readLine());
//		if (number) {
//			
//		}
//		結局答え見てやって見た
//		int number = Integer.parseInt(br.readLine());
//		int n;
////		ここがよくわからんわかるようで。。。
//		for (n = 2; n <= (number / 2); n++) {
//			if ((number % n) == 0) {
//				break;
//			}
//		}
//		if(n > (number / 2)) {
//			System.out.println(number + "は素数です");
//		} else {
//			System.out.println(number + "は素数ではありません");
//		}
			
//		Q4-16 答え見ながらやった！
//		int number = Integer.parseInt(br.readLine());
//		int x;
//		for (x = 2; number > 1; x++) {
//			while((number % x) == 0) {
//				System.out.println(x + "");
//				number/= x;
//			}		
//		}
		
//		Q4-17 九九を表示する
//		for (int q = 1, int w = 1; q < 9 w<9; q++) {
//			System.out.printf("%2d", args)
//		}
//		答え見て閃いた
//		for (int q = 1; q < 10; q++) {
//			for (int  p= 1; p < 10; p++) {
//				System.out.printf("%2d ", p*q);
//			}
//			System.out.println();
//		}
		
//		Q4-18
//		for (int num = 0; ) {
//			
//		}
//		while文を使って見るなら
//		System.out.println("問題Q4-18 数字を入力してね");
//		int num = Integer.parseInt(br.readLine());
//		int total = 0;
//		while (num > 0) {
//			System.out.println("数字を入力してね");
//			num = Integer.parseInt(br.readLine());
//			total += num;
//		}
//		System.out.println("合計で" + total);
		
//		Q4-19
//		System.out.println("問題Q4-19 数字を入力してね");
//		int num = Integer.parseInt(br.readLine());
//		int total = 0;
//		int count = 0;
//		while (num > 0) {
//			count++;
//			System.out.println("数字を入力してね");
//			num = Integer.parseInt(br.readLine());
//			total += num;	
//		}
//		System.out.println("平均は" + total/count);
			
//		Q4-20 TODO
		/**
		 * 初期値は1
		 * 最大は入力値
		 * 段数＝入力値
		 */
		System.out.println("Q4-20");
		int doller = Integer.parseInt(br.readLine());
		int start = 1;
		for (int s = 1; s <= doller; s++) {
			for (int d = 1; d <= s; d++) {
				System.out.print("$");
			}
			System.out.println(" ");
		}
		
//		Q4-21 TODO
//		System.out.println("Q4-21");
////		解答見ました
//		int xNum = Integer.parseInt(br.readLine());
//		for (int a = 0; a < xNum; a++) {
//			for (int b = 0; b < xNum; b++) {
//				// なぜそうなるのか？
//				if (a==b || (xNum - a - 1)==b) {
//					System.out.print("X");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println("");
//		}
		
//		Q4-22 TODO
//		System.out.println("Q4-22");
//		int total = 0;
//		int firstNum = 0;
//		int secondNum = 1;
//		
//		System.out.print(firstNum + " ");
//		while (secondNum < 1000) {
//			System.out.print(secondNum + " ");
//			int thirdNum = firstNum + secondNum;
//			firstNum = secondNum;
//			secondNum = thirdNum;
//			
//		}
		
	
	}
}
