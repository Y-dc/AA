import java.util.Scanner;
/**
 * 
* <p>Title: SecondTest1</p>  
* <p>Description: 
* Description

Implement pow(A, B) % C.In other words, given A, B and C, find (A^B)%C


Input

The first line of input consists number of the test cases. The following T lines consist of 3 numbers each separated by a space and in the following order:A B C'A' being the base number, 'B' the exponent (power to the base number) and 'C' the modular.Constraints:1 ¡Ü T ¡Ü 70,1 ¡Ü A ¡Ü 10^5,1 ¡Ü B ¡Ü 10^5,1 ¡Ü C ¡Ü 10^5


Output

In each separate line print the modular exponent of the given numbers in the test case.


Sample Input 1 

3
3 2 4
10 9 6
450 768 517
Sample Output 1

1
4
34
* </p>  
* @author ydc   
* @date 2019Äê10ÔÂ17ÈÕ
 */
public class SecondTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
      	int cases = input.nextInt();
      	while(cases>0){
      		cases--;
        	long a = input.nextLong();
          	long b = input.nextLong();
          	long c = input.nextLong();
			long s=1;
          	while(b!=1)
          	{
          		if(b%2==1)
          		{
          			s=s*a;
          			s=s%c;
          		}
          		a=a*a;
          		a=a%c;
          		b=b/2;
          	}
          	System.out.println((s*a)%c);      	
        }
	}

}
