/**
 * 
* <p>Title: Problem3</p>  
* <p>Description: 
* 
* ���ø���
Description

��һ����N��ʵ�����ɵ����飬���һ��Ԫ��A[i]��A[j]�ǵ���ģ���i<j����A[i]>A[j]���������һ�����ã�
���һ����������������е����������㷨��Ҫ���㷨���Ӷ�ΪO(nlogn)


Input

�����ж��У���һ������T��ʾΪ��������������������T������������ÿһ�������������У���һ�е�һ��������Ԫ�ظ�����
�ڶ���Ϊ�ÿո����������ֵ��


Output

���ÿһ�������ĵ��ø�����һ�б�ʾһ��������


Sample Input 1 

1
8
8 3 2 9 7 1 5 4
Sample Output 1

17
</p>  
* @author ydc   
* @date 2019��9��26��
 */
public class Problem3 {

	public Problem3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

/**
 * import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int NUM = scanner.nextInt();
		int count;
		for(int i = 0;i<NUM;i++) {
			count=0;
			int numAll = scanner.nextInt();
			int[] number=new int[numAll];
			
			for(int j = 0;j<numAll;j++) {
				number[j]=scanner.nextInt();
			}
			
			for(int n = 0;n<numAll;n++) {
				for(int m = n+1;m<numAll;m++) {
					if(n<m&&number[n]>number[m]) {
						count++;
					}
				}
			}
			
		System.out.println(count);	
		}	
		}		
}
 */

