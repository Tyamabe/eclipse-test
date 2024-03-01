
public class Enzanshi {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 15;
		int c;
		c = a + 3;
		c = a - 5;
		c = a * 2;
		c = a / 6;
		c = a % 4;
		System.out.println(c);
		int d;
		 d = 10;
		 d++; // d = 11
		 d--; // d = 9
		 int e;
		 int f;
		 
		 e = 5;
		 f = ++e; // eをインクリメントして、eがfになる
		 System.out.println(f);
		 f = e++; //eをfに代入した後にeがインクリメントされる
		 int g = 5;
		 boolean h;
		 h = g < 5;
		 h = g == 5;
		 System.out.println(h);
		 String S1 = "100";
		 String S2 = "200";
		 String S3;
		 S3 = S1 + S2; //100200
		 S3 = "あ" + "い"; //あい
		 String S4 = "applePie";
		 String S5 = "applePie";
		 h = S4 == S5;
		 System.out.println(h);
		  h = S4.equals(S5);
		  System.out.println(h); 
		 
	}

}
