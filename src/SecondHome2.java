import java.util.Scanner;
/**
 * 
* <p>Title: SecondHome2</p>  
* <p>Description: 
* 链表回文
Description
判断一个单向链表是否为回文结构。自定义链表数据结构，要求时间复杂度为O(n)，额外空间复杂度为O(1)。
Input
输入第一行为用例个数， 每个测试用例输入的每一行的值用空格隔开，第一个值为节点个数，后面为每一个节点值
Output
是回文则输出true，不是则输出false，一行表示一个链表的结果。
Sample Input 1 

4
3 1 2 1
4 1 2 2 1
3 3 5 3
6 a b c d c a

Sample Output 1

true
true
true
false
* </p>  
* @author ydc   
* @date 2019年10月29日
 */
public class SecondHome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases > 0) {
			cases--;
			String str = input.nextLine();
			int len = Integer.valueOf(str.substring(0, 1));
			char[] ch = str.substring(1).replace(" ", "").toCharArray();
			boolean flag = true;
			for(int i=0; i<len/2; i++) {
				if(ch[i] != ch[len-1-i]) {
					flag = false;
					break;
				}
			}
			System.out.println(flag);
		}
	}

}
