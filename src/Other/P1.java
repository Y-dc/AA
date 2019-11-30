package Other;
/**
 * 
* <p>Title: P1</p>  
* <p>Description:
* Searching_4
Description

Given n Magnets which are placed linearly, with each magnet to be considered as of point object. 
Each magnet suffers force from its left sided magnets such that they repel it to the right and vice 
versa. All forces are repulsive. The force being equal to the distance (1/d , d being the distance). 
Now given the positions of the magnets, the task to find all the points along the linear line where 
net force is ZERO.

Note: Distance have to be calculated with precision of 0.0000000000001.

Constraints:1<=T<=100,1<=N<=100,1<=M[]<=1000

Input

The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. 
The second line of each test case contains an integer N. Then in the next line are N space separated 
values of the array M[], denoting the positions of the magnet.


Output

For each test case in a new line print the space separated points having net force zero till precised two decimal places.
*  </p>  
* @author ydc   
* @date 2019Äê11ÔÂ26ÈÕ
 */

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 def solve(mags):
    res = []
    for i in range(len(mags)-1):
        l, r = mags[i], mags[i+1]
        while True:
            mid = (l+r) / 2
            f = sum(1/(mid-m) for m in mags)
            if round(f, 5) == 0:
                res.append(mid)
                break
            elif f > 0:
                l = mid
            else:
                r = mid
    return res


for _ in range(int(input())):
    input()
    M = list(map(float, input().strip().split()))
    res = solve(M)
    out = ['{:.2f}'.format(loc) for loc in res]
    print(*out)
 */