/**
 * 
* <p>Title: FourthHome7</p>  
* <p>Description: </p>  
* ���������ĸ���
Description

���������޻�ͼ�����бߣ�����ͼ�����������ĸ�����


Input

�����һ��Ϊ��������������ÿһ�б�ʾһ��ͼ�е����бߣ��ߵ������յ��ÿո��������֮��ʹ�ö��Ÿ�����


Output

������������ĸ�����


Sample Input 1 

1
a c,b c,c d,d e,d f,e g,f g
Sample Output 1

4
* @author ydc   
* @date 2019��11��28��
 */
public class FourthHome7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
def inputPre():
    global name, pre, m, n
    for i in range(m):
        v = 0
        u = 0
        while u < n:
            if p[i][0] == name[u]:
                break
            else:
                u += 1
        if u == n:
            name.append(p[i][0])
            n += 1
        while v < n:
            if p[i][1] == name[v]:
                break
            else:
                v += 1
        if v == n:
            name.append(p[i][1])
            n += 1
        pre[v] |= (1 << u)


def solve():
    global dp, n
    dp[0] = 1
    for s in range(1 << n):
        if dp[s] != 0:
            for i in range(n):
                if ((s & pre[i]) == pre[i]) and not (s & (1 << i)):
                    dp[s | (1 << i)] += dp[s]
    print(dp[(1 << n) - 1])


if __name__ == '__main__':
    N = int(input())
    for k in range(N):
        pairs = list(map(str, input().split(",")))  # ����յ�Լ���
        m = len(pairs)
        n = 0
        p = []  # �洢����յ��
        for i in range(m):
            pair = pairs[i].split()
            p.append(pair)
        name = []
        size = 13
        pre = [0 for i in range(size)]
        dp = [0 for i in range(1 << size)]
        inputPre()
        solve()


*/