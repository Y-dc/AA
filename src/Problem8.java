import java.util.Scanner;
/**
 * 
* <p>Title: Problem8</p>  
* <p>Description:
* Description
��ŵ�����������Ʋ��ܽ�һ����ֱ�Ӵ�������ƶ������Ҳ࣬Ҳ����ֱ�Ӵ����Ҳ��ƶ�������࣬���Ǳ��뾭���м䡣����N������ʱ���ƶ�������
Input
�����һ��Ϊ���������� ÿ��������������ĵ�һ��ΪN��
Output
�ƶ�������

������
����
1
2
���
8
*  </p>  
* @author ydc   
* @date 2019��10��15��
 */
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int t=0; t<num; t++) {
			int N = input.nextInt();
			System.out.println(HNT(N));
		}
	}
	
	public static int HNT(int N) {
		if(N==1) {
			return 2;
		}
		else {
			//HNT(N-1)  ��1--N-2���̴�a����c
			//����N-1������b
			//HNT(N-1) ��1--N-2�̴�c����a
			//����N-1������c
			//HNT(N-1)��1--N-2�̴�a����c
			return HNT(N-1)*3+2;
		}
	}
	
}
