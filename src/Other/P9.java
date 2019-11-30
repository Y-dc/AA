package Other;
/**
 * 
* <p>Title: P9</p>  
* <p>Description: </p>  
* 书本分发
Description

You are given N number of books. Every ith book has Pi number of pages. You have to allocate books to M number of students. There can be many ways or permutations to do so. In each permutation one of the M students will be allocated the maximum number of pages. Out of all these permutations, the task is to find that particular permutation in which the maximum number of pages allocated to a student is minimum of those in all the other permutations, and print this minimum value. Each book will be allocated to exactly one student. Each student has to be allocated atleast one book.


Input

The first line contains 'T' denoting the number of testcases. Then follows description of T testcases:Each case begins with a single positive integer N denoting the number of books.The second line contains N space separated positive integers denoting the pages of each book.And the third line contains another integer M, denoting the number of studentsConstraints:1<= T <=70，1<= N <=50，1<= A [ i ] <=250，1<= M <=50，Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see explanation for better understanding)


Output

For each test case, output a single line containing minimum number of pages each student has to read for corresponding test case.


Sample Input 1 

1
4
12 34 67 90
2
Sample Output 1

113
* 
* @author ydc   
* @date 2019年11月26日
 */
public class P9 {

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
    input()
    tasks = list(map(int, input().split()))
    p = int(input())
    print(solve(p, tasks))


*/