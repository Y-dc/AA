import java.util.Arrays;
import java.util.Scanner;

/**
 * 
* <p>Title: SecondHome4</p>  
* <p>Description:
* 插入排序
Description
实现插入排序。
Input
输入第一行为用例个数， 每个测试用例输入的每一行代表一个数组，其中的值用空格隔开，第一个值表示数组的长度。
Output
输出排序的数组，用空格隔开，末尾不要空格。
Sample Input 1 
1
13 24 3 56 34 3 78 12 29 49 84 51 9 100

Sample Output 1
3 3 9 12 24 29 34 49 51 56 78 84 100
*  </p>  
* @author ydc   
* @date 2019年10月30日
 */
public class SecondHome4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases>0) {
			cases--;
			String string = input.nextLine();
			String[] strings = string.split(" ");
			int len = Integer.valueOf(string.substring(0,strings[0].length()));
			int[] arr = new int[len];
			for(int i=0; i<len; i++) {
				arr[i] = Integer.valueOf(strings[i+1]);
				//System.out.print(arr[i] + " ");
			}
			Arrays.sort(arr);
			for(int i=0; i<len-1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print(arr[len-1]);
		}
	}
	
	/**
	 * 
	 * <p>Title: insertSort</p>  
	 * <p>Description:插入排序 </p>  
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		int[] result = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			int j=i;
			if(! (arr[j] < result[j])) {
				result[j+1] = arr[i];
				continue;
			}
			while(j>=0 && arr[j] < result[j]) {
				result[0] = result[j];
				result[j] = arr[j];
				result[j+1] = result[0];					
				j--;
			}
			
		}
	}

	/**
	 * 
	 * <p>Title: jishupaixu</p>  
	 * <p>Description:计数排序 </p>  
	 * @param arr
	 */
	public static void jishupaixu(int[] arr) {
		
	}
	
	/**
	 * 
	 * <p>Title: quickSort</p>  
	 * <p>Description:非递归快排 </p>  
	 * @param arr
	 */
	public static void quickSort(int[] arr) {
		
	}
	
	/**
	 * 
	 * <p>Title: mergeSort</p>  
	 * <p>Description: 非递归合并排序
	 * 
	 * </p>  
	 * @param arr
	 */
	public static void mergeSort(int[] arr) {
		
	}
}
