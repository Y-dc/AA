/**
 * 
* <p>Title: FourthHome6</p>  
* <p>Description: </p>  
* 广度优先遍历图
Description

按照给定的起始顶点广度优先遍历图，每一次通过字母顺序选择顶点查找下一层邻接点，打印遍历顺序。


Input

输入第一行为测试用例个数，后面每一个用例用多行表示，用例第一行是节点个数n和开始顶点，用空格隔开，后面n+1行为图的邻接矩阵，其中第一行为节点名称。值之间使用空格隔开。


Output

输出遍历顺序，用空格隔开


Sample Input 1 

1
4 a
a b c d
a 0 1 1 0
b 1 0 1 0
c 1 1 0 1
d 0 0 1 0
Sample Output 1

a b c d
* @author ydc   
* @date 2019年11月28日
 */
public class FourthHome6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
def findPath(nums, points, path, status):
    for i in path:
        for no in range(nums):
            if points[i][no] == 1 and status[no] == 0:
                status[no] = 1
                path.append(no)


if __name__ == '__main__':
    for _ in range(int(input())):
        infos = input().split()
        names = input().split()
        points = []
        path = []
        status = [0 for i in range(int(infos[0]))]
        depths = [0 for i in range(int(infos[0]))]
        path.append(0)
        status[0] = 1
        for count in range(int(infos[0])):
            points.append(list(map(int, input().split()[1:])))
        findPath(int(infos[0]), points, path, status)
        getpath = []
        for i in path:
            getpath.append(names[i])
        print(' '.join(getpath))

*/