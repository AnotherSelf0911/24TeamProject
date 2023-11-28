package shopingmall;

import java.util.HashSet;

public class SetNumber {

	public static void main(String[] args) {
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		while(true) {
			int v = (int) (Math.random()*45+1);
			
			hashset.add(v);
			
			if(hashset.size() >= 6) {
				break;
			}
		}
		System.out.println(hashset);

	}

}
