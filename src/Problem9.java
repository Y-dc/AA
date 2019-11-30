import java.util.Arrays;
import java.util.Scanner;
/**
 * 
* <p>Title: Problem9</p>  
* <p>Description:
* Description
找到给定数组的给定区间内的第K小的数值。
Input
输入第一行为用例个数， 每个测试用例输入的第一行为数组，每一个数用空格隔开；第二行是区间（第几个数到第几个数，两头均包含），两个值用空格隔开；第三行为K值。
Output
结果。

用例
输入
1
1 2 3 4 5 6 7
3 5
2
输出
4
*  </p>  
* @author ydc   
* @date 2019年10月16日
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
