/**
 * 
* <p>Title: FourthHome4</p>  
* <p>Description: </p>  
* 棋盘覆盖问题
Description

棋盘覆盖问题：给定一个大小为2^n2^n个小方格的棋盘，其中有一个位置已经被填充，现在要用一个L型（22个小方格组成的大方格中去掉其中一个小方格）形状去覆盖剩下的小方格。求出覆盖方案，即哪些坐标下的小方格使用同一个L型格子覆盖。注意：坐标从0开始。左上方的第一个格子坐标为(0,0)，第一行第二个坐标为(0,1)，第二行第一个为(1,0)，以此类推。


Input

输入第一行为测试用例个数，后面每一个用例有两行，第一行为n值和特殊的格子的坐标（用空格隔开），第二行为需要查找其属于同一个L型格子的格子坐标。


Output

输出每一行为一个用例的解，先按照行值从小到大、再按照列值从小到大的顺序输出每一个用例的两个坐标；用逗号隔开。


Sample Input 1 

1
1 1 1
0 0
Sample Output 1

0 1,1 0
* @author ydc   
* @date 2019年11月28日
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
		if(dR < lR + size && dC < lC + size)	//奇异点在棋盘的左上角的区域
			chessBoard(board,lR,lC,dR,dC,size);
		else {
			board[lR + size - 1][lC + size - 1] = t;
			chessBoard(board,lR,lC,lR + size - 1,lC + size - 1,size);
		}
		if(dR < lR + size && dC >= lC + size)	//奇异点在棋盘的右上角的区域
			chessBoard(board,lR,lC + size,dR,dC,size);
		else {
			board[lR + size - 1][lC + size] = t;
			chessBoard(board,lR,lC + size,lR + size - 1,lC + size,size);
		}
		if(dR >= lR + size && dC < lC + size)	//奇异点在棋盘的左下角的区域
			chessBoard(board,lR + size,lC,dR,dC,size);
		else {
			board[lR + size][lC + size - 1] = t;
			chessBoard(board,lR + size,lC,lR + size - 1,lC + size - 1,size);
		}
		if(dR >= lR + size && dC >= lC + size)	//奇异点在棋盘的右下角的区域
			chessBoard(board,lR + size,lC + size,dR,dC,size);
		else {
			board[lR + size][lC + size] = t;
			chessBoard(board,lR + size,lC + size,lR + size,lC + size,size);
		}
	}
}

 */