/*-< 演習：Ex1_15_2 >---------------------------------
コメントに従って2次元配列からデータを抽出して画面に表示するプログラムを作ってください。
----------------------------------------------------*/
import java.util.List;
import java.util.ArrayList;

class Ex1_15_2{
	public static void main (String[] args) {
		
		/*
		**犬の情報を持つ配列。格納されている情報は以下のとおり。
		**  - dogs[x][0]：名前
		**  - dogs[x][1]：年齢
		**  - dogs[x][2]：性別
		*/
		String[][] dogs = {
		                    {"モコ" , "4歳"  , "メス"} ,
		                    {"ムギ" , "2歳"  , "オス"} ,
		                    {"ブブ" , "3歳"  , "メス"} ,
		                    {"シロ" , "8歳"  , "オス"} ,
		                    {"ブブ" , "3歳"  , "メス"} ,
		                    {"ペロ" , "1歳"  , "メス"} ,
		                    {"ルル" , "14歳" , "オス"} ,
		                    {"モモ" , "10歳" , "メス"} ,
		                    {"ポチ" , "6歳"  , "オス"} ,
		                    {"エル" , "2歳"  , "メス"} 
		                  };
		
		/*以下のプログラムを作成してください。
		**  �@Sring型を扱うArrayList「adultFemaleDogsList」を作成する
		**  �A2次元配列dogsから以下の条件にあてはまる名前を抽出し、すべてadultFemaleDogsListに格納する
		**     - 4歳以上
		**     - メス
		**    ※ヒント：年齢の文字列から「歳」を除去する方法について調べてみよう！
		**  �BadultFemaleDogsListに格納されているすべてのデータをprintlnで表示する
		*/
		
		
		//Sring型を扱うArrayList「adultFemaleDogsList」を作成する
		List<String> adultFemaleDogsList = new ArrayList<String>();
		
		//2次元配列dogsから以下の条件にあてはまる名前を抽出し、すべてadultFemaleDogsListに格納する
		for( int i = 0 ; i < dogs.length ; i++ ){
			
			//4歳以上且つメスである場合、adultFemaleDogsListに名前を格納する
			if( Integer.parseInt( dogs[i][1].replace("歳","") ) >= 4 && dogs[i][2].equals( "メス" ) ){
				
				adultFemaleDogsList.add( dogs[i][0] );
				
			}
			
		}
		
		//adultFemaleDogsListに格納されているすべてのデータをprintlnで表示する
		for( int i = 0 ; i < adultFemaleDogsList.size() ; i++ ){
			
			System.out.println( adultFemaleDogsList.get(i) );
			
		}
	}
}

