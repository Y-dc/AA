import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
* <p>Title: Problem11</p>  
* <p>Description:
* 先升后降
Description
从一列不重复的数中筛除尽可能少的数使得从左往右看，这些数是从小到大再从大到小的。
Input
输入第一行为用例个数， 每个测试用例输入是一个数组，数值通过空格隔开。
Output
输出筛选之后的数组，用空格隔开。如果有多种结果，则一行一种结果， 单个输入的所有结果按从小到大排序，排序的key的优先级随index递增而递减 
例如 3 4 7 6； 1 3 7 5； 1 2 7 6； 1 3 7 6 排序成 1 2 7 6；1 3 7 5；1 3 7 6； 3 4 7 6；

用例
输入
4
1 2 4 7 11 10 9 15 3 5 8 6
1 3 5 4 7 6 4 5 3
1 2 3
3 2 1
输出
1 2 4 7 11 10 9 8 6
1 3 4 7 6 4 3
1 3 4 7 6 5 3
1 3 5 7 6 4 3
1 3 5 7 6 5 3
1 2 3
3 2 1
*  </p>  
* @author ydc   
* @date 2019年10月16日
 */
public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases > 0) {
			cases--;
			String[] strings = input.nextLine().split(" ");
			int[] arr = new int[strings.length];
			for(int i=0; i<strings.length; i++) {
				arr[i] = Integer.valueOf(strings[i]);
			}
			FirWay(arr);
		}

	}
	/**
	 * 
	 * <p>Title: FirWay</p>  
	 * <p>Description: </p>  
	 * 动态规划
	 * @param arr
	 */
	public static void FirWay(int[] arr) {
		int[] increase = new int[arr.length];
		int[] decrease = new int[arr.length]; 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[i] &&  increase[j]+1>increase[i]) {
					increase[i] = increase[j]+1;
				}
			}
			//System.out.print(increase[i] + " ");
			
		}
		//System.out.println();
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=arr.length-1; j>i; j--) {
				if(arr[j] < arr[i] &&  decrease[j]+1>decrease[i]) {
					decrease[i] = decrease[j]+1;
				}
			}
			//System.out.print(decrease[i] + " ");
		}
		int lenMax = 0;
		List<Integer> flag = new ArrayList<Integer>(); // 记录最长子数组中最大数的下标
		for(int i=0; i<arr.length; i++) {
			if(lenMax < increase[i]+decrease[i]) {
				lenMax = increase[i] + decrease[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(lenMax == increase[i]+decrease[i]) {
				flag.add(i);
			}
		}

		for(int f=0; f<flag.size(); f++) {
			List<Integer>[] count = new ArrayList[lenMax+1]; //记录子数组各位置符合条件的数的坐标

			for(int i=0;i<arr.length;i++) {
				if(i < flag.get(f)) {

					if(count[increase[i]] == null) {
						List<Integer> a = new ArrayList<>();
						a.add(i);
						count[increase[i]] = a;
					}
					else {
						count[increase[i]].add(i);
					}
				}
				else if(i == flag.get(f)){
					List<Integer> a = new ArrayList<>();
					a.add(i);
					count[increase[i]] = a;
				}
				else {
					if(count[increase[flag.get(f)]+decrease[flag.get(f)]-decrease[i]] == null) {
						List<Integer> a = new ArrayList<>();
						a.add(i);
						count[increase[flag.get(f)]+decrease[flag.get(f)]-decrease[i]] = a;
					}
					else {
						count[increase[flag.get(f)]+decrease[flag.get(f)]-decrease[i]].add(i);
					}
				}
			}//for  +decrease[flag.get(f)]

			int[] kid = new int[lenMax+1];
			printR(count, 0, kid, arr, flag.get(f),increase[flag.get(f)]);
		}//for f   
		
		
	}
	public static void printR(List<Integer>[] count, int i, int[] kid, int[] arr, int top,int tab) {
		if(i < count.length) {
			for(int j=0;j<count[i].size();j++) {
				if(i == 0) {
					kid[i] = count[i].get(count[i].size()-1-j);
					printR(count, i+1, kid, arr, top, tab);
				}
				else if(i<tab && i>0) {
					if(count[i].get(count[i].size()-1-j) > kid[i-1] && arr[count[i].get(count[i].size()-1-j)] < arr[top]) {
						kid[i] = count[i].get(count[i].size()-1-j);
						printR(count, i+1, kid, arr, top, tab);
					}
				}
				else if(i == tab) {
					kid[i] = count[i].get(j);
					printR(count, i+1, kid, arr, top, tab);
				}
				else {
					if(count[i].get(j) > kid[i-1] && arr[count[i].get(j)] < arr[top]) {
						kid[i] = count[i].get(j);
						printR(count, i+1, kid, arr, top, tab);
					}
					else {
						continue;
					}
				}
			}
		}
		if(i == count.length) {
		
			for(int j=0; j<kid.length; j++) {
				if(j != kid.length-1) {
					System.out.print(arr[kid[j]] + " ");
				}
				else {
					System.out.println(arr[kid[j]]);
				}
			}
			return ;
		}
	}

}
/*
import bisect


def get_mid(nums):
    def long_sub(nums):
        stack = []
        lenarr = [0] * len(nums)
        for i, num in enumerate(nums):
            index = bisect.bisect_left(stack, num)
            lenarr[i] = index + 1
            if index >= len(stack):
                stack.append(num)
            else:
                stack[index] = num
        return lenarr

    lenl, lenr = long_sub(nums), long_sub(nums[::-1])[::-1]
    maxlen = max(lenl[i]+lenr[i] for i in range(len(nums)))
    return [i for i in range(len(nums)) if lenl[i]+lenr[i] == maxlen]


def solve(nums):
    def get_all(path, arr, i, res_path):
        if i >= len(arr):
            if not res_path or len(path) > len(res_path[0]):
                res_path.clear()
                res_path.append(path)
            elif len(path) == len(res_path[0]):
                res_path.append(path[::])
            return

        get_all(path, arr, i + 1, res_path)
        if i >= len(arr) or path and path[-1] >= arr[i]:
            return
        get_all(path+[arr[i]], arr, i + 1, res_path)

    ans = set()
    for mid in get_mid(nums):
        subl, subr = nums[:mid+1], nums[mid:][::-1]
        ansl, ansr = [], []
        get_all([], subl, 0, ansl)
        get_all([], subr, 0, ansr)
        ans |= set(' '.join(map(str, l + r[::-1][1:])) for l in ansl for r in ansr)
    return sorted(ans)


for _ in range(int(input())):
    nums = list(map(int, input().split()))
    for ans in solve(nums):
        print(ans)


*/