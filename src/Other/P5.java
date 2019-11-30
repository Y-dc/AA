package Other;
/**
 * 
* <p>Title: P5</p>  
* <p>Description: </p>  
* ��������
Description

In a given cartesian plane, there are N points. We need to find the Number of Pairs of points(A,B) such that

Point A and Point B do not coincide.
Manhattan Distance and the Euclidean Distance between the points should be equal.
Note : Pair of 2 points(A,B) is considered same as Pair of 2 points(B,A).

Manhattan Distance = |x2-x1|+|y2-y1|

Euclidean Distance = ((x2-x1)^2 + (y2-y1)^2)^0.5 where points are (x1,y1) and (x2,y2).

Constraints:1<=T <= 50, 1<=N <= 2*10 ^ 5, 0<=(|Xi|, |Yi|) <= 10^9


Input

First Line Consist of T - number of test cases. For each Test case:First Line consist of N , Number of points. Next line contains N pairs contains two integers Xi and Yi��i.e, X coordinate and the Y coordinate of a Point


Output

Print the number of pairs as asked above.


Sample Input 1 

1
2
1 1
7 5
Sample Output 1

0
* 
* @author ydc   
* @date 2019��11��26��
 */
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
import collections


def solve(points):
    def count(items):
        c = collections.Counter(items)
        return sum(n*(n-1)//2 for n in c.values())

    xs, ys = list(zip(*points))
    tpoints = [tuple(p) for p in points]
    return count(xs) + count(ys) - count(tpoints)


for _ in range(int(input())):
    n = int(input())
    points = [list(map(int, input().split())) for _ in range(n)]
    print(solve(points))
*/