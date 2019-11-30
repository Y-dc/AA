import java.util.Scanner;
/**
 * 
* <p>Title: ThirdTest1</p>  
* <p>Description:
* 对称子字符串
Description

Given a string ‘str’ of digits, find length of the longest substring of ‘str’, 
such that the length of the substring is 2k digits and sum of left k digits is 
equal to the sum of right k digits.


Input

输入第一行是测试用例的个数，后面每一行表示一个数字组成的字符串，例如："123123"


Output

输出找到的满足要求的最长子串的长度。例如，给定的例子长度应该是 6。每行对应一个用例的结果。


Sample Input 1 

1
1538023
Sample Output 1

4
*  </p>  
* @author ydc   
* @date 2019年10月31日
 */
public class ThirdTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases>0) {
			cases--;
			String str = input.nextLine();
			int[] arr = new int[str.length()];
			for(int i=0; i<str.length(); i++) {
				arr[i] = Integer.valueOf(str.substring(i,i+1));
			}
			way(arr);
		}
	}
	public static void way(int[] arr) {
		int lenMax = 0;
		int[] subSum = new int[arr.length+1];
		int sSum = 0;
		for(int i=1;i<arr.length+1;i++) {
			sSum += arr[i-1];
			subSum[i] = sSum;
		}
		for(int i=1; i<arr.length; i++) {
			for(int j=i+1; j<arr.length+1; j+=2) {
				if((subSum[j]-subSum[j-(j-i+1)/2]) == (subSum[i+(j-i+1)/2-1]-subSum[i-1])&&(lenMax<(j-i+1))) {
					lenMax = j-i+1;
				}
			}
		}
		System.out.println(lenMax);
	}
}
