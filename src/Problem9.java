import java.util.Arrays;
import java.util.Scanner;
/**
 * 
* <p>Title: Problem9</p>  
* <p>Description:
* Description
�ҵ���������ĸ��������ڵĵ�KС����ֵ��
Input
�����һ��Ϊ���������� ÿ��������������ĵ�һ��Ϊ���飬ÿһ�����ÿո�������ڶ��������䣨�ڼ��������ڼ���������ͷ��������������ֵ�ÿո������������ΪKֵ��
Output
�����

����
����
1
1 2 3 4 5 6 7
3 5
2
���
4
*  </p>  
* @author ydc   
* @date 2019��10��16��
 */
public class Problem9 {

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
			str = input.nextLine().split(" ");
			int head = Integer.valueOf(str[0]);
			int tail = Integer.valueOf(str[1]);
			int[] kid = new int[tail-head+1];
			for(int i=0;i<tail-head+1;i++) {
				kid[i] = arr[i+head-1];
			}
			Arrays.sort(kid);
			int flag = Integer.valueOf(input.nextLine());
			System.out.println(kid[flag-1]);
		}
	}

}
