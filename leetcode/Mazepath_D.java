package javacrux;
import java.util.*;
public class Mazepath_D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n1=sc.nextInt();
	    int n2=sc.nextInt();
	    System.out.print("\n"+ mazepath_d(0,0,n1,n2,""));
	    }
	    public static int mazepath_d(int cr,int cc,int er,int ec,String ans)
	    {
	        if(cr==er-1 && cc==ec-1)
	        {
	            System.out.print(ans+" ");
	            return 1;
	        }
	        if(cr>=er || cc>=ec)
	        {
	            return 0;
	        }
	        int v=mazepath_d(cr+1,cc,er,ec,ans + "V");
	        int h=mazepath_d(cr,cc+1,er,ec,ans + "H");
	        int d=mazepath_d(cr+1,cc+1,er,ec,ans + "D");
	        return v+h+d;
	    }
	}