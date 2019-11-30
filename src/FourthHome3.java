/**
 * 
* <p>Title: FourthHome3</p>  
* <p>Description: </p>  
* 实现Shell排序
Description

实现Shell排序，对给定的无序数组，按照给定的间隔变化（间隔大小即同组数字index的差），打印排序结果，注意不一定是最终排序结果！


Input

输入第一行表示测试用例个数，后面为测试用例，每一个用例有两行，第一行为给定数组，第二行为指定间隔，每一个间隔用空格隔开。


Output

输出的每一行为一个用例对应的指定排序结果。


Sample Input 1 

1
49 38 65 97 76 13 27 49 55 4
5 3
Sample Output 1

13 4 49 38 27 49 55 65 97 76
* 
* @author ydc   
* @date 2019年11月28日
 */
public class FourthHome3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
for _ in range(int(input())):
    line = list(map(int, input().split()))
    infos = list(map(int, input().split()))
    for gap in infos:
        for start in range(gap):
            for i in range(start, len(line), gap):
                tmp = line[i]
                location = i
                for j in range(i + gap, len(line), gap):
                    if line[i] > line[j]:
                        line[i] = line[j]
                        location = j
                line[location] = tmp
    line = list(map(str, line))
    print(' '.join(line))


*/