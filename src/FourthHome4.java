/**
 * 
* <p>Title: FourthHome4</p>  
* <p>Description: </p>  
* ���̸�������
Description

���̸������⣺����һ����СΪ2^n2^n��С��������̣�������һ��λ���Ѿ�����䣬����Ҫ��һ��L�ͣ�22��С������ɵĴ󷽸���ȥ������һ��С������״ȥ����ʣ�µ�С����������Ƿ���������Щ�����µ�С����ʹ��ͬһ��L�͸��Ӹ��ǡ�ע�⣺�����0��ʼ�����Ϸ��ĵ�һ����������Ϊ(0,0)����һ�еڶ�������Ϊ(0,1)���ڶ��е�һ��Ϊ(1,0)���Դ����ơ�


Input

�����һ��Ϊ������������������ÿһ�����������У���һ��Ϊnֵ������ĸ��ӵ����꣨�ÿո���������ڶ���Ϊ��Ҫ����������ͬһ��L�͸��ӵĸ������ꡣ


Output

���ÿһ��Ϊһ�������Ľ⣬�Ȱ�����ֵ��С�����ٰ�����ֵ��С�����˳�����ÿһ���������������ꣻ�ö��Ÿ�����


Sample Input 1 

1
1 1 1
0 0
Sample Output 1

0 1,1 0
* @author ydc   
* @date 2019��11��28��
 */
public class FourthHome4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
import java.util.*;
public class Main {
	private static int til = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ucaseNum = Integer.parseInt(sc.nextLine());
		for(int i = 0;i < ucaseNum;i++) {
			int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int n = a[0];
			int dR = a[1];
			int dC = a[2];
			int[] b = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int x = b[0];
			int y = b[1];
			int size = (int)Math.pow(2,n);
			int[][] board = new int[size][size];
			int til = 1;
			String res = "";
			chessBoard(board,0,0,dR,dC,size);
			int count = 0;
			for(int j = 0;j < size;j++) {
				for(int k = 0;k < size;k++) {
					if(board[x][y] == board[j][k]) {
						if(x == j && y == k)
							continue;
						else {
							if(count != 0)
								res += ",";
							res += j;
							res += " ";
							res += k;
							count++;
						}
					}
				}
			}
			System.out.println(res);
		}
	}
	private static void chessBoard(int[][] board,  int lR, int lC, int dR, int dC, int size) {
		if(size == 1)
			return ;
		size = size/2;
		int t = til++;
		if(dR < lR + size && dC < lC + size)	//����������̵����Ͻǵ�����
			chessBoard(board,lR,lC,dR,dC,size);
		else {
			board[lR + size - 1][lC + size - 1] = t;
			chessBoard(board,lR,lC,lR + size - 1,lC + size - 1,size);
		}
		if(dR < lR + size && dC >= lC + size)	//����������̵����Ͻǵ�����
			chessBoard(board,lR,lC + size,dR,dC,size);
		else {
			board[lR + size - 1][lC + size] = t;
			chessBoard(board,lR,lC + size,lR + size - 1,lC + size,size);
		}
		if(dR >= lR + size && dC < lC + size)	//����������̵����½ǵ�����
			chessBoard(board,lR + size,lC,dR,dC,size);
		else {
			board[lR + size][lC + size - 1] = t;
			chessBoard(board,lR + size,lC,lR + size - 1,lC + size - 1,size);
		}
		if(dR >= lR + size && dC >= lC + size)	//����������̵����½ǵ�����
			chessBoard(board,lR + size,lC + size,dR,dC,size);
		else {
			board[lR + size][lC + size] = t;
			chessBoard(board,lR + size,lC + size,lR + size,lC + size,size);
		}
	}
}

 */