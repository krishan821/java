package javacrux;
import java.util.*;
public class only_ladder {
	public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[]ladder=ladders(n);
	    System.out.println("\n"+ ladderproblem(n,0,ladder,""));
	    }
	    public static int ladderproblem(int n,int cl,int[]ladder,String ans)
	    {
	        if(cl==n)
	        {
	            System.out.print(ans + "END , ");
	            return 1;
	        }
	        if(cl>n)
	        {
	            return 0;
	        }
	        int count=0;
	        if(ladder[cl]!=0)
	        {
	            count+=ladderproblem(n,ladder[cl],ladder,ans + cl +" ");
	        }
	        else{
	            for(int dice=1;dice<=6;dice++)
	            {
	                count+=ladderproblem(n,cl+dice,ladder,ans + cl +" ");
	            }
	        }
	        return count;
	    }
	    public static int[] primeseive(int n)
	    {
	        int[]prime=new int[n+1];
	        Arrays.fill(prime,1);
	        prime[0]=0;
	        prime[1]=0;
	        for(int i=2;i<prime.length;i++)
	        {
	            if(prime[i]==1)
	            {
	                for(int j=2;j*i<prime.length;j++)
	                {
	                    prime[i*j]=0;
	                }
	            }
	        }
	        return prime;
	    }
	    public static int[] ladders(int n)
	    {
	        int[] prime=primeseive(n);
	        int[] ladder=new int[n+1];
	        int i=0;
	        int j=prime.length-1;
	        while(i<j)
	        {
	            while(prime[i]==0)
	            {
	                i++;
	            }
	            while(prime[j]==0)
	            {
	                j--;
	            }
	            if(i<j)
	            {
	                ladder[i]=j;
	                i++;
	                j--;
	            }
	        }
	        return ladder;
	    }
	}

