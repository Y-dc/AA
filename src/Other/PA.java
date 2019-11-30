package Other;
/**
 * 
* <p>Title: PA</p>  
* <p>Description: </p>  
* 数学公式
Description

Implement pow(A, B) % C.In other words, given A, B and C, find (A^B)%C


Input

The first line of input consists number of the test cases. The following T lines consist of 3 numbers each separated by a space and in the following order:A B C'A' being the base number, 'B' the exponent (power to the base number) and 'C' the modular.Constraints:1 ≤ T ≤ 70,1 ≤ A ≤ 10^5,1 ≤ B ≤ 10^5,1 ≤ C ≤ 10^5


Output

In each separate line print the modular exponent of the given numbers in the test case.


Sample Input 1 

3
3 2 4
10 9 6
450 768 517
Sample Output 1

1
4
34
* @author ydc   
* @date 2019年11月26日
 */
public class PA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
from functools import lru_cache
@lru_cache(None)
def solve(a, b, c):
    a %= c
    if b == 1:
        return a
    return (solve(a, (b+1)//2, c) * solve(a, b//2, c)) % c


for _ in range(int(input())):
    a, b, c = map(int, input().split())
    print(solve(a, b, c))
*/