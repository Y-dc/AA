import java.util.Arrays;
import java.util.Scanner;

/**
 * 
* <p>Title: Problem10</p>  
* <p>Description:
* 固定和的元素对
Description
输入一个数组和一个数字，在数组中查找两个数，使得它们的和正好是输入的那个数字，统计这样两个数的对数。
Input
输入第一行为用例个数， 每个测试用例输入第一行是数组，每一个数用空格隔开；第二行是数字和。
Output
输出这样两个数有几对.

用例
输入
1
1 2 4 7 11 0 9 15
11
输出
3
*  </p>  
* @author ydc   
* @date 2019年10月16日
 */
public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int tests = Integer.valueOf(input.nextLine());
		for(int t=0; t<tests; t++) {
			String[] str = input.nextLine().split(" ");
			int[] arr = new int[str.length];
			for(int i=0; i<str.length; i++) {
				arr[i] = Integer.valueOf(str[i]);
			}
			int tip = Integer.valueOf(input.nextLine());
			System.out.println(count(arr, tip));
			
		}
	}
	public static int count(int[] arr, int tip) {
		Arrays.sort(arr);
		int count = 0;
		int pre = 0;
		int post = 0;
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i] + arr[i+1] >= tip) {
				pre = i;
				post = i+1;
				break;
			}
		}
		while(pre>=0 && post <arr.length) {
			int sum = arr[pre] + arr[post];
			//System.out.println(sum);
			if(sum == tip) {
				count++;
				pre--;
				post++;
			}
			else if(sum > tip) {
				pre--;
			}
			else if(sum < tip) {
				post++;
			}
		}
		return count;
	}

}
