import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * todo コンストラクタについて勉強する
 * 
 * @author aiko0703ff
 *
 */

public class KitaJavaQ7 {
	public static void main(String[] args) throws IOException {
		/**
		 * date　20180821
		 * 帰りの電車10分くらい
		 */
////		Q 7-1
//		Dog dog = new Dog("柴犬");
////		dog.SetName("藍子");
////		dog.ShowProfile();
//		
////		Q7-2
//		dog.SetName("aiko");
//		dog.SetOld(24);
////		dog.ShowProfile();
//		
////		Q7-3
////		Dog dog2 = new Dog();
////		dog2.SetName("konatsu");
////		dog2.SetOld(8);
////		dog2.ShowProfile();
//		
////		Q7-4 解答少し参考に
//		dog.ShowProfile();
		
		/**
		 * Date 20180822
		 * 
		 */
		/**
		 * Q７−５
		 * 
		 */
		BufferedReader br = new BufferedReader(
	            new InputStreamReader( System.in ) );
		CoinCase coin = new CoinCase();
		for(int c = 0; c < 10; c++) {
			
			System.out.print("何枚ですか？");
			int manyYens = Integer.parseInt(br.readLine());
			System.out.print("どの硬貨ですか？数字で記入してください");
			int coinKind = Integer.parseInt(br.readLine());

			coin.AddCoins(coinKind, manyYens);
			coin.AddCount(manyYens);

		}
		//　途中から
		System.out.println("終わり");
		
		System.out.println("500円は"+ coin.GetCoins(500) + "枚です。総額は" + coin.GetAmount(500) + "円です");
		System.out.println("100円は"+ coin.GetCoins(100) + "枚です。総額は" + coin.GetAmount(100) + "円です");
		System.out.println("50円は"+ coin.GetCoins(50) + "枚です。総額は" + coin.GetAmount(50) + "円です");
		System.out.println("10円は"+ coin.GetCoins(10) + "枚です。総額は" + coin.GetAmount(10) + "円です");
		System.out.println("5円は"+ coin.GetCoins(5) + "枚です。総額は" + coin.GetAmount(5) + "円です");
		System.out.println("1円は"+ coin.GetCoins(1) + "枚です。総額は" + coin.GetAmount(1) + "円です");
		
		System.out.println("合計で"+ coin.GetCount() + "枚で、総額は" + coin.GetAmount() + "円です");
		
	}	
}

//class Dog
//{
//    private String Name;
//    private int Old;
//    private String DogKinds;
//
//    public void SetName( String nm )
//    {
//        Name = nm;
//    }
//    
//    public void SetOld( int num) {
//    	Old = num;
//    }
//
//    public Dog(String dk) {
//    	DogKinds = dk;
//    }
//    public void ShowProfile()
//    {
//    	System.out.println( "犬種は、" + DogKinds + "です。" );
//    	System.out.println( "名前は、" + Name + "です。" );
//        System.out.println( "年齢は、" + Old + "です。" );
//    }
//}

class CoinCase {
	private int CoinKinds;
	private int Yen500;
	private int Yen100;
	private int Yen50;
	private int Yen10;
	private int Yen5;
	private int Yen1;
	private int Count;
	
	public void AddCoins(int ck, int my) {
		switch(ck) {
		case 500:
			Yen500+=my;
			break;
		case 100:
			Yen100+=my;
			break;
		case 50:
			Yen50+=my;
			break;
		case 10:
			Yen10+=my;
			break;
		case 5:
			Yen5+=my;
			break;
		case 1:
			Yen1+=my;
			break;
		}
	}
	public int GetCoins(int ck) {
		//コインの枚数を求める方法とは？
		switch(ck) {
		case 500:
			return Yen500;
		case 100:
			return Yen100;
		case 50:
			return Yen50;
		case 10:
			return Yen10;
		case 5:
			return Yen5;
		case 1:
			return Yen1;
		}
		return 0;
	}
	public int GetAmount() {
		return (Yen500 * 500) + (Yen100 * 100) + (Yen50 * 50) + (Yen10 * 10) + (Yen5 * 5) + Yen1;
	}
	public int GetAmount(int ck) {
		switch(ck) {
		case 500:
			return Yen500 * 500;
		case 100:
			return Yen100 * 100;
		case 50:
			return Yen50 * 50;
		case 10:
			return Yen10 * 10;
		case 5:
			return Yen5 * 5;
		case 1:
			return Yen1;
		}
		return 0;
	}
	public void AddCount(int my) {
		Count += my;
	}
	// Q7-6途中 20180823朝完了
	public int GetCount() {
		return Count;
	}
}