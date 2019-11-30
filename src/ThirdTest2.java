import java.util.Scanner;

/**
 * 
* <p>Title: ThirdTest2</p>  
* <p>Description: 
* 整除查询
Description

Given an array of positive integers and many queries for divisibility. 
In every query Q[i], we are given an integer K , we need to count all 
elements in the array which are perfectly divisible by K.

Constraints:1<=T<=1001<=N,M<=1051<=A[i],Q[i]<=105


Input

The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow. Each test case consists of three lines. First line of 
each test case contains two integers N & M, second line contains N space separated 
array elements and third line contains M space separated queries.


Output

For each test case,In new line print the required count for each query Q[i].


Sample Input 1 

2
6 3
2 4 9 15 21 20
2 3 5
3 2
3 4 6
2 3
Sample Output 1

3 3 2
2 2
* </p>  
* @author ydc   
* @date 2019年10月31日
 */
public class ThirdTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases>0) {
			cases--;
			String nm = input.nextLine();
			String[] arr = input.nextLine().split(" ");
			String[] Q = input.nextLine().split(" ");
			way(arr, Q);
		}
	}
	public static void way(String[] arr, String[] Q) {
		int[] count = new int[Q.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<Q.length;j++) {
				if(Integer.valueOf(arr[i])%Integer.valueOf(Q[j]) == 0) {
					count[j]++;
				}
			}
		}
		for(int i=0; i<count.length-1; i++) {
			System.out.print(count[i] + " ");
		}
		System.out.println(count[count.length-1]);
	}
}
