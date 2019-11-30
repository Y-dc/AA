import java.util.Arrays;
import java.util.Scanner;

/**
 * 
* <p>Title: Problem12</p>  
* <p>Description: 
* 调整数组使差最小
Description
有两个序列 a,b，大小都为 n,序列元素的值任意整数，无序； 要求：通过交换 a,b 中的元素，使[序列 a 元素的和]与[序列 b 元素的和]之间的差最小。
Input
输入第一行为用例个数， 每个测试用例输入为两行，分别为两个数组，每个值用空格隔开。
Output
输出变化之后的两个数组内元素和的差绝对值

用例
输入
1
100 99 98 1 2 3
1 2 3 4 5 40
输出
48
* </p>  
* @author ydc   
* @date 2019年10月16日
 */
public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int tests = Integer.valueOf(input.nextLine());
		for(int t=0; t<tests ;t++) {
			String[] str1 = input.nextLine().split(" ");
			String[] str2 = input.nextLine().split(" ");
			
			//int[] arr = new int[2*str1.length];
			int[] arr1 = new int[str1.length];
			int[] arr2 = new int[str1.length];
//			for(int i=0; i<2*str1.length; i++) {
//				if(i<str1.length) {
//					arr1[i] = Integer.valueOf(str1[i]);
//				}
//				else {
//					arr[i] = Integer.valueOf(str2[i-str1.length]);
//				}
//			}
			for(int i=0; i<arr1.length; i++) {
				arr1[i] = Integer.valueOf(str1[i]);
				
				arr2[i] = Integer.valueOf(str2[i]);
			 
			}
			//Arrays.sort(arr);
			
			//System.out.println(way(arr1, arr2));
		}
	}
	/**
	 * 
	 * <p>Title: lowWay</p>  
	 * <p>Description: 
	 * 穷举
	 * 存在问题
	 * </p>  
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static int lowWay(int[] arr1, int[] arr2) {
		int sum1 = arraySum(arr1), sum2 = arraySum(arr2);
		int dev = Math.abs(sum1-sum2);
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				int sum1After = sum1-arr1[i]+arr2[j];
				int sum2After = sum2-arr2[j]+arr1[i];
				int dev1 = Math.abs(sum1After - sum2After);
				int temp;
				if(dev1 < dev) {
					temp = arr1[i];
					arr1[i] = arr2[j];
					arr2[j] = temp;
					sum1 = sum1After;
					sum2 = sum2After;
					dev = dev1;
				}
			}
		}
		return dev;
	}
	public static int arraySum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	
	public static int thirdWay(int[] arr1, int arr2) {
		
		
		return 0;
	}
}
 
/*
 * 
from itertools import combinations


def solve(nums1, nums2):
    ans = float('inf')
    total = sum(nums1) + sum(nums2)
    for arr in combinations(nums1+nums2, len(nums1)):
        ans = min(ans, abs(total - 2*sum(arr)))
    return ans


for _ in range(int(input())):
    nums1 = list(map(int, input().split()))
    nums2 = list(map(int, input().split()))
    print(solve(nums1, nums2))

*/