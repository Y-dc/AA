/**
 * 
* <p>Title: Problem4</p>  
* <p>Description: 
* 相对排序（按照另一个数组排序）
Description

Given two array A1[] and A2[], sort A1 in such a way that the relative order among 
the elements will be same as those in A2. For the elements not present in A2. Append 
them at last in sorted order. It is also given that the number of elements in A2[] are 
smaller than or equal to number of elements in A1[] and A2[] has all distinct elements.

Input:A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8} A2[] = {2, 1, 8, 3} Output: 
A1[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}

Since 2 is present first in A2[], all occurrences of 2s should appear first in A[], 
then all occurrences 1s as 1 comes after 2 in A[]. Next all occurrences of 8 and then 
all occurrences of 3. Finally we print all those elements of A1[] that are not present 
in A2[]


Input

The first line of input contains an integer T denoting the number of test cases. The 
first line of each test case is M and N. M is the number of elements in A1 and N is 
the number of elements in A2.The second line of each test case contains M elements. 
The third line of each test case contains N elements.


Output

Print the sorted array according order defined by another array.


Sample Input 1 

1
11 4
2 1 2 5 7 1 9 3 6 8 8
2 1 8 3
Sample Output 1

2 2 1 1 8 8 3 5 6 7 9
* </p>  
* @author ydc   
* @date 2019年9月26日
 */
public class Problem4 {

	public Problem4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/**python3
 *
 * case = int(input().strip())
while case:
    size1, size2 = list(map(int, input().strip().split()))

    num1 = list(map(int, input().strip().split()))
    num2 = list(map(int, input().strip().split()))
    result = []
    for i in range(len(num2)):
        if num2[i] in num1:
            count = num1.count(num2[i])
            for j in range(0, count):
                print(num2[i], end=" ")
                num1.remove(num2[i])
    num1.sort()
    for i in range(len(num1)):
        if i == len(num1) -1:
            print(num1[i])
        else:
            print(num1[i], end= " ")
    case -= 1
 */
/*
import collections

def solve(nums1, nums2):
    count = collections.Counter(nums1)
    res = []
    for num in nums2:
        res += [num]*count[num]
        del count[num]

    for num in sorted(count.keys()):
        res += [num] * count[num]
    return res


for _ in range(int(input())):
    input()
    nums1 = list(map(int, input().split()))
    nums2 = list(map(int, input().split()))
    print(*solve(nums1, nums2))

*/