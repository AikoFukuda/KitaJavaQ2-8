/*
 * Date: 2018/7/29
 * Time: 74min
 */
import java.io.*;

public class KitaJavaQ3 {
	public static void main (String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(
	            new InputStreamReader( System.in ) );
		
//		Q3-1
//		System.out.println("数字を入力してください");
//		int firstNumber = Integer.parseInt(br.readLine());
//		System.out.println("もう一度数字を入力してください");
//		int secondNumber = Integer.parseInt(br.readLine());
//		
//		if (firstNumber > secondNumber) {
//			System.out.println(firstNumber + "は" + secondNumber + "より大きい");
//		}s
		
//		Q3-2
//		System.out.println("数字を入力してください");
//		int firstN = Integer.parseInt(br.readLine());
//		System.out.println("もう一度数字を入力してください");
//		int secondN = Integer.parseInt(br.readLine());
//		
//		if (firstN > secondN) {
//			System.out.println(firstN);
//		} else if (secondN > firstN) {
//			System.out.println(secondN);
//		} else {
//			System.out.println("どっちでもないらしい");
//		}
		
//		Q3-3
//		System.out.println("数字を入力してください");
//		int firstNum = Integer.parseInt(br.readLine());
//		System.out.println("もう一度数字を入力してください");
//		int secondNum = Integer.parseInt(br.readLine());
//		
//		if (firstNum > secondNum) {
//			System.out.println(firstNum + "は" + secondNum + "より大きい");
//		} else if (secondNum > firstNum) {
//			System.out.println(firstNum + "は" + secondNum + "より小さい");
//		} else {
//			System.out.println("どっちでもないらしい");
//		}
		
//		Q3-4
//		System.out.println("数字を入力してください");
//		int firstNum = Integer.parseInt(br.readLine());
//		System.out.println("もう一度数字を入力してください");
//		int secondNum = Integer.parseInt(br.readLine());
//		
//		if (firstNum > secondNum) {
//			System.out.println(firstNum + "は" + secondNum + "より大きい");
//		} else if (secondNum > firstNum) {
//			System.out.println(firstNum + "は" + secondNum + "より小さい");
//		} else {
//			System.out.println(firstNum + "は" + secondNum + "より等しい");
//		}
		
//		Q3-5
//		System.out.println("正の整数値を入力してください");
//		int firstNum = Integer.parseInt(br.readLine());
//		
//		if (firstNum % 2 == 0) {
//			System.out.println("偶数です");
//		} else {
//			System.out.println("奇数です");
//		}
		
//		Q3-6
///		System.out.println("数字を入力してください");
//		int firstNum = Integer.parseInt(br.readLine());
//		
//		if (firstNum > 0 && firstNum % 2 == 0) {
//			System.out.println("正の偶数");
//		} else if (firstNum > 0 && firstNum % 2 != 0) {
//			System.out.println("正の奇数");
//		} else if (firstNum < 0 && firstNum % -2 == 0) {
//			System.out.println("負の偶数");
//		} else if (firstNum < 0 && firstNum % 2 != 0) {
//			System.out.println("負の奇数");
//		}
		
////		Q3-7
//		System.out.println("数字を入力してください");
//		int score = Integer.parseInt(br.readLine());
//		
////		case 1
//		if (score >= 60) {
//			System.out.println("合格");
//		} else {
//			System.out.println("不合格");
//		}
//		
////		case 2
//		if (score >= 80) {
//			System.out.println("大変よくできました");
//		} else if (score >= 60 && score < 80) {
//			System.out.println("よくできました");
//		} else if (60 > score) {
//			System.out.println("残念でした");
//		}
//		
////		case 3
//		if (score >= 80) {
//			System.out.println("優");
//		} else if (score >= 70 && score < 80) {
//			System.out.println("良");
//		} else if (score >= 60 && score < 70) {
//			System.out.println("可");
//		} else if (60 > score) {
//			System.out.println("不可");
//		}
		
//		Q3-8
//		System.out.println("中間テストの点数を入力してください");
//		int midExam = Integer.parseInt(br.readLine());
//		System.out.println("期末テストの点数を入力してください");
//		int finalExam = Integer.parseInt(br.readLine());
//		
//		if (midExam >= 60 && finalExam >= 60) {
//			System.out.println("合格");
//		} else if (midExam + finalExam >= 130) {
//			System.out.println("合格");
//		} else if (midExam + finalExam >= 100 && midExam >= 90 || finalExam >= 90) {
//			System.out.println("合格");
//		} else {
//			System.out.println("不可");
//		}
		
//		Q3-9
//		System.out.println("何曜日ですか？日曜日なら0以下、月曜は1、火曜は2、水曜は3、木曜は4、金曜は5、土曜は６");
//		int day = Integer.parseInt(br.readLine());
//		System.out.println("いつですか？午前なら0以下、午後は1、夜間は2");
//		int time = Integer.parseInt(br.readLine());
//		
//		if (day == 0) {
//			System.out.println("休診");
//		} else if (day == 1 || day == 4) {
//			System.out.println("空いてます");
//		} else if (day == 2 || day == 5 && time == 0) {
//			System.out.println("休診");
//		} else if (day == 2 || day == 5 && time != 0) {
//			System.out.println("空いてます");
//		} else if (day == 3 && time != 2) {
//			System.out.println("空いてます");
//		} else if (day == 3 && time == 2) {
//			System.out.println("休診");
//		} else if (day == 6 && time == 0) {
//			System.out.println("空いてます");
//		} else if (day == 6 && time != 0) {
//			System.out.println("休診");
//		} else {
//			System.out.println("もう一度最初からやり直してください");
//		}
		
//		Q3-10
//		System.out.println("数字を入力してください");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println("もう一度数字を入力してください");
//		int y = Integer.parseInt(br.readLine());
//		
//		if(x < y && x % 2 == 0 && y % 2 == 0) {
//			System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
//		} else if (x == y && x < 0 && y < 0) {
//			System.out.println( "xとyは等しく、かつ、負の数である。" );
//		} else if (x < y || x % 2 == 0) {
//			System.out.println( "xはyより小さい、または、xは偶数である。" );
//		} else if(x <= 10 || 100 <= x && y >= 10 && y <= 100) {
//			System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
//		} else if (x < 0 && y < 0) {
//			System.out.println( "xもyも負の数である、ではない。" );
//		}
		
//		Q3-11
//		System.out.println("月を入力してください");
//		int month = Integer.parseInt(br.readLine());
//		
//		switch (month) {
//		case 1:
//			System.out.println("１月：元日、成人の日");
//		case 2:
//			System.out.println("２月：建国記念の日");
//		case 3:
//			System.out.println("３月：春分の日");
//		case 4:
//			System.out.println("４月：昭和の日");
//		case 5:
//			System.out.println("５月：憲法記念日、みどりの日、こどもの日");
//		case 6:
//			System.out.println("");
//		case 7:
//			System.out.println("７月：海の日");
//		case 8:
//			System.out.println("");
//		case 9:
//			System.out.println("９月：敬老の日、秋分の日");
//		case 10:
//			System.out.println("１０月：体育の日");
//		case 11:
//			System.out.println("１１月：文化の日、勤労感謝の日");
//		case 12:
//			System.out.println("１２月：天皇誕生日");
//		}
		
//		Q3-12
		System.out.println("Whats your favorite sushi? 1鮭 2鯛 3烏賊 4鮪");
		int sushi = Integer.parseInt(br.readLine());
		
		switch (sushi) {
		case 1:
			System.out.println("オレンジー");
			break;
		case 2:
			System.out.println("白身のお魚");
			break;
		case 3:
			System.out.println("ゲソが美味しい");
			break;
		case 4:
			System.out.println("赤身がいいよねトロトロ");
			break;
		}
		
//		Q3-13
		System.out.println("月を入力してください");
		int monthDate = Integer.parseInt(br.readLine());
//		
		switch (monthDate) {
		case 1:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 3:
			System.out.println("31");
			break;
		case 4:
			System.out.println("30");
			break;
		case 5:
			System.out.println("31");
			break;
		case 6:
			System.out.println("30");
			break;
		case 7:
			System.out.println("31");
			break;
		case 8:
			System.out.println("31");
			break;
		case 9:
			System.out.println("30");
			break;
		case 10:
			System.out.println("31");
			break;
		case 11:
			System.out.println("30");
			break;
		case 12:
			System.out.println("31");
			break;
		default:
			System.out.println("1~12の間の数字を入力しましょう");
			
		}
		    
	}
}
