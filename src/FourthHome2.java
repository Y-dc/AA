/**
 * 
 * 
* <p>Title: FourthHome2</p>  
* <p>Description: </p>  
* KD������Ͳ���
Description

�Ը����ĵ㼯�Ϲ���KD����Ҫ�����£�����������ά����Ϊ��ǰ�ķָ�ά�ȣ������ݼ��ڷָ�ά������������λ����Ϊ�ָ�㡣����Ҫ�����������Ӧ�������K��������ꡣ


Input

�����һ��Ϊ������������������Ϊ����������ÿһ�������������У���һ��Ϊ�㼯�ϣ���֮���ö��Ÿ��������������ÿո���������ڶ���Ϊ�����ĵ㣬������ΪKֵ��


Output

���ÿһ�����������K���㣬���վ����С�����˳���ӡ��


Sample Input 1 

1
3 5,6 2,5 8,9 3,8 6,1 1,2 9
8.2 4.6
2
Sample Output 1

8 6,9 3
* @author ydc   
* @date 2019��11��28��
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