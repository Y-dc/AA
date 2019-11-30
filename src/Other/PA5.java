package Other;
/**
 * 
* <p>Title: PA5</p>  
* <p>Description: </p>  
* ��С����ʼ��
Description

Given a grid with each cell consisting of positive, negative or no points i.e, zero points. We can move across a cell only if we have positive points ( > 0 ). Whenever we pass through a cell, points in that cell are added to our overall points. We need to find minimum initial points to reach cell (m-1, n-1) from (0, 0) by following these certain set of rules :

1.From a cell (i, j) we can move to (i+1, j) or (i, j+1).

2.We cannot move from (i, j) if your overall points at (i, j) is <= 0.

3.We have to reach at (n-1, m-1) with minimum positive points i.e., > 0.


Input

The first line contains an integer 'T' denoting the total number of test cases.In each test cases, the first line contains two integer 'R' and 'C' denoting the number of rows and column of array.
The second line contains the value of the array i.e the grid, in a single line separated by spaces in row major order.

Constraints:

1 �� T �� 30

1 �� R,C �� 10

-30 �� A[R][C] �� 30

Input: points[m][n] = { {-2, -3, 3},
{-5, -10, 1},
{10, 30, -5}
};


Output

Print the minimum initial points to reach the bottom right most cell in a separate line.

7

Explanation:
7 is the minimum value to reach destination with
positive throughout the path. Below is the path.

(0,0) -> (0,1) -> (0,2) -> (1, 2) -> (2, 2)

We start from (0, 0) with 7, we reach(0, 1)
with 5, (0, 2) with 2, (1, 2) with 5, (2, 2)with and finally we have 1 point (we needed
greater than 0 points at the end).


Sample Input 1 

1
3 3
-2 -3 3 -5 -10 1 10 30 -5
Sample Output 1

7
* @author ydc   
* @date 2019��11��26��
 */
public class PA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*

def solve(grid):
    m, n = len(grid), len(grid[0])
    dp = [[float('inf')]*(n+1) for _ in range(m+1)]
    dp[m-1][n-1] = max(-grid[-1][-1], 0) + 1

    for i in range(m)[::-1]:
        for j in range(n)[::-1]:
            if i == m-1 and j == n-1:
                continue
            best_exit = min(dp[i+1][j], dp[i][j+1])
            dp[i][j] = max(best_exit-grid[i][j], 1)
    return dp[0][0]


for _ in range(int(input())):
    r, c = map(int, input().split())
    ins = list(map(int, input().split()))
    nums = [ins[i:i+r] for i in range(0, r*c, r)]
    print(solve(nums))
*/