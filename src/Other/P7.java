package Other;
/***
 * 
* <p>Title: P7</p>  
* <p>Description: </p>  
*Æá¹·ÎÝ
Description

Dilpreet wants to paint his dog- Buzo's home that has n boards with different lengths[A1, A2,..., An]. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board.The problem is to find the minimum time to get this job done under the constraints that any painter will only paint continuous sections of boards, say board {2, 3, 4} or only board {1} or nothing but not board {2, 4, 5}.

Constraints:1<=T<=100,1<=k<=30,1<=n<=50,1<=A[i]<=500


Input

The first line consists of a single integer T, the number of test cases. For each test case, the first line contains an integer k denoting the number of painters and integer n denoting the number of boards. Next line contains n- space separated integers denoting the size of boards.


Output

For each test case, the output is an integer displaying the minimum time for painting that house.


Sample Input 1 

2
2 4
10 10 10 10
2 4
10 20 30 40
Sample Output 1

20
60
* 
* @author ydc   
* @date 2019Äê11ÔÂ26ÈÕ
 */
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
from functools import lru_cache

def solve(p, tasks):
    @lru_cache(None)
    def dfs(rp, it):
        if rp == 1:
            return sum(tasks[it:])
        if it == len(tasks) - 1:
            return tasks[-1]
        rp -= 1

        ans, cursum = float('inf'), 0
        for j in range(it, len(tasks)):
            cursum += tasks[j]
            ans = min(ans, max(cursum, dfs(rp, j+1)))
        return ans

    return dfs(p, 0)


for _ in range(int(input())):
    p, t = map(int, input().split())
    tasks = list(map(int, input().split()))
    print(solve(p, tasks))


*/