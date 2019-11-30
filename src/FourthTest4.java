/**
 * 
* <p>Title: FourthTest4</p>  
* <p>Description: 
* 如何花最少的钱购买蔬菜
Description

Rahul wanted to purchase vegetables mainly brinjal, carrot and tomato. There are N different vegetable 
sellers in a line. Each vegetable seller sells all three vegetable items, but at different prices. Rahul, 
obsessed by his nature to spend optimally, decided not to purchase same vegetable from adjacent shops. 
Also, Rahul will purchase exactly one type of vegetable item (only 1 kg) from one shop. Rahul wishes to 
spend minimum money buying vegetables using this strategy. Help Rahul determine the minimum money he will spend.


Input

First line indicates number of test cases T. Each test case in its first line contains N denoting the 
number of vegetable sellers in Vegetable Market. Then each of next N lines contains three space separated 
integers denoting cost of brinjal, carrot and tomato per kg with that particular vegetable seller.


Output

For each test case, output the minimum cost of shopping taking the mentioned conditions into account in a 
separate line.

Constraints:1 <= T <= 101 <= N <= 100000 Cost of each vegetable(brinjal/carrot/tomato) per kg does not
 exceed 10^4


Sample Input 1 

1
3
1 50 50
50 50 50
1 50 50
Sample Output 1

52
* </p>  
* @author ydc   
* @date 2019年11月21日
 */
public class FourthTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * 
 * 
t = int(input())
ans = []
for i in range(t):
    n = int(input())
    a = []
    for i in range(n):
        l = list(map(int, input().split()))
        m = []
        if i == 0:
            m = l
        else:
            m = [min(a[i - 1][2], a[i - 1][1]) + l[0], min(a[i - 1][0], a[i - 1][2]) + l[1],min(a[i - 1][0], a[i - 1][1]) + l[2]]
        a.append(m)
    ans.append(min(a[-1]))
for i in ans:
    print(i)
 */
