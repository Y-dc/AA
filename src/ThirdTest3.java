/**
 * 
* <p>Title: ThirdTest3</p>  
* <p>Description:
* 无限递归字符串查询
Description

Consider a string A = "12345". An infinite string s is built by performing infinite 
steps on A recursively. In i-th step, A is concatenated with ‘$’ i times followed by 
reverse of A. A=A|$...$|reverse(A), where | denotes concatenation.

Constraints:1<=Q<=10^5, 1<=POS<=10^12

12345$54321$$12345$54321$$$12345$54321$$12345$54321...

Input

输入第一行为查询次数，后面为每次查询的具体字符位置。


Output

输出每一次查询位置上的字符。


Sample Input 1 

2
3
10
Sample Output 1

3
2
*  </p>  
* @author ydc   
* @date 2019年11月3日
 */
public class ThirdTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
/*
def GetChar(q):

    g_str = ['1', '2', '3', '4', '5', '$', '5', '4', '3', '2', '1']

    while q > len(g_str):
        m, itr = GetValues(q)

        val = int(((m - itr) / 2) + itr);

        if(q <= val):
            q = 6
            break
        q -= val
    if(q > 0):
        return g_str[q-1]
    return ""

def GetValues(q):
    size = 5;
    itr = 0;

    while True:

        if(q <= size):
            return (size, itr)
        itr += 1;
        size = (size * 2) + itr


T = int(input())

for i in range(0, T):
    q = int(input())
    print(GetChar(q))
 */