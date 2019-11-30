package Other;
/**
 * 
* <p>Title: PA3</p>  
* <p>Description: </p>  
* 无重复字符子集问题
Description

Mike is a lawyer with the gift of photographic memory. He is so good with it that he can tell you all the numbers on a sheet of paper by having a look at it without any mistake. Mike is also brilliant with subsets so he thought of giving a challange based on his skill and knowledge to Rachael. Mike knows how many subset are possible in an array of N integers. The subsets may or may not have the different sum. The challenge is to find the maximum sum produced by any subset under the condition:

The elements present in the subset should not have any digit in common.

Note: Subset {12, 36, 45} does not have any digit in common and Subset {12, 22, 35} have digits in common.Rachael find it difficult to win the challenge and is asking your help. Can youhelp her out in winning this challenge?


Input

First Line of the input consist of an integer T denoting the number of test cases. Then T test cases follow. Each test case consist of a numbe N denoting the length of the array. Second line of each test case consist of N space separated integers denoting the array elements.

Constraints:

1 <= T <= 100

1 <= N <= 100

1 <= array elements <= 100000


Output

Corresponding to each test case, print output in the new line.


Sample Input 1 

1
3
12 22 35
Sample Output 1

57
* 
* @author ydc   
* @date 2019年11月26日
 */
public class PA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*

def solve(snums):
    def dfs(i, seen):
        if i >= len(snums):
            return 0

        ans = dfs(i+1, seen)
        if not (seen & set(snums[i])):
            seen |= set(snums[i])
            ans = max(ans, int(snums[i]) + dfs(i+1, seen))
            seen -= set(snums[i])
        return ans
    return dfs(0, set())


for _ in range(int(input())):
    input()
    nums = input().split()
    print(solve(nums))
*/