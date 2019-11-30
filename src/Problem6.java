import java.util.Scanner;
import java.util.Stack;
/**
 * 
* <p>Title: Problem6</p>  
* <p>Description: https://blog.csdn.net/leonliu1995/article/details/78648157
* 子矩阵问题
* Description
给定一个矩形区域，每一个位置上都是1或0，求该矩阵中每一个位置上都是1的最大子矩形区域中的1的个数。
Input
输入第一行为测试用例个数。每一个用例有若干行，第一行为矩阵行数n和列数m，下面的n行每一行是用空格隔开的0或1。
Output
输出一个数值。

用例：
输入
1
3 4
1 0 1 1
1 1 1 1
1 1 1 0
输出
6
* 
* </p>  
* @author ydc   
* @date 2019年10月15日
 */
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int t=0; t<num; t++) {
			int n = input.nextInt();
			int m = input.nextInt();
			int[][] rec = new int[n][m];
			int[] h = new int[m];
			int max = 0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					int tip = input.nextInt();
					if(i>0 && rec[i-1][j]!=0 && tip!=0) {
						rec[i][j] = rec[i-1][j] + 1;
						h[j] = rec[i][j];
					}
					else{
						rec[i][j] = tip;
						h[j] = tip;
					}
					//System.out.print(rec[i][j] + " ");
				}
				max = Math.max(max, LargestRectangleArea(h));
				//System.out.println();
			}
			
			System.out.println(max);
			
		}
	}
	
	public static int LargestRectangleArea(int[] height){
        if (height.length==0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int i=1, max = height[0];
        stack.push(0);

        while(i< height.length||(i==height.length&& !stack.isEmpty()) ){
            if(i!=height.length && (stack.isEmpty() ||height[i] >= height[stack.peek()])){
                stack.push(i);
                i++;
            }
            else {
                int top  = height[stack.pop()];
                int currMax = !stack.isEmpty()? top *(i - stack.peek()-1): top *i;
                max = Math.max(currMax, max);
            }
        }

        return max;
    }

}
