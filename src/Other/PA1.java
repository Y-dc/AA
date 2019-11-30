package Other;
/**
 * 
* <p>Title: PA1</p>  
* <p>Description: </p>  
* 数字重组整除问题
Description

Babul’s favourite number is 17. He likes the numbers which are divisible by 17. This time what he does is that he takes a number N and tries to find the largest number which is divisible by 17, by rearranging the digits. As the number increases he gets puzzled with his own task. So you as a programmer have to help him to accomplish his task.Note: If the number is not divisible by rearranging the digits, then print “Not Possible”. N may have leading zeros.


Input

The first line of input contains an integer T denoting the no of test cases. Each of the next T lines contains the number N.


Output

For each test case in a new line print the desired output.


Sample Input 1 

4
17
43
15
16
Sample Output 1

17
34
51
Not Possible
* 
* @author ydc   
* @date 2019年11月26日
 */
public class PA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
import itertools


def solve(s):
    ans = -1
    if s == '0':
        return ans
    for ss in itertools.permutations(s):
        num = int(''.join(ss))
        if num % 17 == 0 and num > ans:
            ans = num
    return ans


for _ in range(int(input())):
    res = solve(input())
    out = res if res != -1 else 'Not Possible'
    print(out)

*/