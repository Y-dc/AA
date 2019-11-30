/**
 * 
* <p>Title: FourthHome8</p>  
* <p>Description: </p>  
* 按照数值个数排序
Description

对给定数组中的元素按照元素出现的次数排序，出现次数多的排在前面，如果出现次数相同，则按照数值大小排序。例如，给定数组为{2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}，则排序后结果为{3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}。


Input

输入的第一行为用例个数；后面每一个用例使用两行表示，第一行为数组长度，第二行为数组内容，数组元素间使用空格隔开。


Output

每一个用例的排序结果在一行中输出，元素之间使用空格隔开。


Sample Input 1 

1
4
2 3 2 5
Sample Output 1

2 2 3 5
* @author ydc   
* @date 2019年11月28日
 */
public class FourthHome8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
if __name__ == "__main__":
    for _ in range(int(input())):
        num = int(input())
        arr = list(map(int, input().split()))
        arr = sorted(arr)
        m = {}
        for i in arr:
            if i in m:
                m[i] += 1
            else:
                m[i] = 1
        s = sorted(m, key=m.__getitem__, reverse=True)
        a = []
        for i in s:
            for j in range(m[i]):
                a.append(i)
        a = list(map(str, a))
        print(' '.join(a))

*/