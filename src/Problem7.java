import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * 
* <p>Title: Problem7</p>  
* <p>Description: 
* Description
����һ����������arr��һ����СΪw�Ĵ��ڣ����ڴ���������߻��������ұߣ�ÿ�����һ���һ��λ�ã����ÿһ�λ���ʱ���������Ԫ�صĺ͡�
Input
�����һ��Ϊ���������� ÿ��������������ĵ�һ��Ϊ���飬ÿһ��Ԫ��ʹ�ÿո�������ڶ���Ϊ���ڴ�С��
Output
���ÿ���������������

������
����
1
4 3 5 4 3 3 6 7
3
���
32
* 
* </p>  
* @author ydc   
* @date 2019��10��15��
 */
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = Integer.valueOf(input.nextLine());
		for(int t=0; t<num; t++) {
			String[] str = input.nextLine().split(" ");
			int[] arr = new int[str.length];
			for(int i=0; i<str.length; i++) {
				arr[i] = Integer.valueOf(str[i]);
			}
			int w = Integer.valueOf(input.nextLine());
			
			int sum = 0;
			
	
			Deque<Integer> qmax = new LinkedList<Integer>();
			for(int i=0; i<w; i++) {
				while(!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
					qmax.pollLast();
				}
				qmax.addLast(i);
			}
			sum += arr[qmax.peekFirst()];
			for(int i=1; i<str.length-w+1; i++) {
				if(qmax.peekFirst() < i) {
					qmax.pollFirst();
				}
				while(!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i+w-1]) {
					qmax.pollLast();
				}
				qmax.addLast(i+w-1);
				sum += arr[qmax.peekFirst()];
				//System.out.println(arr[qmax.peekFirst()]);
			}
			System.out.println(sum);
		}
	}

}
