package Other;
/**
 * 
* <p>Title: P6</p>  
* <p>Description: </p>  
* 能否成环
Description

Given an array of strings A[ ], determine if the strings can be chained together to form a circle. A string X can be chained together with another string Y if the last character of X is same as first character of Y. If every string of the array can be chained, it will form a circle. For example, for the array arr[] = {"for", "geek", "rig", "kaf"} the answer will be Yes as the given strings can be chained as "for", "rig", "geek" and "kaf".


Input

The first line of input contains an integer T denoting the number of test cases. Then T test cases follow.

The first line of each test case contains a positive integer N, denoting the size of the array.

The second line of each test case contains a N space seprated strings, denoting the elements of the array A[ ].

1 <= T

0 < N

0 < A[i]


Output

If chain can be formed, then print 1, else print 0.


Sample Input 1 

2
3
abc bcd cdf
4
ab bc cd da
Sample Output 1

0
1
* 
* @author ydc   
* @date 2019年11月26日
 */
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
import collections

def solve(nodes):
    N = len(nodes)
    follow = collections.defaultdict(list)
    for node in nodes:
        for f in nodes:
            if node[-1] == f[0]:
                follow[node].append(f)

    def dfs(path):
        if len(path) == N:
            return path[-1][-1] == path[0][0]

        for node in follow[path[-1]]:
            if node not in path and dfs(path+[node]):
                return True
        return False

    return any(dfs([node]) for node in nodes)


for _ in range(int(input())):
    input()
    nodes = input().split()
    print(int(solve(nodes)))
*/