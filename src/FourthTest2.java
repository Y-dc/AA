import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
* <p>Title: ForthTest2</p>  
* <p>Description:
* 订单问题
Description

Rahul and Ankit are the only two waiters in Royal Restaurant. Today, the restaurant received N orders. 
The amount of tips may differ when handled by different waiters, if Rahul takes the ith order, he would 
be tipped Ai rupees and if Ankit takes this order, the tip would be Bi rupees.In order to maximize the 
total tip value they decided to distribute the order among themselves. One order will be handled by one 
person only. Also, due to time constraints Rahul cannot take more than X orders and Ankit cannot take 
more than Y orders. It is guaranteed that X + Y is greater than or equal to N, which means that all the 
orders can be handled by either Rahul or Ankit. Find out the maximum possible amount of total tip money 
after processing all the orders.


Input

• The first line contains one integer, number of test cases.

• The second line contains three integers N, X, Y.

• The third line contains N integers. The ith integer represents Ai.

• The fourth line contains N integers. The ith integer represents Bi.


Output

Print a single integer representing the maximum tip money they would receive.


Sample Input 1 

1
5 3 3
1 2 3 4 5
5 4 3 2 1
Sample Output 1

21
*  
*  </p>  
* @author ydc   
* @date 2019年11月21日
 */
public class FourthTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases>0) {
			cases--;
			String[] str1 = input.nextLine().split(" ");
			int N = Integer.valueOf(str1[0]);
			int X = Integer.valueOf(str1[1]);
			int Y = Integer.valueOf(str1[2]);
			String[] str2 = input.nextLine().split(" ");
			int[] A = new int[N];
			String[] str3 = input.nextLine().split(" ");
			int[] B = new int[N];
			for(int i=0;i<N;i++) {
				A[i] = Integer.valueOf(str2[i]);
				B[i] = Integer.valueOf(str3[i]);
			}
			myway(N, X, Y, A, B);
		}
	}

	public static void myway(int N,int X,int Y,int[] A,int[] B) {
		int[] div = new int[N];
		int Ac = 0;
		int Bc = 0;
		int sum = 0;
		for(int i=0; i<N; i++) {
			if(A[i] > B[i]) {
				if(Ac<3) {
					div[i] = A[i] - B[i];
					sum = sum + A[i];
					Ac++;
				}
				else {
					int min = 0;
					for(int j=0; j<i;j++) {
						if(div[j]>0 && div[j] < div[min]) {
							min = j;
						}
					}
					if(min < A[i] - B[i]) {
						sum = sum - A[min] + B[min] + A[i];
						Bc++;
						div[min] = B[min] - A[min];
						div[i] = A[i] - B[i];
					}
					else {
						div[i] = B[i] - A[i];
						sum = sum + B[i];
						Bc++;
					}
				}
			}//if(A[i] > B[i])
			else {
				if(Bc<3) {
					div[i] = B[i] - A[i];
					sum = sum + B[i];
					Bc++;
				}
				else {
					int max = 0;
					for(int j=0; j<i;j++) {
						if(div[j]<0 ) {
							if(max == 0) {
								max = div[j];
							}
							if(div[j] > div[max]) {
								max = j;
							}
						}
					}
					if(max > B[i] - A[i]) {
						sum = sum - B[max] + A[max] + B[i];
						Ac++;
						div[max] = A[max] - B[max];
						div[i] = B[i] - A[i];
					}
					else {
						div[i] = A[i] - B[i];
						sum = sum + A[i];
						Ac++;
					}
				}
			}//else(A[i] > B[i])
		}//for
		System.out.println(sum);
	}
	

}
/*
import java.util.*;

class Main
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int tc= sc.nextInt();
        while(tc-- >0)
        {
            int N= sc.nextInt();
            int X= sc.nextInt();
            int Y= sc.nextInt();

            int A[]=new int[N];
            int B[]=new int[N];

            for(int i=0;i<N;i++)
                A[i]=sc.nextInt();
            for(int i=0;i<N;i++)
                B[i]=sc.nextInt();

            int dp[][]=new int[X+1][Y+1];

            for(int i=1;i<=X;i++)
                dp[i][0]= A[i-1] + dp[i-1][0];
            for(int i=1;i<=Y;i++)
                dp[0][i]= B[i-1] + dp[0][i-1];

            for(int i=1;i<=X;i++)
            {
                for(int j=1;j<=Y;j++)
                {
                    if(i+j <= N)
                    {
                        int op1= A[i+j-1] + dp[i-1][j]; // GIVING TO X (CHECK X IN FOR)-> ROW
                        int op2= B[i+j-1] + dp[i][j-1]; // TO Y

                        dp[i][j] = Math.max( op1 , op2 );
                    }
                    else
                        dp[i][j] = Math.max( dp[i-1][j] , dp[i][j-1] );
                }
            }

            System.out.println(dp[X][Y]);
        }
    }

}
*/