package Other;
/**
 * 
* <p>Title: P8</p>  
* <p>Description: </p>  
* 是否能通过考试
Description

小张想要通过明天的考试。他知道考题的分值分布，也知道考试中要拿到每一个题目需要耗费的时间。假设考试时长为h，共n个题目，需要拿到p分才能通过考试。现在已知每个考题的得分与耗时，请你判断小张能否通过合理安排时间，而通过考试，并给出通过考试的最短时间。


Input

输入第一行为测试用例个数.每一个用例有若干行，第一行为任务数量n、考试时常h、通过分数p，下面的n行是每一个题目的耗时和得分。所有数值用空格分开。


Output

对每一个用例输出一行，如果能够通过考试，则输出“YES”和消耗最短时间，用空格隔开。 否则，输出“NO”。


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
* @date 2019年11月26日
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