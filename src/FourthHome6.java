/**
 * 
* <p>Title: FourthHome6</p>  
* <p>Description: </p>  
* ������ȱ���ͼ
Description

���ո�������ʼ���������ȱ���ͼ��ÿһ��ͨ����ĸ˳��ѡ�񶥵������һ���ڽӵ㣬��ӡ����˳��


Input

�����һ��Ϊ������������������ÿһ�������ö��б�ʾ��������һ���ǽڵ����n�Ϳ�ʼ���㣬�ÿո����������n+1��Ϊͼ���ڽӾ������е�һ��Ϊ�ڵ����ơ�ֵ֮��ʹ�ÿո������


Output

�������˳���ÿո����


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
* @date 2019��11��28��
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