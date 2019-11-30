import java.util.Arrays;
import java.util.Scanner;

/**
 * 
* <p>Title: Problem10</p>  
* <p>Description:
* �̶��͵�Ԫ�ض�
Description
����һ�������һ�����֣��������в�����������ʹ�����ǵĺ�������������Ǹ����֣�ͳ�������������Ķ�����
Input
�����һ��Ϊ���������� ÿ���������������һ�������飬ÿһ�����ÿո�������ڶ��������ֺ͡�
Output
��������������м���.

����
����
1
1 2 4 7 11 0 9 15
11
���
3
*  </p>  
* @author ydc   
* @date 2019��10��16��
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
