package Other;
/**
 * 
* <p>Title: PA2</p>  
* <p>Description: </p>  
*素数和问题
Description

Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number. There are several combinations possible. Print only first such pair.

NOTE: A solution will always exist, read Goldbach’s conjecture.Also, solve the problem in linear time complexity, i.e., O(n).


Input

The first line contains T, the number of test cases. The following T lines consist of a number each, for which we'll find two prime numbers.Note: The number would always be an even number.


Output

For every test case print two prime numbers space separated, such that the smaller number appears first. Answer for each test case must be in a new line.


Sample Input 1 

5
74
1024
66 
8
9990
Sample Output 1

3 71
3 1021
5 61
3 5
17 9973
* @author ydc   
* @date 2019年11月26日
 */
public class PA2 {
	
	public static void main(String[] args) {
		
	}
}
/*


def solve(n):
    primes = [False]*2 + [True] * n
    for i in range(2, n):
        if not primes[i]: continue
        for j in range(i*2, n+1, i):
            primes[j] = False

    primes = [i for i in range(n+1) if primes[i]]

    lo, hi = 0, len(primes)-1
    while lo <= hi:
        cur = primes[lo] + primes[hi]
        if cur == n:
            return [primes[lo], primes[hi]]
        elif cur > n:
            hi -= 1
        else:
            lo += 1


for _ in range(int(input())):
    print(*(solve(int(input()))))
*/