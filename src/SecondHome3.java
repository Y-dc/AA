import java.util.Scanner;
/**
 * 
* <p>Title: SecondHome3</p>  
* <p>Description: 
* ������������
Description
�����������ÿK���ڵ�֮�����򣬴�ӡ�������������K�Ľڵ�������Ҫ����Ҫ��ʱ�临�Ӷ�ΪO(n)������ռ临�Ӷ�ΪO(1)��
Input
�����һ��Ϊ���������� ÿ���������������ÿһ�е�ֵ�ÿո��������һ����ʾ�����ȣ��м�Ϊ�ڵ�ֵ��������K��
Output
�����ÿһ��Ϊ�µ������ڵ�ֵ�ÿո������ĩβ��Ҫ�ո�
Sample Input 1 

2
8 1 2 3 4 5 6 7 8 3
8 a b c d e f g h 4

Sample Output 1

3 2 1 6 5 4 7 8
d c b a h g f e
* </p>  
* @author ydc   
* @date 2019��10��29��
 */
public class SecondHome3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases>0) {
			cases--;
			String str = input.nextLine();
			String[] tip = str.split(" ");
			int len = Integer.valueOf(str.substring(0, tip[0].length()));
			String[] ch = str.substring(tip[0].length()+1,str.length()-tip[tip.length-1].length()-1).split(" ");
			int k = Integer.valueOf(str.substring(str.length()-tip[tip.length-1].length()));
			way(ch, k);
		}
//		char[] ch = {'1','2','3'};
//		System.out.println(ch);  // 123
	}
	public static void way(String[] ch, int k) {
		for(int i=0; i+k<=ch.length; i+=k) {
			for(int j=0; j<k/2;j++) {
				String temp = ch[i+j];
				ch[i+j] = ch[i+k-1-j];
				ch[i+k-1-j] = temp;
			}
		}
		for(int i=0; i<ch.length-1; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println(ch[ch.length-1]);
	}

}
