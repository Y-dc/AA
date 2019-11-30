package Other;
/**
* <p>Title: P2</p>  
* <p>Description:
* 分治法解最近对问题
Description

最近对问题：使用分治算法解决最近对问题。


Input

第一行为测试用例个数。后面每一行表示一个用例，一个用例为一些平面上点的集合，点与点之间用逗号隔开，一个点的两个坐标用空格隔开。坐标值都是正数。


Output

对每一个用例输出两个距离最近的点（坐标使用空格隔开），用逗号隔开，先按照第一个坐标大小排列，再按照第二个坐标大小排列。如果有多个解，则按照每个解的第一个点的坐标排序，连续输出多个解，用逗号隔开。


Sample Input 1 

1
1 1,2 2,3 3,4 4,5 5,1.5 1.5
Sample Output 1

1 1,1.5 1.5,1.5 1.5,2 2
*  </p>  
* @author ydc   
* @date 2019年11月26日
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