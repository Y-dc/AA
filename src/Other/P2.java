package Other;
/**
* <p>Title: P2</p>  
* <p>Description:
* ���η������������
Description

��������⣺ʹ�÷����㷨�����������⡣


Input

��һ��Ϊ������������������ÿһ�б�ʾһ��������һ������ΪһЩƽ���ϵ�ļ��ϣ������֮���ö��Ÿ�����һ��������������ÿո����������ֵ����������


Output

��ÿһ���������������������ĵ㣨����ʹ�ÿո���������ö��Ÿ������Ȱ��յ�һ�������С���У��ٰ��յڶ��������С���С�����ж���⣬����ÿ����ĵ�һ������������������������⣬�ö��Ÿ�����


Sample Input 1 

1
1 1,2 2,3 3,4 4,5 5,1.5 1.5
Sample Output 1

1 1,1.5 1.5,1.5 1.5,2 2
*  </p>  
* @author ydc   
* @date 2019��11��26��
 */
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*

import collections
def solve(points):

    def dis2(p1, p2):
        return (float(p2[0]) - float(p[0])) ** 2 + (float(p2[1]) - float(p[1])) ** 2

    ans = collections.defaultdict(list)
    for i in range(len(points)-1):
        p = points[i]
        cur, d = [(p, points[i+1])], dis2(p, points[i+1])
        for j in range(i+2, len(points)):
            dj = dis2(p, points[j])
            if dj < d:
                cur = [(p, points[j])]
                d = dj
            elif dj == d:
                cur.append((p, points[j]))
        ans[d] += cur

    return ans[min(ans.keys())]


for _ in range(int(input())):
    points = [p.split() for p in input().split(',')]
    res = solve(points)
    res = [','.join(' '.join(p) for p in sorted(pair)) for pair in res]
    print(','.join(sorted(res)))
*/