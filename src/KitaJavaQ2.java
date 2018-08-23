import java.io.*;

public class KitaJavaQ2
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
//	    Q2-1
        System.out.println("まず数字入れてね！");
        String  s = br.readLine();
		System.out.println(s);
		
//		Q2-2
		System.out.println("とりあえず数字入れてね！");
        int secondQ = Integer.parseInt(br.readLine());
		System.out.println(secondQ);
		
//		Q2-3
		System.out.println("3つ目の数字入れてね！");
        int thirdQ = Integer.parseInt(br.readLine());
		System.out.println("入力したのは" + thirdQ);
		System.out.println("2乗すると" + thirdQ*thirdQ);
		System.out.println("3乗すると" + thirdQ*thirdQ*thirdQ);
		
//       Q2-4
        System.out.println("ほんで数字入れてね！");
        int x = Integer.parseInt(br.readLine());
        System.out.println("もう一度数字入れてね！");
        int y = Integer.parseInt(br.readLine());
		System.out.println("足すと" + (x + y));
		System.out.println("引くと" + (x - y));
		System.out.println("割ると" + (x / y));
        System.out.println("あまりは" + (x % y));
        System.out.println("かけると" + (x * y));
        
//		Q2-5
        System.out.println("そしてまた数字入れてね！");
        int number5x = Integer.parseInt(br.readLine());
        System.out.println("もう一度数字入れてね！");
        int number5y = Integer.parseInt(br.readLine());
        System.out.println("平均は" + (number5x + number5y)/2);

//      Q2-6  
        System.out.println("何歳ですか");
        int old = Integer.parseInt(br.readLine());
        System.out.println("あなたは生まれてから" + (old * 365) + "日たっています");

    }
}