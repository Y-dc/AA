import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
* <p>Title: SecondTest2</p>  
* <p>Description:凸包算法 
* Description

Convex Hull of a set of points, in 2D plane, is a convex polygon with minimum area such that each point lies either on the boundary of polygon or inside it. Now given a set of points the task is to find the convex hull of points.


Input

The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains an integer N denoting the no of points. Then in the next line are N*2 space separated values denoting the points ie x and y.Constraints:1<=T<=100,1<=N<=100,1<=x,y<=1000


Output

For each test case in a new line print the points x and y of the convex hull separated by a space in sorted order (increasing by x first, then by y) where every pair is separated from the other by a ','. If no convex hull is possible print -1.


Sample Input 1 

2
3
1 2 3 1 5 6
3
1 2 4 4 5 1
Sample Output 1

1 2, 3 1, 5 6
1 2, 4 4, 5 1
* 
* </p>  
* @author ydc   
* @date 2019年10月17日
 */
public class SecondTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		while(cases>0) {
			cases--;
			int points = input.nextInt();
			Integer[] pointXY = new Integer[2];
			List<Integer[]> point = new ArrayList<Integer[]>(); 
			for(int i=0; i<points; i++) {
				pointXY[0] = input.nextInt();
				pointXY[1] = input.nextInt();
				point.add(pointXY);
			}
			
		}
	}
	public static List<Integer[]> point(List<Integer[]> point, List<Integer[]> pointUp, List<Integer[]> pointDown){
		int xmin = point.get(0)[0];
		int xmax = xmin;
		int[] left = new int[2];
		int[] right = new int[2];
		for(int i=0; i<point.size(); i++) {
			if(point.get(i)[0] <= xmin) {
				xmin = point.get(i)[0];
				left[0] = xmin;
				left[1] = point.get(i)[1];
			}
			if(point.get(i)[0] >= xmax) {
				xmax = point.get(i)[0];
				right[0] = xmax;
				right[1] = point.get(i)[1];
			}
		}
		for(int i=0;i<point.size();i++) {
			//if(point.get(i)[0] >= left[0] && point.get(i)[1] <)
		}
		return point;
	}

}

/**
 * 
 * import math



def get_leftbottompoint(p):
    k = 0
    for i in range(1, len(p)):
        if p[i][1] < p[k][1] or (p[i][1] == p[k][1] and p[i][0] < p[k][0]):
            k = i
    return k



def multiply(p1, p2, p0):
    return (p1[0] - p0[0]) * (p2[1] - p0[1]) - (p2[0] - p0[0]) * (p1[1] - p0[1])



def get_arc(p1, p0):
    if (p1[0] - p0[0]) == 0:
        if ((p1[1] - p0[1])) == 0:
            return -1
        else:
            return math.pi / 2
    tan = float((p1[1] - p0[1])) / float((p1[0] - p0[0]))
    arc = math.atan(tan)
    if arc >= 0:
        return arc
    else:
        return math.pi + arc


def sort_points_tan(p, pk):
    p2 = []
    for i in range(0, len(p)):
        p2.append({"index": i, "arc": get_arc(p[i], pk)})
    p2.sort(key=lambda k: (k.get('arc')))
    p_out = []
    for i in range(0, len(p2)):
        p_out.append(p[p2[i]["index"]])
    return p_out


def convex_hull(p):
    p = list(set(p))
    k = get_leftbottompoint(p)
    pk = p[k]
    p.remove(p[k])

    p_sort = sort_points_tan(p, pk)  # 按与基准点连线和x轴正向的夹角排序后的点坐标
    p_result = [pk, p_sort[0]]
    top = 2
    for i in range(1, len(p_sort)):
        while (multiply(p_result[-2], p_sort[i], p_result[-1]) > 0):
            p_result.pop()
        p_result.append(p_sort[i])
    return p_result  # 测试


case = int(input())
while case:
    point_number = int(input())
    points = [int(x) for x in input().split()]
    points = [tuple([points[2 * x], points[2 * x + 1]]) for x in range(point_number)]

    if point_number <= 2:
        print(-1)
        case -= 1
        continue

    result = convex_hull(points)

    if len(result) <= 2:
        print(-1)
        case -= 1
        continue

    result.sort(key=lambda x: (x[0], x[1]))

    for i in range(len(result)):
        print(str(result[i][0]) + ' ' + str(result[i][1]), end='')
        if i != len(result) - 1:
            print(', ', end='')
    print()

    case -= 1
 */
