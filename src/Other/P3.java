package Other;
/**
 * 
* <p>Title: P3</p>  
* <p>Description: 
* 和最大的连续降序字符
Description

Archana is very fond of strings. She likes to solve many questions related to strings. She comes across a problem which she is unable to solve. Help her to solve. The problem is as follows: Given is a string of length L. Her task is to find the longest string from the given string with characters arranged in descending order of their ASCII code and in arithmetic progression. She wants the common difference should be as low as possible(at least 1) and the characters of the string to be of higher ASCII value.


Input

The first line of input contains an integer T denoting the number of test cases. Each test contains a string s of lengthL.

1<= T <= 100

3<= L <=1000

A<=s[i]<=Z

The string contains minimum three different characters.


Output

For each test case print the longest string.Case 1:Two strings of maximum length are possible- “CBA” and “RPQ”. But he wants the string to be of higher ASCII value therefore, the output is “RPQ”.Case 2:The String of maximum length is “JGDA”.


Sample Input 1 

2
ABCPQR
ADGJPRT
Sample Output 1

RQP
JGDA
* </p>  
* @author ydc   
* @date 2019年11月26日
 */
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*


def solve(chs):
    chs = [ord(c)-ord('A') for c in chs]
    chs = set(chs)
    ans = []
    for c in sorted(chs, reverse=True):
        for i in range(1, 25):
            cur = [c]
            while cur[-1] - i in chs:
                cur.append(cur[-1] - i)
            if len(cur) > len(ans) or (len(cur) == len(ans) and len(cur) >= 2 and cur[0]-cur[1] < ans[0] - ans[1]):
                ans = cur
    ans = [chr(c + ord('A')) for c in ans]
    return ans


for _ in range(int(input())):
    print(''.join(solve(input())))
*/