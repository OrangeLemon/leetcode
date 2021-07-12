package _04_dp_动态规划._322_找零钱_1;

import java.util.Arrays;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if(amount == 0 ) return 0;
        Arrays.sort(coins);
        for(int i=coins.length -1;i>0;i--) {
            int count = coinChange(coins, amount, i);
            if(count > 0 ) {
                return count;
            }
        }
        return -1;

    }

    public static int coinChange(int[] coins, int amount, int max) {
        int count = 0;
        int sum = 0;
        while(sum < amount) {
            if(sum + coins[max] == amount) {
                return ++count;
            } else if(sum + coins[max] < amount) {
                sum += coins[max];
                count++;
            } else if(sum + coins[max] > amount && max>0) {
                max--;
            } else {
                return -1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{186,419,83,408},6249));
    }
}
