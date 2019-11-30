import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 
* <p>Title: Problem5</p>  
* <p>Description:
* �������ȡֵ��Χ
* Description
��������arr������num����arr�����������������㣺�����ֵ��ȥ��Сֵ�Ľ������num�ĸ�������ʵ��һ��ʱ�临�Ӷ�ΪO(length(arr))���㷨��
Input
�����һ��Ϊ��������������ÿһ�������������У���һ��Ϊ���飬ÿһ�����ÿո�������ڶ���Ϊnum��
Output
���һ��ֵ��
������
����
2
3 6 4 3 2
2
2 4 7 3 1 2
2
���
6
11

* 
* 
* 
* ������������IT�����㷨�����ݽṹ��Ŀ���Ž⡷�������������ʵ�ֹ������㷨˼· 
1����������˫�˶���qmax ��qmin. 
2����j���������ƶ���j++��,��ʾarr[i..j]һֱ�������󣬲����ϸ���qmax��qmin�ṹ����֤qmax��qminʼ��ά�ֶ�̬�������ֵ
����Сֵ�ĸ��½ṹ�� 
3���������경��2����i�����ƶ�һ��λ�ò���qmax��qmin������Ӧ�ĸ���������Ӧ�ĸ��¡� 
4�����ݲ���2������3�����������arr[0],arr[1],arr[2]��..��arr[N-1] ��Ϊ��һ��Ԫ�ص������������������������ֱ��ж��٣�
�ۼ����������������������յĽ����
*  </p>  
* @author ydc   
* @date 2019��10��14��
 */
public class Problem5 {

	public Problem5() {
		// TODO Auto-generated constructor stub
	}
	public static int getNum(int[] arr,int num){
        if(arr == null || arr.length == 0){
            return 0;
        }
        int res = 0;

        int i = 0;
        int j = 0;
        Deque<Integer> qmax = new LinkedList<>();
        Deque<Integer> qmin = new LinkedList<>();
        while(i < arr.length){
            while( j < arr.length){

                //ά���������ֵ
                while(!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[j]){
                    qmax.pollLast();
                }
                qmax.addLast(j);
                //ά��������Сֵ
                while(!qmin.isEmpty() && arr[qmin.peekLast()] >= arr[j]){
                    qmin.pollLast();
                }
                qmin.addLast(j);
                if(arr[qmax.peekFirst()] - arr[qmin.peekFirst()] > num){
                	break;
                }
                j++;
                
            }
            res += arr.length - j;
            qmax.clear();
            qmin.clear();
//            if(qmax.peekFirst() == i){
//                qmax.poll();
//            }
//            if(qmin.peekFirst() == i){
//                qmin.poll();
//            }
            i++;
            j = i;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
      	int n = Integer.valueOf(input.nextLine());
      	//System.out.println(n);
      	for(int i=0; i<n; i++){
        	String[] str = input.nextLine().split(" ");
        	int num = Integer.valueOf(input.nextLine());
        	//System.out.println(num);
        	int[] arr = new int[str.length];
        	for(int j=0; j<str.length; j++) {
        		arr[j] = Integer.valueOf(str[j]);
        		//System.out.println(arr[j]);
        	}
        	int count = getNum(arr, num);
        	System.out.println(count);
        }
	}

}
