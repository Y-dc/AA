import java.util.Scanner;
/**
 * 
* <p>Title: FourthTest1</p>  
* <p>Description: 
* 
* 数组查询
Description

Given an array, the task is to complete the function which finds the maximum sum subarray, where you may remove at most one element to get the maximum sum.


Input

第一行为测试用例个数T；后面每两行表示一个用例，第一行为用例中数组长度N，第二行为数组具体内容。


Output

每一行表示对应用例的结果。


Sample Input 1 

1
5
1 2 3 -4 5
Sample Output 1

11
Hint

例如，对一个数组A[] = {1, 2, 3, -4, 5}，要移除-4得到最大和的子数组，和为11.
* </p>  
* @author ydc   
* @date 2019年11月21日
 */
public class FourthTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases>0) {
			cases--;
			int len = Integer.valueOf(input.nextLine());
			String[] strings = input.nextLine().split(" ");
			int[] arr = new int[len];
			for(int i=0; i<len; i++) {
				arr[i] = Integer.valueOf(strings[i]);
			}
			myway(len, arr);
		}
	}
	
	public static void myway(int len,int[] arr) {
		int[][] count = new int[len+1][len+1];
		int max = arr[0];
		for(int i=1;i<len+1;i++) {
			int cut = 0;
			boolean flag = false;
			for(int j=i;j<len+1;j++) {
				if(j==i) {
					count[i][j] = arr[j-1];
				}
				else {
					if(arr[j-1]>0) {
						count[i][j] = count[i][j-1] + arr[j-1];
					}
					else {
						if(!flag) {
							count[i][j] = count[i][j-1];
							flag = true;
							cut = arr[j-1];
						}
						else {
							if(cut > arr[j-1]) {
								count[i][j] = count[i][j-1] + cut;
								cut = arr[j-1];
							}
							else {
								count[i][j] = count[i][j-1] + arr[j-1];
							}
						}
					}//if
				}//if
				if(max < count[i][j]) {
					max = count[i][j];
				}
			}//for
		}//for
		System.out.println(max);
	}
}
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = readInts(br)[0];
        boolean isFirst = true;
        boolean isPrepEmpty = false;
        for(int testIndex = 0; testIndex < testNum; testIndex++){
            if(isFirst){
                isFirst = false;
            }else {
                if(!isPrepEmpty){
                    System.out.println();
                }
            }
            //solution
            readLine(br);
            int[] arr = readInts(br);
            int max = maxSumSubarrayRemovingOneEle(arr, arr.length);
            //print
            System.out.print(max);
        }
    }
    //function
    static int maxSumSubarrayRemovingOneEle(int arr[], int n) {
        int fw[] = new int[n];
        int bw[] = new int[n];
        int cur_max = arr[0], max_so_far = arr[0];
        fw[0] = arr[0];
        for (int i = 1; i < n; i++) {
            cur_max = Math.max(arr[i], cur_max + arr[i]);
            max_so_far = Math.max(max_so_far, cur_max);
            fw[i] = cur_max;
        }
        cur_max = max_so_far = bw[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            cur_max = Math.max(arr[i], cur_max + arr[i]);
            max_so_far = Math.max(max_so_far, cur_max);
            bw[i] = cur_max;
        }
        int fans = max_so_far;
        for (int i = 1; i < n - 1; i++)
            fans = Math.max(fans, fw[i - 1] + bw[i + 1]);
        return fans;
    }
    //IO
    private static String readLine(BufferedReader br){
        try {
            return br.readLine();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    private static String[] readStrings(BufferedReader br){
        String line = readLine(br);
        if(line == null || line.equals("")){
            return new String[0];
        }
        return line.trim().split("( )+");
    }
    private static int[] readInts(BufferedReader br){
        String[] strings = readStrings(br);
        int[] ints = new int[strings.length];
        for(int i = 0; i < strings.length; i++){
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
    private static List<Integer> toArray(int[] src){
        return Arrays.stream(src).boxed().collect(Collectors.toList());
    }
    private static void print(Object[] objs){
        StringBuffer buffer = new StringBuffer();
        for(Object obj: objs){
            buffer.append(obj).append('\n');
        }
        if(buffer.length() > 0) buffer.delete(buffer.length() - 1, buffer.length());
        System.out.print(new String(buffer));
    }
}
*/