/**
 * 
* <p>Title: Problem2</p>  
* <p>Description:
* ��С��������
Description

Given an array of N distinct elementsA[ ], find the minimum number of swaps required to sort the array.Your are required to complete the function which returns an integer denoting the minimum number of swaps, required to sort the array.


Input

The first line of input contains an integer T denoting the no of test cases . Then T test cases follow . Each test case contains an integer N denoting the no of element of the array A[ ]. In the next line are N space separated values of the array A[ ] .


Output

For each test case in a new line output will be an integer denoting minimum umber of swaps that are required to sort the array.


Sample Input 1 

2
4
4 3 2 1
5
1 5 4 3 2
Sample Output 1

2
2
* 
*  </p>  
* @author ydc   
* @date 2019��9��26��
 */
public class Problem2 {

	public Problem2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**  python3
 * 
 def min_swaps(nums):
    # mp��¼�������ֵӦ�ڵ���ȷλ��
    mp = {}
    sort_nums = sorted(nums)
    for i in range(len(sort_nums)):
        mp[sort_nums[i]] = i

    # ѭ���ڸ���
    lops = 0
    # ��λ�õ����Ƿ񱻷��ʹ�
    flags = []
    for i in range(len(nums)):
        flags.append(False)
    for i in range(len(nums)):
        if not flags[i]:
            j = i
            while not flags[j]:
                flags[j] = True
                # j�ǵ�ǰֵӦ�ڵ���ȷλ��
                j = mp[nums[j]]
            lops += 1
    return len(nums) - lops


case = int(input().strip())
while case:
    size = int(input().strip())
    nums = list(map(int, input().strip().split()))
    print(min_swaps(nums))
    case -= 1
 */
