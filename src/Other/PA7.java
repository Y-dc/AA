package Other;
/**
 * 
 * 
* <p>Title: PA7</p>  
* <p>Description: </p>  
* 路上的球
Description

There are two parallel roads, each containing N and M buckets, respectively. Each bucket may contain some balls. The buckets on both roads are kept in such a way that they are sorted according to the number of balls in them. Geek starts from the end of the road which has the bucket with a lower number of balls(i.e. if buckets are sorted in increasing order, then geek will start from the left side of the road). The geek can change the road only at the point of intersection(which means, buckets with the same number of balls on two roads). Now you need to help Geek to collect the maximum number of balls.


Input

The first line of input contains T denoting the number of test cases. The first line of each test case contains two integers N and M, denoting the number of buckets on road1 and road2 respectively. 2nd line of each test case contains N integers, number of balls in buckets on the first road. 3rd line of each test case contains M integers, number of balls in buckets on the second road.

Constraints:1<= T <= 1000，1<= N <= 10^3，1<= M <=10^3，0<= A[i],B[i]<=10^6


Output

For each test case output a single line containing the maximum possible balls that Geek can collect.


Sample Input 1 

1
5 5
1 4 5 6 8
2 3 4 6 9
Sample Output 1

29
* @author ydc   
* @date 2019年11月30日
 */
public class PA7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
def solve(balls1, balls2):
    common = set(balls1) & set(balls2)
    arr1, arr2 = [], []
    for num in sorted(common):
        idx1 = balls1.index(num)
        idx2 = balls2.index(num)
        arr1.append(sum(balls1[:idx1+1]))
        arr2.append(sum(balls2[:idx2+1]))
        balls1 = balls1[idx1+1:]
        balls2 = balls2[idx2+1:]
    ans = max(sum(balls1), sum(balls2))
    for val1, val2 in zip(arr1, arr2):
        ans += max(val1, val2)
    return ans
    

# balls1 = [1, 4, 5, 6, 8]
# balls2 = [2, 3, 4, 6, 9]
# print(solve(balls1, balls2))
for _ in range(int(input())):
    input()
    balls1 = list(map(int, input().split()))
    balls2 = list(map(int, input().split()))
    print(solve(balls1, balls2))
*/