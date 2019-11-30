import java.util.Scanner;
/**
 * 
* <p>Title: SecondTest3</p>  
* <p>Description: 
* Description

Dilpreet wants to paint his dog- Buzo's home that has n boards with different lengths[A1, A2,..., An]. 
He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board.
The problem is to find the minimum time to get this job done under the constraints that any painter 
will only paint continuous sections of boards, say board {2, 3, 4} or only board {1} or nothing but 
not board {2, 4, 5}.

Constraints:1<=T<=100,1<=k<=30,1<=n<=50,1<=A[i]<=500


Input

The first line consists of a single integer T, the number of test cases. For each test case, the first line contains an integer k denoting the number of painters and integer n denoting the number of boards. Next line contains n- space separated integers denoting the size of boards.


Output

For each test case, the output is an integer displaying the minimum time for painting that house.


Sample Input 1 

2
2 4
10 10 10 10
2 4
10 20 30 40
Sample Output 1

20
60
* </p>  
* @author ydc   
* @date 2019Äê10ÔÂ17ÈÕ
 */
public class SecondTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		while(cases>0) {
			cases--;
			int k = input.nextInt();
			int n = input.nextInt();
			int[] board = new int[n];
			for(int i=0;i<n;i++) {
				board[i] = input.nextInt();
			}
			
		}
		
	}
	
	public static int fenpei(int[] borad,int k) {
		return 0;
	}
	
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int caseNum = Integer.parseInt(cin.nextLine().trim());
        for (int curi = 0; curi < caseNum; curi++) {
            int[] input1 = StringarrToIntarr(cin.nextLine().trim());
            int[] input2 = StringarrToIntarr(cin.nextLine().trim());
            System.out.println(partition(input2, input1[1], input1[0]));
        }
    }

    static int getMax(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    static int getSum(int[] arr, int n) {
        int total = 0;
        for (int i = 0; i < n; i++)
            total += arr[i];
        return total;
    }

    static int numberOfPainters(int[] arr, int n, int maxLen) {
        int total = 0, numPainters = 1;
        for (int i = 0; i < n; i++) {
            total += arr[i];
            if (total > maxLen) {

                // for next count
                total = arr[i];
                numPainters++;
            }
        }
        return numPainters;
    }

    static int partition(int[] arr, int n, int k) {
        int lo = getMax(arr, n);
        int hi = getSum(arr, n);
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int requiredPainters = numberOfPainters(arr, n, mid);
            if (requiredPainters <= k)
                hi = mid;
            else
                lo = mid + 1;
        }
        return lo;
    }

    public static int[] StringarrToIntarr(String string) {
        String[] inputS = string.split(" ");
        int[] output = new int[inputS.length];
        for (int j = 0; j < inputS.length; j++) {
            output[j] = Integer.parseInt(inputS[j]);
        }
        return output;
    }
}
 */
