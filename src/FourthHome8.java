/**
 * 
* <p>Title: FourthHome8</p>  
* <p>Description: </p>  
* ������ֵ��������
Description

�Ը��������е�Ԫ�ذ���Ԫ�س��ֵĴ������򣬳��ִ����������ǰ�棬������ִ�����ͬ��������ֵ��С�������磬��������Ϊ{2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}�����������Ϊ{3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}��


Input

����ĵ�һ��Ϊ��������������ÿһ������ʹ�����б�ʾ����һ��Ϊ���鳤�ȣ��ڶ���Ϊ�������ݣ�����Ԫ�ؼ�ʹ�ÿո������


Output

ÿһ����������������һ���������Ԫ��֮��ʹ�ÿո������


Sample Input 1 

1
4
2 3 2 5
Sample Output 1

2 2 3 5
* @author ydc   
* @date 2019��11��28��
 */
public class FourthHome8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
if __name__ == "__main__":
    for _ in range(int(input())):
        num = int(input())
        arr = list(map(int, input().split()))
        arr = sorted(arr)
        m = {}
        for i in arr:
            if i in m:
                m[i] += 1
            else:
                m[i] = 1
        s = sorted(m, key=m.__getitem__, reverse=True)
        a = []
        for i in s:
            for j in range(m[i]):
                a.append(i)
        a = list(map(str, a))
        print(' '.join(a))

*/