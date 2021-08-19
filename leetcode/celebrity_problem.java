package javacrux;
import java.util.*;
public class celebrity_problem {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][]A=new int[n][n];
	for(int i=0;i<A.length;i++)
	{
		for(int j=0;j<A[0].length;j++)
		{
			A[i][j]=sc.nextInt();
		}
	}
	celebrity(A);		

}
public static void celebrity(int[][]A)
{
	Stack<Integer>Stack= new Stack<>();
	for(int i=0;i<A.length;i++)
	{
		Stack.push(i);
	}
	while(Stack.size()>1)
	{
	   int a=Stack.pop();
	   int b=Stack.pop();
	   if(A[a][b]==1)
	   {
		   Stack.push(b);
	   }
	   else {
		   Stack.push(a);
	   }
	}
	int candidate=Stack.pop();
	for(int i=0;i<A.length;i++)
	{
		if(i!=candidate && (A[i][candidate]==0 || A[candidate][i]==1))
		{
			System.out.print("No Celebrity");
		}
		
	}
	System.out.print(candidate);
}

}

