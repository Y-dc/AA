/**
 * 
* <p>Title: FourthHome5</p>  
* <p>Description: </p>  
* ������ȱ���
Description

���ո�������ʼ����������ȱ�������������ͼ���������п��ܵı�����ʽ����ӡ���������г��ֵ������ȡ�


Input

�����һ������������������ÿ������ʹ�ö��б�ʾ�������ĵ�һ����ͼ�нڵ�ĸ���n����ʼ�㣬�ÿո����������n+1��Ϊͼ���ڽӾ������е�һ��Ϊ�ڵ����ơ�ֵ֮��ʹ�ÿո������


Output

���������ȱ����������������ȡ�


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
* @date 2019��11��28��
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