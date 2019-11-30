import java.util.Scanner;
/**
 * 
* <p>Title: Problem8</p>  
* <p>Description:
* Description
汉诺塔问题中限制不能将一层塔直接从最左侧移动到最右侧，也不能直接从最右侧移动到最左侧，而是必须经过中间。求当有N层塔的时候移动步数。
Input
输入第一行为用例个数， 每个测试用例输入的第一行为N。
Output
移动步数。

用例：
输入
1
2
输出
8
*  </p>  
* @author ydc   
* @date 2019年10月15日
 */
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int t=0; t<num; t++) {
			int N = input.nextInt();
			System.out.println(HNT(N));
		}
	}
	
	public static int HNT(int N) {
		if(N==1) {
			return 2;
		}
		else {
			//HNT(N-1)  将1--N-2个盘从a移至c
			//将第N-1盘移至b
			//HNT(N-1) 将1--N-2盘从c移至a
			//将第N-1盘移至c
			//HNT(N-1)将1--N-2盘从a移至c
			return HNT(N-1)*3+2;
		}
	}
	
}
