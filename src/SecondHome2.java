import java.util.Scanner;
/**
 * 
* <p>Title: SecondHome2</p>  
* <p>Description: 
* �������
Description
�ж�һ�����������Ƿ�Ϊ���Ľṹ���Զ����������ݽṹ��Ҫ��ʱ�临�Ӷ�ΪO(n)������ռ临�Ӷ�ΪO(1)��
Input
�����һ��Ϊ���������� ÿ���������������ÿһ�е�ֵ�ÿո��������һ��ֵΪ�ڵ����������Ϊÿһ���ڵ�ֵ
Output
�ǻ��������true�����������false��һ�б�ʾһ������Ľ����
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
* @date 2019��10��29��
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
