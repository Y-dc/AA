import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
* <p>Title: FifthTest3</p>  
* <p>Description: </p>  
* 时间与收益
Description

Given a set of n jobs where each job i has a deadline and profit associated to it. Each job takes 1 unit of time to complete and only one job can be scheduled at a time. We earn the profit if and only if the job is completed by its deadline. The task is to find the maximum profit and the number of jobs done.


Input

The first line of input contains an integer T denoting the number of test cases.Each test case consist of an integer N denoting the number of jobs and the next line consist of Job id, Deadline and the Profit associated to that Job.

Constraints:1<=T<=100，1<=N<=100，1<=Deadline<=100，1<=Profit<=500


Output

Output the number of jobs done and the maximum profit.


Sample Input 1 

2
4
1 4 20 2 1 10 3 1 40 4 1 30
5
1 2 100 2 1 19 3 2 27 4 1 25 5 1 15
Sample Output 1

2 60
2 127
* @author ydc   
* @date 2019年11月28日
 */
public class FifthTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = Integer.valueOf(input.nextLine());
		while(cases>0) {
			cases--;
			int n = Integer.valueOf(input.nextLine());
			String[] str = input.nextLine().split(" ");
			int[] pro = new int[n];
			int[] deadline = new int[n];
			for(int i=0; i<3*n; i+=3) {
				deadline[i/3] = Integer.valueOf(str[i+1]);
				pro[i/3] = Integer.valueOf(str[i+2]);
			}
			
			
		}
	}
	public static void myway(int n, int[] pro, int[] deadline) {
		List<List[]> jobs = new ArrayList<>();
		List<Integer> de = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(de.indexOf(deadline[i]) == -1) {
				de.add(deadline[i]);
			}
		}
		Collections.sort(de);
		List<Integer> p = new ArrayList<>();
		for(int i=1; i<n+1; i++) {
			for(int j=0;j<n;j++) {
				//if(deadline[i] == )
			}
		}
	}
}
/*
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int n  = sc.nextInt();
            PriorityQueue<Job> jobQ = new PriorityQueue<>();
            for(int i=0;i<n;i++){
                int id = sc.nextInt();
                int deadline = sc.nextInt();
                int profit = sc.nextInt();
                jobQ.add(new Job(id, deadline, profit));
            }
            int count = 0, profit = 0;
            while(!jobQ.isEmpty()){
                Job job = jobQ.poll();
                count++;
                profit += job.profit;
                if (job.deadline == 1){
                    break;
                }
                while(!jobQ.isEmpty() && jobQ.peek().deadline == job.deadline){
                    Job temp = jobQ.poll();
                    temp.deadline--;
                    jobQ.add(temp);
                }
            }
            System.out.println(count + " " + profit);
        }
        sc.close();
    }
}

class Job implements Comparable<Job> {
    int id, deadline, profit;

    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    @Override
    public int compareTo(Job ob) {
        if ( deadline == ob.deadline ){
            return Integer.compare(ob.profit, profit);
        }
        return Integer.compare(ob.deadline, deadline);
    }
}
*/