package Lec26;

public class Coin_Combinatons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 2, 3, 5 };
		int amount = 8;
		Combinatons(coins, amount, "",0);

	}

	public static void Combinatons(int[] coins, int amount, String ans,int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < coins.length; i++) {
			if (amount >= coins[i]) {
				Combinatons(coins, amount - coins[i], ans + coins[i],i);
			}

		}

	}

}
