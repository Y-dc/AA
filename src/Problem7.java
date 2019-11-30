import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * 
* <p>Title: Problem7</p>  
* <p>Description: 
* Description
给定一个整型数组arr和一个大小为w的窗口，窗口从数组最左边滑动到最右边，每次向右滑动一个位置，求出每一次滑动时窗口内最大元素的和。
Input
输入第一行为用例个数， 每个测试用例输入的第一行为数组，每一个元素使用空格隔开；第二行为窗口大小。
Output
输出每个测试用例结果。

用例：
输入
1
4 3 5 4 3 3 6 7
3
输出
32
* 
* </p>  
* @author ydc   
* @date 2019年10月15日
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
