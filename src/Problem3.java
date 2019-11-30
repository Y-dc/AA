/**
 * 
* <p>Title: Problem3</p>  
* <p>Description: 
* 
* 倒置个数
Description

有一个由N个实数构成的数组，如果一对元素A[i]和A[j]是倒序的，即i<j但是A[i]>A[j]则称它们是一个倒置，
设计一个计算该数组中所有倒置数量的算法。要求算法复杂度为O(nlogn)


Input

输入有多行，第一行整数T表示为测试用例个数，后面是T个测试用例，每一个用例包括两行，第一行的一个整数是元素个数，
第二行为用空格隔开的数组值。


Output

输出每一个用例的倒置个数，一行表示一个用例。


Sample Input 1 

1
8
8 3 2 9 7 1 5 4
Sample Output 1

17
</p>  
* @author ydc   
* @date 2019年9月26日
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

