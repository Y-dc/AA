package Other;
/**
* <p>Title: PA4</p>  
* <p>Description: </p>  
* ��ų˷�
Description

There are Infinite People Standing in a row, indexed from 1.A person having index 'i' has strength of (i*i).You have Strength 'P'. You need to tell what is the maximum number of People You can Kill With your Strength P.You can only Kill a person with strength 'X' if P >= 'X' and after killing him, Your Strength decreases by 'X'.


Input

First line contains an integer 'T' - the number of testcases,Each of the next 'T' lines contains an integer 'P'- Your Power.Constraints:1<=T<=100001<=P<=1000000000000000


Output

For each testcase Output The maximum Number of People You can kill.


Sample Input 1 

1
14
Sample Output 1

3
* @author ydc   
* @date 2019��11��26��
 */
public class PA4 {

}
/*

def solve(n):
    cur = 1
    while n >= cur**2:
        n -= cur**2
        cur += 1
    return cur - 1


for _ in range(int(input())):
    print(solve(int(input())))
*/