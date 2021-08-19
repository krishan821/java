package javacrux;
import java.util.*;
public class Mazepath_D2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n1=sc.nextInt();
	    System.out.print("\n"+ mazepath_D2(0,0,n1,n1,""));
	    }
	    public static int mazepath_D2(int cr,int cc,int er,int ec,String ans)
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
	        int v=mazepath_D2(cr+1,cc,er,ec,ans + "V");
	        int h=mazepath_D2(cr,cc+1,er,ec,ans + "H");
	        int d=0;
	        if(cr==cc || cr+cc==er-1)
	        {
	             d+=mazepath_D2(cr+1,cc+1,er,ec,ans + "D");
	        }
	        return v+h+d;
	    }    
	}
