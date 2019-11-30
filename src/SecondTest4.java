import java.util.Scanner;
/**
 * 
* <p>Title: SecondTest4</p>  
* <p>Description:
* Description

Find the count of numbers less than N having exactly 9 divisors

1<=T<=1000,1<=N<=10^12


Input

First Line of Input contains the number of testcases. Only Line of each testcase contains the number of members N in the rival gang.


Output

Print the desired output.


Sample Input 1 
2
40
5
Sample Output 1

1
0
*  </p>  
* @author ydc   
* @date 2019Äê10ÔÂ17ÈÕ
 */
public class SecondTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		while(cases>0) {
			cases--;
			int N = input.nextInt();
			int count = 0;
			for(int i=1; i<N; i++) {
				if(divCount(i) == 9) {
					count++;
				}
			}
			System.out.println(count);
		}
		//System.out.println(divCount(16));
	}
	public static int divCount(int N) {
		int count = 0;
		for(int i=1; i<Math.sqrt(N); i++) {
			if(N % i == 0) {
				count+=2;
			}
		}
		if(Math.sqrt(N) % 1 == 0) {
			count++;
		}
		return count;
//		int count = 1;
//		if (N == 1)
//			return 1;
//		for (int i = 2; i <= Math.sqrt(N); i++) {
//			if (N%i == 0) {
//				count += divCount(i);
//				if(i != N/i) {
//					count += divCount(N/i);
//				}
//					
//			}
//				
//		}
//		return count;
	}
	
}
/*
n = 10 ** 6 // 2
isPrimes = [False] * 2 + [True] * (n - 1)
for p in range(2, n):
    if not isPrimes[p]: continue
    for i in range(p * 2, n, p):
        isPrimes[i] = False
primes = [i for i in range(n) if isPrimes[i]]


import bisect
def solve(N):
    index = bisect.bisect_left(primes, int(N ** 0.5))
    lo, hi = 0, index
    ans = 0
    while lo < hi:
        while lo < hi and (primes[lo] * primes[hi]) ** 2 <= N:
            lo += 1
        if lo == hi: break
        ans += lo
        hi -= 1
    ans += lo * (lo + 1) // 2
    import math
    ans += bisect.bisect_right(primes, int(math.pow(N, 1 / 8)))
    return ans


N = int(input())
for _ in range(N):
    K = int(input())
    print(solve(K))



*/