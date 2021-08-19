package javacrux;
import java.util.*;
public class N_Queen_Problem {

	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    boolean[][]board=new boolean[n][n];
		    nqueen(board,0,"");
	        System.out.println();
		    System.out.print(count);
		    }
		    static int count=0;
		    public static void nqueen(boolean[][]board,int row,String ans)
		    {
		        if(row==board.length)
		        {
	                System.out.print(ans+" ");
		            count++;
		            return;
		        }
		        for(int col=0;col<board.length;col++)
		        {
		            if(is_it_safe(board,row,col))
		            {
		                board[row][col]=true;
		                nqueen(board,row+1,ans + "{" + (row + 1) + "-" + (col + 1) + "} ");
		                board[row][col]=false;
		            }
		        }
		    }
		    public static boolean is_it_safe(boolean[][]board,int row,int col)
		    {
		        int r=row-1;
		        int c=col;
		        while(r>=0)
		        {
		            if(board[r][c])
		            {
		                return false;
		            }
		            r--;
		        }

		        r=row-1;
		        c=col-1;
		        while(r>=0 && c>=0)
		        {
		            if(board[r][c])
		            {
		                return false;
		            }
		            r--;
		            c--;
		        }

		        r=row-1;
		        c=col+1;
		        while(r>=0 && c<board.length)
		        {
		            if(board[r][c])
		            {
		                return false;         
		             }
		            r--;
		            c++;
		        }
		        return true;
		    }

		}