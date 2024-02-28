
public class Null01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			String string1;
			//あいうの文字数を出力
			string1 = "あいう";
			System.out.println(string1 + "の文字数:" + string1.length() );
			//NUllの文字数を出力
			string1 = "";
					System.out.println(string1 + "の文字数:" + string1.length() );
					//nullの変数を3章するとぬるぽ
					string1 = null;
					System.out.println(string1 + "の文字数:" + string1.length() );
		
			int[] array1 = new int[3]; //配列の宣言と生成
			array1[0] = 60;
			array1[2] = 20;
			array1[1] = 20;
			int int2 = array1[2]; //配列1のインデックス番号2をint2の整数として宣言
			
			int array2[] = null;
			
			int[] arrray3 = new int[] { 10, 20, 30 };
			int[] array4 = {10, 20 , 30};
			int int3 = array1[0];
			System.out.println(int3);
	}

}
