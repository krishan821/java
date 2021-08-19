package javacrux;
import java.util.*;
public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    System.out.print("\n"+ mazepath(0,0,n,m,""));
	    }
	    public static int mazepath(int cr,int cc,int er,int ec,String ans)
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
	        int v=mazepath(cr+1,cc,er,ec,ans + "V");
	        int h=mazepath(cr,cc+1,er,ec,ans + "H");
	        
	        return h+v;
	    }
	}
