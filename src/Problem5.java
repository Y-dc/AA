import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 
* <p>Title: Problem5</p>  
* <p>Description:
* 子数组的取值范围
* Description
给定数组arr和整数num，求arr的连续子数组中满足：其最大值减去最小值的结果大于num的个数。请实现一个时间复杂度为O(length(arr))的算法。
Input
输入第一行为测试用例个数。每一个用例有若干行，第一行为数组，每一个数用空格隔开，第二行为num。
Output
输出一个值。
用例：
输入
2
3 6 4 3 2
2
2 4 7 3 1 2
2
输出
6
11

* 
* 
* 
* 本题来自左神《IT名企算法与数据结构题目最优解》，下面是左神的实现过程与算法思路 
1、生成两个双端队列qmax 和qmin. 
2、令j不断向右移动（j++）,表示arr[i..j]一直向右扩大，并不断更新qmax和qmin结构，保证qmax和qmin始终维持动态窗口最大值
和最小值的更新结构。 
3、当进行完步骤2，令i向右移动一个位置并对qmax和qmin做出相应的更新做出相应的更新。 
4、根据步骤2，步骤3，依次求出以arr[0],arr[1],arr[2]…..、arr[N-1] 作为第一个元素的子数组中满足条件的数量分别有多少，
累加起来起来的数量就是最终的结果。
*  </p>  
* @author ydc   
* @date 2019年10月14日
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

                //维护窗口最大值
                while(!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[j]){
                    qmax.pollLast();
                }
                qmax.addLast(j);
                //维护窗口最小值
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
