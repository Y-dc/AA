package Other;
/**
 * 
* <p>Title: P8</p>  
* <p>Description: </p>  
* �Ƿ���ͨ������
Description

С����Ҫͨ������Ŀ��ԡ���֪������ķ�ֵ�ֲ���Ҳ֪��������Ҫ�õ�ÿһ����Ŀ��Ҫ�ķѵ�ʱ�䡣���迼��ʱ��Ϊh����n����Ŀ����Ҫ�õ�p�ֲ���ͨ�����ԡ�������֪ÿ������ĵ÷����ʱ�������ж�С���ܷ�ͨ��������ʱ�䣬��ͨ�����ԣ�������ͨ�����Ե����ʱ�䡣


Input

�����һ��Ϊ������������.ÿһ�������������У���һ��Ϊ��������n������ʱ��h��ͨ������p�������n����ÿһ����Ŀ�ĺ�ʱ�͵÷֡�������ֵ�ÿո�ֿ���


Output

��ÿһ���������һ�У�����ܹ�ͨ�����ԣ��������YES�����������ʱ�䣬�ÿո������ ���������NO����


Sample Input 1 

1
5 40 21 
12 10 
16 10 
20 10 
24 10 
8 3 
Sample Output 1

YES 36
* 
* @author ydc   
* @date 2019��11��26��
 */
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*

class Solution:

    def solve(self, times, score, tasks):
        self.ans = times + 1

        def dfs(t, s, i):
            if s >= score and self.ans > t:
                self.ans = t
                return
            if t > times or i >= len(tasks):
                return

            dfs(t + tasks[i][0], s + tasks[i][1], i + 1)
            dfs(t, s, i+1)

        dfs(0, 0, 0)
        return self.ans if self.ans <= times else -1


for _ in range(int(input())):
    n, times, score = map(int, input().split())
    tasks = [list(map(int, input().split())) for _ in range(n)]
    res = Solution().solve(times, score, tasks)
    if res != -1:
        print('YES', res)
    else:
        print('NO')
*/