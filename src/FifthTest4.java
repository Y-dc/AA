
import java.util.Scanner;
/**
 * 
* <p>Title: FifthTest4</p>  
* <p>Description: </p>  
* 硬币最小数量
Description

Given the list of coins of distinct denominations and total amount of money. Output the minimum number of coins required to make up that amount. Output -1 if that money cannot be made up using given coins. You may assume that there are infinite numbers of coins of each type.


Input

The first line contains 'T' denoting the number of test cases. Then follows description of test cases. Each cases begins with the two space separated integers 'n' and 'amount' denoting the total number of distinct coins and total amount of money respectively. The second line contains N space-separated integers A1, A2, ..., AN denoting the values of coins. 

Constraints:1<=T<=30，1<=n<=100，1<=Ai<=1000，1<=amount<=100000


Output

Print the minimum number of coins required to make up that amount or return -1 if it is impossible to make that amount using given coins.


Sample Input 1 

2
3 11
1 2 5
2 7
2 6
Sample Output 1

3
-1
* @author ydc   
* @date 2019年11月28日
 */
public class FifthTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases>0) {
			cases--;
			String[] str1 = input.nextLine().split(" ");
			int n = Integer.valueOf(str1[0]);
			int sum = Integer.valueOf(str1[1]);
			String[] str2 = input.nextLine().split(" ");
			int[] coins = new int[str2.length];
			for(int i=0;i<coins.length;i++) {
				coins[i] = Integer.valueOf(str2[i]);
			}
			System.out.println(coinChange(coins, sum));
		}
	}
	
	public static int coinChange(int[] coins, int amount) {
        // 无效输入的处理
        if (amount == 0)
            return 0;
        if (coins == null || coins.length == 0)
            return -1;
            
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j] && dp[i - coins[j]] != -1)
                    min = Math.min(min, dp[i - coins[j]] + 1);
            }
            
            // 根据min的值判断是否能兑换
            dp[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return dp[amount];
        
    }
}
