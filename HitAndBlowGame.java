package hitAndBlow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HitAndBlowGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int HIT = 0;
		int BLOW = 0;
		
		List<Integer>number6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		Collections.shuffle(number6);
		
		List<Integer>number4 = new ArrayList<>();
		for(int i=0; i<4; i++) {
			number4.add(number6.get(i));
		}
	
		
		System.out.println("1～6までの4桁の数字を入力してください。");
		System.out.println("各桁の数字がピッタリ合っていればHIT");
		System.out.println("数字が合っていて桁の場所が違えばBLOW");
		
		while(HIT != 4) {
			String player = sc.next();
			List<Integer>number = new ArrayList<>();
			number.add(Integer.parseInt(player.substring(0,1)));
			number.add(Integer.parseInt(player.substring(1,2)));
			number.add(Integer.parseInt(player.substring(2,3)));
			number.add(Integer.parseInt(player.substring(3,4)));
			
			HIT = 0;
			BLOW = 0;
			
			
			for(int i=0; i<4; i++) {
				if(number4.get(i) == number.get(i)) {
					HIT++;					
				}				
			}
			for(int i=0; i<4; i++) {
				if(number4.contains(number.get(i)) && number4.get(i) != number.get(i)) {
					BLOW++;
				}
			}
		System.out.println("HIT"+HIT+","+"BLOW"+BLOW);	
		}
		System.out.println("全部の数字が当たりました！！！");
	}

}
