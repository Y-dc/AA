/***
 * 
* <p>Title: FifthTest1</p>  
* <p>Description: </p>  
* 管道网络
Description

Every house in the colony has at most one pipe going into it and at most one pipe going out of it. Tanks and taps are to be installed in a manner such that every house with one outgoing pipe but no incoming pipe gets a tank installed on its roof and every house with only an incoming pipe and no outgoing pipe gets a tap. Find the efficient way for the construction of the network of pipes.


Input

The first line contains an integer T denoting the number of test cases. For each test case, the first line contains two integer n & p denoting the number of houses and number of pipes respectively. Next, p lines contain 3 integer inputs a, b & d, d denoting the diameter of the pipe from the house a to house b.Constraints:1<=T<=50，1<=n<=20，1<=p<=50，1<=a, b<=20，1<=d<=100


Output

For each test case, the output is the number of pairs of tanks and taps installed i.e n followed by n lines that contain three integers: house number of tank, house number of tap and the minimum diameter of pipe between them.


Sample Input 1 

1
9 6
7 4 98
5 9 72
4 6 10
2 8 22
9 7 17
3 1 66
Sample Output 1

3
2 8 22
3 1 66
5 6 10
* @author ydc   
* @date 2019年11月28日
 */
public class FifthTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = readInts(br)[0];
        boolean isFirst = true;
        boolean isPrepEmpty = false;
        for(int testIndex = 0; testIndex < testNum; testIndex++){
            if(isFirst){
                isFirst = false;
            }else {
                if(!isPrepEmpty){
                    System.out.println();
                }
            }
            //solution
            int[] input1 = readInts(br);
            int n = input1[0];
            int p = input1[1];
            int[][] arr = new int[p][3];
            for(int i = 0; i < arr.length; i++){
                arr[i] = readInts(br);
            }
            solve(arr, n, p);
            //print

        }
    }

    static int dfs(int w, int[] wt, int[] cd, int[] ans) {
        if (cd[w] == 0)
            return w;
        if (wt[w] < ans[0])
            ans[0] = wt[w];
        return dfs(cd[w], wt, cd, ans);
    }
    // Function to perform calculations.
    static void solve(int arr[][], int n, int p) {
        int rd[] = new int[1100];
        int wt[] = new int[1100];
        int cd[] = new int[1100];
        int[] ans = new int[1];
        int i = 0;
        while (i < p) {
            int q = arr[i][0];
            int h = arr[i][1];
            int t = arr[i][2];
            cd[q] = h;
            wt[q] = t;
            rd[h] = q;
            i++;
        }
        List <Integer> a=new ArrayList<Integer>();
        List <Integer> b=new ArrayList<Integer>();
        List <Integer> c=new ArrayList<Integer>();
        for (int j = 1; j <= n; ++j) {
   //If a pipe has no ending vertex but has starting vertex i.e is an outgoing pipe then we need to start DFS with this vertex.
            if (rd[j] == 0 && cd[j] > 0) {
                ans[0] = 1000000000;
                int w = dfs(j, wt, cd, ans);

                // We put the details of
                // component in final output
                // array
                a.add(j);
                b.add(w);
                c.add(ans[0]);
            }
        }
        System.out.println(a.size());
        for (int j = 0; j < a.size(); ++j)
            System.out.println(a.get(j) + " "
                    + b.get(j) + " " + c.get(j));
    }
    //IO
    private static String readLine(BufferedReader br){
        try {
            return br.readLine();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    private static String[] readStrings(BufferedReader br){
        String line = readLine(br);
        if(line == null || line.equals("")){
            return new String[0];
        }
        return line.trim().split("( )+");
    }
    private static int[] readInts(BufferedReader br){
        String[] strings = readStrings(br);
        int[] ints = new int[strings.length];
        for(int i = 0; i < strings.length; i++){
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
    private static List<Integer> toArray(int[] src){
        return Arrays.stream(src).boxed().collect(Collectors.toList());
    }
    private static void print(Object[] objs){
        StringBuffer buffer = new StringBuffer();
        for(Object obj: objs){
            buffer.append(obj).append(' ');
        }
        if(buffer.length() > 0) buffer.delete(buffer.length() - 1, buffer.length());
        System.out.print(new String(buffer));
    }
}


*/