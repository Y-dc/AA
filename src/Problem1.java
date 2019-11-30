/**
 * 
* <p>Title: Problem1</p>  
* <p>Description: 
* 按数值个数排序
Description

Given an array of integers, sort the array according to frequency of elements. 
For example, if the input array is {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}, then modify 
the array to {3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}. If frequencies of two elements are 
same, print them in increasing order.


Input

The first line of input contains an integer T denoting the number of test cases. 
The description of T test cases follows. The first line of each test case contains 
a single integer N denoting the size of array. The second line contains N space-separated 
integers A1, A2, ..., AN denoting the elements of the array.（1 ≤ T ≤ 70；30 ≤ N ≤ 130 ）


Output

Print each sorted array in a seperate line. For each array its numbers should be 
seperated by space.


Sample Input 1 

1
5
5 5 4 6 4 19982 183 23
Sample Output 1

4 4 5 5 6 23 183 19982
* 
* </p>  
* @author ydc   
* @date 2019年9月26日
 */
public class Problem1 {

	public Problem1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/**  c++
#include<iostream>
#include<algorithm>
#include<vector>
#include<map>
using namespace std;

int pick(int arr[],int n){
    int max = 0;
    for(int i = 0;i<n;i++){
        if (arr[max] < arr[i]){
            max=i;
        }
    }
    // arr[max]=0;
    return max;
}

int main(){
    int t=0;
    int n=0;
    cin>>t;
    while(t--){
        cin>>n;
        int cnt = n;
        // map<int,int> myMap;
        int a[3001]={0};
        // int b[60] = {0}
        int ele=0;
        while(n--){
            cin>>ele;
            a[ele+1500]++;
        }
        // sort(a,a+131);
        vector<int> res;
        while(1){
            int mIndex = pick(a,3001);
            if (!mIndex){
                break;
            }
            for(int i=0;i<a[mIndex];i++){
                res.push_back(mIndex-1500);
            }
            a[mIndex]=0;
        }
        for(int i=0;i<res.size();i++){
            cout<<res[i];
            if(i!=res.size()-1){
                cout<<" ";
            }
        }
        cout<<endl;
    }
}
*/
