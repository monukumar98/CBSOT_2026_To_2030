package Lec26;
import java.util.*;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 2,3,6,7 };
		int amount = 7;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans  = new ArrayList<>();
		Combinatons(coins, amount,ll,ans,0);
		System.out.println(ans);

	}

	public static void Combinatons(int[] coins, int amount, List<Integer> ll,List<List<Integer>> ans,int idx) {
		if (amount == 0) {
		//	System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}

		for (int i = idx; i < coins.length; i++) {
			if (amount >= coins[i]) {
				ll.add(coins[i]);
				Combinatons(coins, amount - coins[i],ll,ans,i);
				ll.remove(ll.size()-1);
			}

		}

	}

}
