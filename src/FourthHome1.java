/**
 * 
* <p>Title: FourthHome1</p>  
* <p>Description: </p>  
* ��������
Description

�Ը�����n��������n����֮��ĳɱ�������ɳɱ���͵����������ԡ�


Input

���룺��һ��Ϊ����������֮��Ϊÿһ�������������ĵ�һ��Ϊ�����������n�������ĵڶ���Ϊʹ�ö��Ÿ�������Ա�������ĳɱ���ÿһ���ɱ�����������Ա��š�������źͳɱ���ʹ�ÿո��������Ա��ź�������Ŷ��Ǵ�1��n����������ų��ֵĴ���û�й̶�����


Output

�����ÿһ���������һ�У������Ϊ1����Ա��ʼ������������������ţ�ʹ�ÿո������ʹ�ö��Ž��������������������Ա�����������Ŵ�С�ţ���һ����Ա��������Ŵ�ķ���ǰ�棬�����ͬ�򿴵ڶ�����Ա�������Դ����ơ�


Sample Input 1 

1
4
2 1 6,1 2 2,1 3 7,1 4 8,1 1 9,2 2 4,2 3 3,2 4 7,3 1 5,3 2 8,3 3 1,3 4 8,4 1 7,4 2 6,4 3 9,4 4 4
Sample Output 1

2 1 3 4
* @author ydc   
* @date 2019��11��28��
 */
public class FourthHome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
def print1():
    for i in range(len(result)):
        for j in range(len(result[0])):
            if i == len(result)-1 and j == len(result[0])-1:
                print(result[i][j])
            elif i != len(result)-1 and j == len(result[0])-1:
                print(result[i][j],end=',')
            else:
                print(result[i][j] , end=' ')

def mysort(sortindex):
    keyset=""
    for i in range(sortindex):
        keyset+= "x["+str(i)+"],"
    keyset = keyset.rstrip(",")
    result.sort(key=lambda x:eval(keyset),reverse=True)

def work( i , count , res_temp):
    global cost
    res_temp_copy = res_temp.copy()
    if i > n :
        if count == cost:
            if res_temp_copy not in result:
                result.append(res_temp_copy)
        if count < cost:
            result.clear()
            result.append(res_temp_copy)
            cost = count
    if count <= cost:
        for j in range(1,n+1):
            if x[j] == 0 :
                res_temp.append(j)
                x[j] = 1
                work(  i + 1 , count+costMatrix[i][j] , res_temp)
                res_temp.pop()
                x[j] = 0



if __name__=='__main__':
    numOfExamples = int(input())
    x = [ 0 for i in range(1000)]
    for c in range(numOfExamples):
        n = int(input())
        costMatrix = [[0 for j in range(n + 1)] for i in range(n + 1)]
        strarray = input().split(',')
        for j in range(0, len(strarray)):
            temp_array = []
            tempArray = strarray[j].split(' ')
            costMatrix[int(tempArray[0])][int(tempArray[1])] = int(tempArray[2])
        # print(costMatrix)
        cost = 0
        res_temp = []
        result = []
        for i in range( 1 , len(costMatrix)):
            cost += costMatrix[i][i]
            res_temp.append(i)
        result.append(res_temp)
        work(1,0, [])
        mysort(len(result[0]))
        print1()

*/