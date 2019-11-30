import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
* <p>Title: ThirdTest4</p>  
* <p>Description: 
* 字符串匹配问题
Description

Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], 
char txt[]) that prints all occurrences of pat[] in txt[]. You may assume that n > m.


Input

输入第一行是用例个数，后面一行表示一个用例；用例包括两部分，第一部分为给定文本，第二部分为搜索串，两部分使用","隔开。


Output

每一个用例输出一行，每行按照找到的位置先后顺序排列，使用空格隔开。


Sample Input 1 

2
THIS IS A TEST TEXT,TEST
AABAACAADAABAABA,AABA

Sample Output 1

10
0 9 12
* </p>  
* @author ydc   
* @date 2019年10月31日
 */
public class ThirdTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases>0) {
			cases--;
			String str = input.nextLine();
			String txt = str.substring(0,str.indexOf(","));
			String pat = str.substring(str.indexOf(",")+1);
			search1(txt, pat);
		}
	}
	public static void search(String txt,String pat) {
		List<Integer> index = new ArrayList<>();
		for(int i=0; i<=txt.length()-pat.length();i++) {
			if(txt.substring(i,i+pat.length()).equals(pat)) {
				index.add(i);
			}
		}
		for(int i=0; i<index.size()-1;i++) {
			System.out.print(index.get(i) + " ");
		}
		System.out.println(index.get(index.size()-1));
	}
	public static void search1(String txt,String pat) {
		List<Integer> index = new ArrayList<>();
		for(int i=0; i<=txt.length()-pat.length();i++) {
			int flag = txt.indexOf(pat, i);
			if( flag != -1) {
				index.add(flag);
				i=flag+1;
			}
		}
		for(int i=0; i<index.size()-1;i++) {
			System.out.print(index.get(i) + " ");
		}
		System.out.println(index.get(index.size()-1));
	}
}
/*
def solve(txt, pat):
    ans = [-1]
    while txt.find(pat, ans[-1]+1) != -1:
        ans.append(txt.find(pat, ans[-1]+1))
    return ans[1:]


for _ in range(int(input())):
    txt, pat = input().split(',')
    res = solve(txt, pat)
    print(*solve(txt, pat))

*/