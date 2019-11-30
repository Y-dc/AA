import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * 
* <p>Title: FifthTest1</p>  
* <p>Description: </p>  
* 时间分隔
Description

Given arrival and departure times of all trains that reach a railway station. Your task is to find the minimum number of platforms required for the railway station so that no train waits. 

Note: Consider that all the trains arrive on the same day and leave on the same day. Also, arrival and departure times must not be same for a train.


Input

The first line of input contains T, the number of test cases. For each test case, first line will contain an integer N, the number of trains. Next two lines will consist of N space separated time intervals denoting arrival and departure times respectively. 

Note: Time intervals are in the 24-hourformat(hhmm), preceding zeros are insignificant. 200 means 2:00.
Consider the example for better understanding of input.

Constraints:1 <= T <= 100，1 <= N <= 1000，1 <= A[i] < D[i] <= 2359


Output

For each test case, print the minimum number of platforms required for the trains to arrive and depart safely.


Sample Input 1 

1
6
900 940 950 1100 1500 1800
910 1200 1120 1130 1900 2000
Sample Output 1

3
* @author ydc   
* @date 2019年11月28日
 */
public class FifthTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases>0) {
			cases--;
			int n = Integer.valueOf(input.nextLine());
			String[] str1 = input.nextLine().split(" ");
			String[] str2 = input.nextLine().split(" ");
			int[] arr = new int[n];
			int[] dep = new int[n];
			List<Integer> timeTable = new ArrayList<Integer>();
			for(int i=0; i<n; i++) {
				arr[i] = Integer.valueOf(str1[i]);
				if(timeTable.indexOf(arr[i]) == -1)
					timeTable.add(arr[i]);
				dep[i] = Integer.valueOf(str2[i]);
				if(timeTable.indexOf(dep[i]) == -1)
					timeTable.add(dep[i]);
			}
			Collections.sort(timeTable);
			myway(n, arr, dep, timeTable);
		}
	}
	public static void myway(int n, int[] arr, int[] dep, List<Integer> timeTable) {
		int[] count = new int[timeTable.size()];
		for(int i=0; i<n; i++) {
			for(int j=timeTable.indexOf(arr[i]); j<timeTable.indexOf(dep[i]); j++) {
				count[j]++;
			}
		}
		int max = count[0];
		for(int i=0; i<count.length-1; i++) {
			if(max < count[i]) {
				max = count[i];
			}
		}
		System.out.println(max);
	}
}
