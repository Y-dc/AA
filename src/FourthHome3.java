/**
 * 
* <p>Title: FourthHome3</p>  
* <p>Description: </p>  
* ʵ��Shell����
Description

ʵ��Shell���򣬶Ը������������飬���ո����ļ���仯�������С��ͬ������index�Ĳ����ӡ��������ע�ⲻһ����������������


Input

�����һ�б�ʾ������������������Ϊ����������ÿһ�����������У���һ��Ϊ�������飬�ڶ���Ϊָ�������ÿһ������ÿո������


Output

�����ÿһ��Ϊһ��������Ӧ��ָ����������


Sample Input 1 

1
49 38 65 97 76 13 27 49 55 4
5 3
Sample Output 1

13 4 49 38 27 49 55 65 97 76
* 
* @author ydc   
* @date 2019��11��28��
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