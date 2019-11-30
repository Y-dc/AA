/**
 * 
* <p>Title: FourthHome5</p>  
* <p>Description: </p>  
* 深度优先遍历
Description

按照给定的起始顶点深度优先遍历给定的无向图，尝试所有可能的遍历方式，打印遍历过程中出现的最大深度。


Input

输入第一行是用例个数，后面每个用例使用多行表示，用例的第一行是图中节点的个数n和起始点，用空格隔开，后面n+1行为图的邻接矩阵，其中第一行为节点名称。值之间使用空格隔开。


Output

输出深度优先遍历中遇到的最大深度。


Sample Input 1 

1
4 a
a b c d
a 0 1 1 0
b 1 0 1 0
c 1 1 0 1
d 0 0 1 0
Sample Output 1

4
* @author ydc   
* @date 2019年11月28日
 */
public class FourthHome5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
def findPath(nums, cons, status, row, depth, depths):
    flag = 0
    for i in range(nums):
        if cons[row][i] == 1 and status[i] == 0:
            tmpStatus = status[:]
            tmpStatus[i] = 1
            depth += 1
            flag = 1
            findPath(nums, cons, tmpStatus, i, depth,depths)
    if flag == 0:
        depths.append(depth)
    return


if __name__ == '__main__':
    for _ in range(int(input())):
        infos = input().split()
        input()
        cons = []
        status = [0 for i in range(int(infos[0]))]
        depths = [0 for i in range(int(infos[0]))]
        status[0] = 1
        for count in range(int(infos[0])):
            cons.append(list(map(int, input().split()[1:])))
        findPath(int(infos[0]), cons, status, 0, 0, depths)
        print(max(depths))

*/