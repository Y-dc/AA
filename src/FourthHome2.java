/**
 * 
 * 
* <p>Title: FourthHome2</p>  
* <p>Description: </p>  
* KD树构造和查找
Description

对给定的点集合构造KD树，要求如下：将方差最大的维度作为当前的分割维度，将数据集在分割维度上排序后的中位数作为分割点。程序要检索给定点对应的最近的K个点的坐标。


Input

输入第一行为测试用例个数，后面为测试用例，每一个用例包含三行，第一行为点集合（点之间用逗号隔开，两个坐标用空格隔开），第二行为检索的点，第三行为K值。


Output

输出每一个用例的最近K个点，按照距离从小到大的顺序打印。


Sample Input 1 

1
3 5,6 2,5 8,9 3,8 6,1 1,2 9
8.2 4.6
2
Sample Output 1

8 6,9 3
* @author ydc   
* @date 2019年11月28日
 */
public class FourthHome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = Integer.parseInt(sc.nextLine().trim());
        while (nums > 0) {
            nums--;
            String[] input = sc.nextLine().trim().split(",");
            double[] X = new double[input.length];
            double[] Y = new double[input.length];
            for (int i = 0; i < input.length ; i++) {
                String[] strings = input[i].split(" ");
                X[i] = Double.parseDouble(strings[0]);
                Y[i] = Double.parseDouble(strings[1]);
            }
            String[] second = sc.nextLine().trim().split(" ");
            double x = Double.parseDouble(second[0]);
            double y = Double.parseDouble(second[1]);
            int k = Integer.parseInt(sc.nextLine().trim());
            Map<Integer, Double> map = new HashMap<>();
            for (int i = 0; i < X.length; i++) {
                double d = (X[i] - x) * (X[i] - x) + (Y[i] - y) * (Y[i] - y);
                map.put(i, d);
            }
            ArrayList<Map.Entry<Integer, Double>> arrayList = new ArrayList<>(map.entrySet());
            arrayList.sort((o1, o2) -> (int) (o1.getValue()-o2.getValue()));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k ; i++) {
                if((X[arrayList.get(i).getKey()]+"").contains(".0") && (Y[arrayList.get(i).getKey()]+"").contains(".0") ) {
                    sb.append((int)X[arrayList.get(i).getKey()]).append(" ").append((int)Y[arrayList.get(i).getKey()]).append(",");
                }
                else if((X[arrayList.get(i).getKey()]+"").contains(".0") && !(Y[arrayList.get(i).getKey()]+"").contains(".0")){
                    sb.append((int)X[arrayList.get(i).getKey()]).append(" ").append(Y[arrayList.get(i).getKey()]).append(",");
                }else if(!(X[arrayList.get(i).getKey()]+"").contains(".0") && (Y[arrayList.get(i).getKey()]+"").contains(".0")){
                    sb.append(X[arrayList.get(i).getKey()]).append(" ").append((int)Y[arrayList.get(i).getKey()]).append(",");
                }
                else
                sb.append(X[arrayList.get(i).getKey()]).append(" ").append(Y[arrayList.get(i).getKey()]).append(",");
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}


*/