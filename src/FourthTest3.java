import java.util.Scanner;
/**
 * 
* <p>Title: FourthTest3</p>  
* <p>Description:
* 按照要求保留数组元素使得和最大
Description

Given an array of N numbers, we need to maximize the sum of selected numbers. At each step, 
you need to select a number Ai, delete one occurrence of Ai-1 (if exists) and Ai each from the 
array. Repeat these steps until the array gets empty. The problem is to maximize the sum of selected numbers.


Input

The first line of the input contains T denoting the number of the test cases. For each test 
case, the first line contains an integer n denoting the size of the array. Next line contains 
n space separated integers denoting the elements of the array.

Constraints:1<=T<=100，1<=n<=50，1<=A[i]<=20

Note: Numbers need to be selected from maximum to minimum.


Output

For each test case, the output is an integer displaying the maximum sum of selected numbers.


Sample Input 1 

2
3
1 2 3
6
1 2 2 2 3 4
Sample Output 1

4
10
*  </p>  
* @author ydc   
* @date 2019年11月21日
 */
public class FourthTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases>0) {
			cases --;
			int len = Integer.valueOf(input.nextLine());
			String[] str = input.nextLine().split(" ");
			int[] arr = new int[len];
			for(int i=0; i<len;i++) {
				arr[i] = Integer.valueOf(str[i]);
			}
			myway(len, arr);
		}
	}
	public static void myway(int len, int[] arr) {
		int[] sum = new int[len];
		sum[0] = arr[0];
		for(int i=1; i<len;i++) {
			sum[i] =sum[i-1] + arr[i];
		}
		for(int i=1; i<len;i++) {
			if(sum[i-1]-arr[i-1]+arr[i] > sum[i-1]) {
				sum[i] = sum[i-1]-arr[i-1]+arr[i];
			}
			else {
				sum[i] = sum[i-1];
			}
		}
		System.out.println(sum[len-1]);
	}
}
/*
 * 
 import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0; i<n; i++)
                a.add(sc.nextInt());
            Collections.sort(a);
            int sum=0;
            while(!a.isEmpty()) {
                int x = a.remove(a.size()-1);
                int ind= Collections.binarySearch(a, (x-1));
                sum += x;
                if(ind>=0)
                    a.remove(ind);
            }
            System.out.println(sum);
        }
    }
}
 
 */

/*

import collections
def solve(nums):
    count = collections.Counter(nums)
    ans = 0
    for num in sorted(count.keys(), reverse=True):
        if count[num] > 0:
            ans += num * count[num]
            count[num-1] -= count[num]
    return ans


for _ in range(int(input())):
    input()
    nums = list(map(int, input().split()))
    print(solve(nums))
 */
